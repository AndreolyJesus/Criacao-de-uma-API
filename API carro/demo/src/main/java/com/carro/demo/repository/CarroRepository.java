package com.carro.demo.repository;

import com.carro.demo.dataBase.BancoMemoria;
import com.carro.demo.model.Carro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Repository

public class CarroRepository {

    private BancoMemoria bancoMemoria;

    public CarroRepository() {               //<----contrutores
        bancoMemoria = new BancoMemoria();

    }

    public void insere(Carro carro) {
        bancoMemoria.listCarros.add(carro);       //<--- criação do metodo chmando a variavel lista
    }


    public Set<Carro> retornaTudo() {
        return bancoMemoria.listCarros;
    }

    public boolean delete(Carro carro) {

        return bancoMemoria.listCarros.remove(carro);
    }

    public boolean atualizar(Carro carro1) {

        List<Carro> carroList = new ArrayList<>(bancoMemoria.listCarros);   //<--instancia criada pq nao tem no metodo set

        for (int i = 0; i < carroList.size(); i++) {        //<----feito uma interação entre eles

            Carro carro = carroList.get(i);

            if (carro1.getPlaca().equals(carro.getPlaca())) {     //<--feito uma comparaçaõ dos objetos
                carro.setCor(carro1.getCor());
                carro.setModelo(carro1.getModelo());
                carro.setPlaca(carro1.getPlaca());
                break;
            }
        }

        //return bancoMemoria.listCarros.add(carro1);

        return true;
    }
}
