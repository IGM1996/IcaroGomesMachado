/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionariocaixa.model.dao;

import br.com.ifba.vp.funcionariocaixa.model.bean.FuncionarioCaixa;


import br.com.ifba.vp.infrastructure.dao.GenericDAO;
import java.util.List;

/**
 *
 * @author Icaro
 */
public class FuncionarioCaixaDAO extends GenericDAO<FuncionarioCaixa> implements IFuncionarioCaixaDAO{
    
    //Busca funcionario pelo cpf e retorna um objeto
    @Override
    public List<FuncionarioCaixa> findByCpfFuncionario(long CPF) {
        
        String query = "select f from Pessoa f where upper(f.CPF) like upper('" + CPF +"%')";
        return GenericDAO.em.createQuery(query).getResultList();
        
    }
    
    //Busca um funcionario retornando um array
    @Override
    public List<FuncionarioCaixa> Login() {
        String query = "select f from Funcionario f";
        return GenericDAO.em.createQuery(query).getResultList();
    }
          
}
