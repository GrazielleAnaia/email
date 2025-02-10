package com.grazielleanaia.enviaemail.infrastructure.exception;

public class EmailException extends RuntimeException {
    public EmailException(String mensagem) {
        super(mensagem);
    }

    public EmailException(String mensagem, Throwable throwable) {
        super(mensagem, throwable);
    }
}
