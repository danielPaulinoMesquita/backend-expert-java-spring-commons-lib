package br.com.userservice.commonslib.model.exceptions;

public class InternalServerErrorException extends RuntimeException{

    public InternalServerErrorException(String message) {
        super(message);
    }
}
