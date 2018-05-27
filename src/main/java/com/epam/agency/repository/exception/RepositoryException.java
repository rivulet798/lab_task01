package com.epam.agency.repository.exception;

/**
 * The RepositoryException is subclass of class {@code Exception} and a form of
 * {@code Throwable} that indicates conditions on repository level that a reasonable
 * application might want to catch.
 *
 * @author      Maryia Kharuzhenka
 * @see     java.lang.Error
 * @version     1.0
 */

public class RepositoryException extends Exception {
    private static final long serialVersionUID = 1L;

    public RepositoryException() {
        super();
    }

    public RepositoryException(String message) {
        super(message);
    }

    public RepositoryException(Exception exception) {
        super(exception);
    }

    public RepositoryException(String message, Exception exception) {
        super(message, exception);
    }
}
