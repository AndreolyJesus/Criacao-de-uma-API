package com.carro.demo.controller;

import com.carro.demo.model.Carro;
import com.carro.demo.service.CarroService;

import org.springframework.web.bind.annotation.*;


import java.util.Set;


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
    public Set<Carro> retornaTudo() {
        return service.retornaTudo();

    }

    @DeleteMapping
    public boolean delete(@RequestBody Carro carro) {
        return service.delete(carro);
    }

    @PatchMapping
    public boolean atualizar(@RequestBody Carro carro) {
        return service.atualizar(carro);
    }

}
