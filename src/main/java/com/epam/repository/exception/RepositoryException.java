package com.epam.repository.exception;

public class RepositoryException extends Exception{
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
