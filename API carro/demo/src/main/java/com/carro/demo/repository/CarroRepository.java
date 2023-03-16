package com.carro.demo.repository;

import com.carro.demo.dataBase.BancoMemoria;
import com.carro.demo.model.Carro;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class CarroRepository {

    private BancoMemoria bancoMemoria;

    public CarroRepository() {               //<----contrutores
        bancoMemoria = new BancoMemoria();
    }

    public void insere(Carro carro) {
        bancoMemoria.listCarros.add(carro);       //<--- criação do metodo chmando a variavel lista
    }


    public List<Carro> retornaTudo(){
       return bancoMemoria.listCarros;
    }
}
