package ingjulianvega.ximic.msscasudisease.exception;

import lombok.Getter;

@Getter
public class DiseaseException extends RuntimeException {

    private final String code;

    public DiseaseException(final String code, final String message) {
        super(message);
        this.code = code;
    }
}

