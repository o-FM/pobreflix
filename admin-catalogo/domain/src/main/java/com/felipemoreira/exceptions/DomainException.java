package com.felipemoreira.exceptions;

import com.felipemoreira.validation.Error;

import java.util.List;

public class DomainException extends RuntimeException {

    private final List<Error> errors;

    private DomainException(List<Error> anErrors) {
        super("", null, true, false);
        this.errors = anErrors;
    }

    /**
     * Metodo Factory da classe DomainException
     */
    public static DomainException with(final List<Error> anErrors) {
        return new DomainException(anErrors);
    }

    public List<Error> getErrors() {
        return errors;
    }
}
