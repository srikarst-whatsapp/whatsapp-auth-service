package com.whatsapp.whatsappauthservice.exception;

public class UserAlreadyExistsException extends CustomException {

    public UserAlreadyExistsException(String phone) {
        super("User with phone '" + phone + "' already exists in our records");
    }

}