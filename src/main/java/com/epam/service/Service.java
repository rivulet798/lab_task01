package com.epam.service;

import com.epam.beans.Identifier;
import com.epam.repository.Repository;

import java.util.List;

public interface Service<T extends Identifier> {
    Repository getRepository();

    default Identifier getEntityById(int id){
        Repository repository = getRepository();
        return repository.getById(id);
    };

    default List<T> getAllEntities(){
        Repository repository = getRepository();
        return repository.getAll();
    };

    default void addEntity(T entity){
        Repository repository = getRepository();
        repository.save(entity);
    };

    default void removeEntity(T entity){
        Repository repository = getRepository();
        repository.remove(entity);
    };
    default void updateEntity(T entity){
        Repository repository = getRepository();
        repository.update(entity);
    };
} 

