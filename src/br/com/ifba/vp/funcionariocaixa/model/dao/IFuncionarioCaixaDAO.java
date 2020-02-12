/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionariocaixa.model.dao;

import br.com.ifba.vp.funcionariocaixa.model.bean.FuncionarioCaixa;
import br.com.ifba.vp.infrastructure.dao.IGenericDAO;
import java.util.List;

/**
 *
 * @author Icaro
 */
public interface IFuncionarioCaixaDAO extends IGenericDAO<FuncionarioCaixa>{
    
    //Busca funcionario pelo cpf
    public abstract List<FuncionarioCaixa> findByCpfFuncionario(long Cpf);
    
    //Busca funcionario pelo objeto
    public List<FuncionarioCaixa> Login();
    
    
}
