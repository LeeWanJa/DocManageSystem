package main.java.com.jaewan.docmanagesystem.exception;

import java.io.IOException;

public class UnknownFileTypeException extends IOException {
    public UnknownFileTypeException(){}

    public UnknownFileTypeException(String message) {
        super(message);
    }
}
