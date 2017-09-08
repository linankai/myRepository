package com.example.exception;

public class CrowdException extends RuntimeException {
    private String messageText;

    private String code;

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CrowdException(String message) {
        super("");
        this.code = code;
        this.messageText = messageText;
    }
}
