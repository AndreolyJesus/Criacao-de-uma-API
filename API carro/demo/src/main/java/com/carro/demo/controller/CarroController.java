package com.carro.demo.controller;

import com.carro.demo.model.Carro;
import com.carro.demo.service.CarroService;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api")

public class CarroController {

    private CarroService service;


    public CarroController() {           //<----contrutores
        service = new CarroService();
    }

    @PostMapping
    public void insere(@RequestBody Carro carro) {
        service.insere(carro);

    }
    @GetMapping
    public List<Carro> retornaTudo() {
       return service.retornaTudo();

    }
}
