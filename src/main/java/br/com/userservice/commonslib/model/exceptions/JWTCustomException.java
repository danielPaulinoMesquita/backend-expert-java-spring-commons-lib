package br.com.userservice.commonslib.model.exceptions;

public class JWTCustomException extends RuntimeException {
    public JWTCustomException(String message) {
        super(message);
    }
}
