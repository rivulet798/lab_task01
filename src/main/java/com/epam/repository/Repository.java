package com.epam.repository;

import com.epam.beans.Identifier;

import java.util.List;
import java.util.Map;

public interface Repository<T extends Identifier>{
    Map<Integer, T> getDataStorage();

    default void save(T entity){
        Map<Integer, T> dataStorage = getDataStorage();
        dataStorage.put(entity.getId(), entity);
    };

    default void remove(T entity){
        Map<Integer, T> dataStorage = getDataStorage();
        dataStorage.remove(entity.getId(), entity);
    };

    default void update(T entity){
        Map<Integer, T> dataStorage = getDataStorage();
        dataStorage.replace(entity.getId(), entity);
    };

    default T getById(int id){
        Map<Integer, T> dataStorage = getDataStorage();
        return dataStorage.get(id);
    };

    default List<T> getAll(){
        Map<Integer, T> dataStorage = getDataStorage();
        return (List)dataStorage.values();
    };
} 

