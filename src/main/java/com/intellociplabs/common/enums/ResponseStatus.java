package com.intellociplabs.common.enums;

public enum ResponseStatus {

    A200("OK"), A500("INTERNAL_SERVER_ERROR"), A600("INVALID_PARAMETER_EXCEPTION"), A422("Already Exist."),
    A400("BAD_REQUEST"), A421("MAC_ADDRESS_NOT_EXIST");

    private final String responseDescription;
    private String exceptionClassName;

    ResponseStatus(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    ResponseStatus(String responseDescription, String exceptionClassName) {
        this.responseDescription = responseDescription;
        this.exceptionClassName = exceptionClassName;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public String getExceptionClassName() {
        return exceptionClassName;
    }

}
