package com.mercadolivre.bootcamp.api.controllers;

import com.mercadolivre.bootcamp.api.services.ConversorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/conversor")
public class DecimalParaRomano {

    @Autowired
    private ConversorService conversorService;

    @PostMapping("/romano/{id}")
    @ResponseBody
    public String romano(@PathVariable(name = "id") int id) {

        return conversorService.conversor(id);

    }


}
