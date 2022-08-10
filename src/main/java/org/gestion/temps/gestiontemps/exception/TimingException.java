package org.gestion.temps.gestiontemps.exception;


import org.zalando.problem.Status;

import java.util.Arrays;
import java.util.List;

/**
 * The Class HotelTechnicalException.
 */
public class TimingException extends Throwable {

    private static final long serialVersionUID = 1L;
    private final Status httpStatus;
    private List<String> messages;


    public TimingException(ErrorInfo errorInfo, String... messages) {
        super(errorInfo.getMessage());
        this.httpStatus = errorInfo.getHttpStatus();
        this.messages = Arrays.asList(messages);
    }

    /**
     * @param msg
     * @param httpStatus
     */
    public TimingException(String msg, Status httpStatus) {
        super(msg);
        this.httpStatus = httpStatus;
    }

    /**
     * @param cause
     * @param httpStatus
     */
    public TimingException(Throwable cause, Status httpStatus) {
        super(cause);
        this.httpStatus = httpStatus;
    }

    /**
     * @return the httpStatus
     */
    public Status getHttpStatus() {
        return httpStatus;
    }


}

