package com.whatsapp.whatsappauthservice.exception;

public class UserNotFoundException extends CustomException {

    public UserNotFoundException(String phone) {
        super("The user with phone '" + phone + "' does not exist in our records");
    }

}