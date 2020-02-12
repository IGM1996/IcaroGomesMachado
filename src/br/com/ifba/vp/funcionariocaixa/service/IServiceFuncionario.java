/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionariocaixa.service;

import br.com.ifba.vp.funcionariocaixa.model.bean.FuncionarioCaixa;
import java.util.List;

/**
 *
 * @author Icaro
 */
public interface IServiceFuncionario {
    
    //metodo que salva produto
    public abstract FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionario);
    
    //Método que busca um produto da base de dados
    public abstract List <FuncionarioCaixa> findByCpfFuncionario(long cpf);
    
    //Metodo que reliza loguin de funcionario
    public abstract List <FuncionarioCaixa> Login();
    
}
