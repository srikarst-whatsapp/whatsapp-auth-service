package com.whatsapp.whatsappauthservice.web;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whatsapp.whatsappauthservice.entity.User;
import com.whatsapp.whatsappauthservice.service.UserService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@AllArgsConstructor
@RestController
@RequestMapping("")
public class MainController {

    @GetMapping("")
    public ResponseEntity<String> sayWelcome() {
        return new ResponseEntity<>("Hello and welcome", HttpStatus.CREATED);
    }

}