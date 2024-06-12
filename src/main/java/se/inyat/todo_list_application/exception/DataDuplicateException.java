package se.inyat.todo_list_application.exception;

public class DataDuplicateException extends RuntimeException {
    public DataDuplicateException(String message) {
        super(message);
    }

    public DataDuplicateException(String message, Throwable cause) {
        super(message, cause);
    }
}