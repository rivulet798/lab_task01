package com.epam.agency.beans;

import java.io.Serializable;

/**
 * The Identifier is interface used for storage
 * basic information about all the entities of the system.
 * Identifier extends the Serializable interface for enable
 * serializability of child classes.
 *
 * @author      Maryia Kharuzhenka
 * @version     1.0
 */

public interface Identifier extends Serializable {
    /**
     * Method is overridden in all child classes.
     * @return id of the current entity
     */
    int getId();
}
