package com.epam.service;

import com.epam.beans.Identifier;
import com.epam.beans.User;
import com.epam.repository.Repository;
import com.epam.repository.exception.RepositoryException;
import com.epam.service.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public interface Service<T extends Identifier> {
    Logger logger = LoggerFactory.getLogger(Service.class);
    Repository getRepository();

    default Identifier getEntityById(int id) throws ServiceException{
        logger.info("Get entity by id");
        Repository repository = getRepository();
        try {
            return repository.getById(id);
        } catch (RepositoryException e) {
            logger.error(e.getMessage());
            throw new ServiceException(e.getMessage());
        }
    };

    default List<T> getAllEntities() throws ServiceException{
        logger.info("Get all entities");
        Repository repository = getRepository();
        try {
            return repository.getAll();
        } catch (RepositoryException e){
            logger.error(e.getMessage());
            throw new ServiceException(e.getMessage());
        }
    };

    default void addEntity(T entity) throws ServiceException {
        logger.info("Add entity");
        Repository repository = getRepository();
        if(checkExistInternalEntities(entity)) {
            try {
                repository.add(entity);
            } catch (RepositoryException e) {
                logger.error(e.getMessage());
                throw new ServiceException(e.getMessage());
            }
        } else {
            logger.error("The internal entity is not in the repository");
            throw new ServiceException("The internal entity is not in the repository");
        }
    };

    default void removeEntity(T entity) throws RepositoryException{
        Repository repository = getRepository();
        repository.remove(entity);
    };
    default void updateEntity(T entity) throws RepositoryException{
        Repository repository = getRepository();
        repository.update(entity);
    };

    boolean checkExistInternalEntities(T entity);
} 

