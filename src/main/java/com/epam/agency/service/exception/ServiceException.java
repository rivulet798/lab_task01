package com.epam.agency.service.exception;

/**
 * The ServiceException is subclass of class {@code Exception} and a form of
 * {@code Throwable} that indicates conditions on service level that a reasonable
 * application might want to catch.
 *
 * @author      Maryia Kharuzhenka
 * @see     java.lang.Error
 * @version     1.0
 */

public class ServiceException extends Exception {
    private static final long serialVersionUID = 1L;

    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Exception exception) {
        super(exception);
    }

    public ServiceException(String message, Exception exception) {
        super(message, exception);
    }
}
