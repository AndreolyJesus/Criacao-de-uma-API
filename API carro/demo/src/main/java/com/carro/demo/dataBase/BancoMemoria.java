package com.carro.demo.dataBase;

import com.carro.demo.model.Carro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BancoMemoria {
    // {json}
    public Set<Carro> listCarros;

    public BancoMemoria() {                  //<---construtor
        listCarros = new HashSet<>();

    }
}
