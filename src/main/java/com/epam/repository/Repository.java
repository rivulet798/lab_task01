package com.epam.repository;

import com.epam.beans.Identifier;
import com.epam.repository.exception.RepositoryException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface Repository<T extends Identifier> {
    Map<Integer, T> getDataStorage();

    default void add(T entity) throws RepositoryException{
        Map<Integer, T> dataStorage = getDataStorage();
        try {
            dataStorage.put(entity.getId(), entity);
        } catch (NullPointerException | IllegalArgumentException | ClassCastException e){
            throw new RepositoryException(e.getMessage());
        }
    };

    default void remove(T entity) throws RepositoryException{
        Map<Integer, T> dataStorage = getDataStorage();
        try {
            dataStorage.remove(entity.getId(), entity);
        } catch (NullPointerException | ClassCastException e){
            throw new RepositoryException(e.getMessage());
        }
    };

    default void update(T entity) throws RepositoryException {
        Map<Integer, T> dataStorage = getDataStorage();
        try {
            dataStorage.replace(entity.getId(), entity);
        } catch (NullPointerException | ClassCastException | IllegalArgumentException e){
            throw new RepositoryException(e.getMessage());
        }
    };

    default T getById(int id) throws RepositoryException{
        Map<Integer, T> dataStorage = getDataStorage();
        try {
            if (dataStorage.get(id) != null) {
                return dataStorage.get(id);
            } else {
                throw new RepositoryException("Entity with such id not found");
            }
        } catch (NullPointerException | ClassCastException | IllegalArgumentException e){
            throw new RepositoryException(e.getMessage());
        }
    };

    default List<T> getAll() throws RepositoryException{
        Map<Integer, T> dataStorage = getDataStorage();
        List<T> entities = new ArrayList<>(dataStorage.values());
        if(entities != null){
            return entities;
        } else{
            throw new RepositoryException("List is empty");
        }
    };
} 

