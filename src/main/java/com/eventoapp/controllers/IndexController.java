package com.eventoapp.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController
 */
@Controller
public class IndexController implements ErrorController {
    private static final String PATH = "/error";

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }

}