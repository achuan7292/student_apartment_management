package com.admin.domain;

public class Result {
    private boolean isSuccess;
    private String message;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result(boolean isSuccess, String message) {
        this.isSuccess = isSuccess;
        this.message = message;
    }
}
