package com.epam.travel_agency.service;

import com.epam.travel_agency.beans.Identifier;
import com.epam.travel_agency.repository.Repository;
import com.epam.travel_agency.repository.exception.RepositoryException;
import com.epam.travel_agency.service.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * The Service is the generic interface
 * which contains CRUD methods and their
 * default realization.
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public interface Service<T extends Identifier> {
    Logger logger = LoggerFactory.getLogger(Service.class);

    /**
     *
     * @return a specific repository for storing entities
     */
    Repository getRepository();

    /**
     * Search entity by id in the repository
     *
     * @param id of Entity
     * @return object of specific Entity
     * @throws ServiceException when entity not found
     */
    default Identifier getEntityById(int id) throws ServiceException{
        Repository repository = getRepository();
        logger.info("Get entity by id in class "+repository.getClass());

        try {
            return repository.getById(id);
        } catch (RepositoryException e) {
            logger.error(e.getMessage());
            throw new ServiceException(e.getMessage());
        }
    };

    /**
     *
     * @return all entities from the specific repository
     * @throws ServiceException when repository is empty
     */
    default List<T> getAllEntities() throws ServiceException{
        Repository repository = getRepository();
        logger.info("Get all entities in class " + repository.getClass());

        try {
            return repository.getAll();
        } catch (RepositoryException e){
            logger.error(e.getMessage());
            throw new ServiceException(e.getMessage());
        }
    };

    /**
     * Add entity to the repository
     *
     * @param entity
     * @throws ServiceException when internal entity is not in repository
     */
    default void addEntity(T entity) throws ServiceException {
        Repository repository = getRepository();
        logger.info("Add entity in class " + repository.getClass());
        if(checkExistInternalEntities(entity) && checkUniqueId(repository, entity)) {
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

    /**
     * Remove entity from the repository
     *
     * @param entity
     * @throws ServiceException when there are dependent entities
     */
    default void removeEntity(T entity) throws ServiceException{
        Repository repository = getRepository();
        logger.info("Remove entity in class " + repository.getClass());

        if(!checkExistDependentEntities(entity)) {
            try {
                repository.remove(entity);
            } catch (RepositoryException e) {
                logger.error(e.getMessage());
                throw new ServiceException(e.getMessage());
            }
        } else {
            logger.error("Removal is not possible. First remove or edit the dependent entities");
            throw new ServiceException("Removal is not possible. First remove or edit the dependent entities");
        }

    };

    /**
     * Update entity in the repository
     *
     * @param entity
     * @throws RepositoryException
     */
    default void updateEntity(T entity) throws RepositoryException{
        Repository repository = getRepository();
        logger.info("Update entity in class " + repository.getClass());
        repository.update(entity);
    };

    /**
     *
     * @param repository for check unique id in
     * @param entity the uniqueness of the entity id is checked
     * @return true if id is unique
     * @throws ServiceException when id is not unique
     */
    default boolean checkUniqueId(Repository<T> repository, T entity) throws ServiceException{
        try {
            List<T> entities = repository.getAll();
            for (T entityItem : entities) {
                if (entityItem.getId() == entity.getId()) {
                    throw new ServiceException("Entity with such id already exist");
                }
            }
            return true;
        } catch (RepositoryException e){
            return true;
        }
    }

    /**
     *
     * @param entity
     * @return true if internal entities are in repository, otherwise false
     */
    boolean checkExistInternalEntities(T entity);

    /**
     *
     * @param entity
     * @return true if dependent entities are exist, otherwise false
     */
    boolean checkExistDependentEntities(T entity);

} 

