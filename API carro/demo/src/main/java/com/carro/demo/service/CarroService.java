package com.carro.demo.service;

import com.carro.demo.model.Carro;
import com.carro.demo.repository.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CarroService {

    private CarroRepository repository;

    public CarroService() {              //<----contrutores
        repository = new CarroRepository();
    }

    public void insere(Carro carro) {
        repository.insere(carro);
    }

    public List<Carro> retornaTudo() {
       return repository.retornaTudo();
    }
}
