package com.whatsapp.whatsappauthservice.exception;

public class ChatNotFoundException extends RuntimeException {

    public ChatNotFoundException() {
        super("The chat does not exist in our records");
    }

}
