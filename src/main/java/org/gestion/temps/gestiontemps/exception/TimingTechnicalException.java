package org.gestion.temps.gestiontemps.exception;

import org.zalando.problem.Status;

/**
 * The Class HotelTechnicalException.
 */
public class TimingTechnicalException extends RuntimeException{

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    private final Status httpStatus;

    /**
     * Instantiates a new one logic technical exception.
     */
    public TimingTechnicalException(Status httpStatus) {
        super();
        this.httpStatus=httpStatus;
    }

    /**
     * @param msg
     * @param httpStatus
     */
    public TimingTechnicalException(String msg, Status httpStatus) {
        super(msg);
        this.httpStatus = httpStatus;
    }

    /**
     * @param cause
     * @param httpStatus
     */
    public TimingTechnicalException(Throwable cause, Status httpStatus) {
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

