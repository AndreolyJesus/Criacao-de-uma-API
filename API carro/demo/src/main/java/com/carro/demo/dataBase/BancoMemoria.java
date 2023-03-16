package com.carro.demo.dataBase;

import com.carro.demo.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class BancoMemoria {
    // {json}
    public List<Carro> listCarros;

    public BancoMemoria() {                  //<---construtor
        listCarros = new ArrayList<>();
    }
}
