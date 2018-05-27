package com.epam.agency.repository;

import com.epam.agency.beans.Identifier;
import com.epam.agency.repository.exception.RepositoryException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * The Repository is the generic interface
 * which contains CRUD methods and their
 * default realization.
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public interface Repository<T extends Identifier> {
    /**
     *
     * @return a specific map for storing entities
     */
    Map<Integer, T> getDataStorage();

    /**
     * Add entity to the repository.
     *
     * @param entity
     * @throws RepositoryException
     */
    default void add(T entity) throws RepositoryException {
        Map<Integer, T> dataStorage = getDataStorage();
        try {
            dataStorage.put(entity.getId(), entity);
        } catch (NullPointerException | IllegalArgumentException | ClassCastException e) {
            throw new RepositoryException(e.getMessage());
        }
    };

    /**
     * Remove entity from the repository.
     *
     * @param entity
     * @throws RepositoryException
     */
    default void remove(T entity) throws RepositoryException {
        Map<Integer, T> dataStorage = getDataStorage();
        try {
            dataStorage.remove(entity.getId(), entity);
        } catch (NullPointerException | ClassCastException e) {
            throw new RepositoryException(e.getMessage());
        }
    };

    /**
     * Update entity in the repository.
     *
     * @param entity
     * @throws RepositoryException
     */
    default void update(T entity) throws RepositoryException {
        Map<Integer, T> dataStorage = getDataStorage();
        try {
            dataStorage.replace(entity.getId(), entity);
        } catch (NullPointerException | ClassCastException | IllegalArgumentException e) {
            throw new RepositoryException(e.getMessage());
        }
    };

    /**
     * Search entity by id in the repository.
     *
     * @param id of Entity
     * @return object of specific Entity
     * @throws RepositoryException when entity not found
     */
    default T getById(int id) throws RepositoryException {
        Map<Integer, T> dataStorage = getDataStorage();
        try {
            if (dataStorage.get(id) != null) {
                return dataStorage.get(id);
            } else {
                throw new RepositoryException("Entity with such id not found");
            }
        } catch (NullPointerException | ClassCastException | IllegalArgumentException e) {
            throw new RepositoryException(e.getMessage());
        }
    };

    /**
     *
     * @return all entities from the specific repository
     * @throws RepositoryException when repository is empty
     */
    default List<T> getAll() throws RepositoryException {
        Map<Integer, T> dataStorage = getDataStorage();
        List<T> entities = new ArrayList<>(dataStorage.values());
        if (entities != null) {
            return entities;
        } else {
            throw new RepositoryException("List is empty");
        }
    };
} 

