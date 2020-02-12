/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.funcionariocaixa.service;

import br.com.ifba.vp.funcionariocaixa.model.bean.FuncionarioCaixa;
import br.com.ifba.vp.funcionariocaixa.model.dao.FuncionarioCaixaDAO;
import br.com.ifba.vp.funcionariocaixa.model.dao.IFuncionarioCaixaDAO;
import br.com.ifba.vp.infrastructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author Icaro
 */
public class ServiceFuncionario implements IServiceFuncionario{
 
    //Representa mensagem de erro se o produto for null
    public final static String FUNCIONARIO_NULL = "Funcionario null";
    
    //Objeto que faz a comunicação com a camada DAO
    private final IFuncionarioCaixaDAO funcionarioDAO = new FuncionarioCaixaDAO();
    
    //Envia um objeto funcionario para ser salvo em Funcionario caixa Dao
    @Override
    public FuncionarioCaixa saveFuncionario(FuncionarioCaixa funcionario) {
        if(funcionario == null){
            //Tratamento de exceção
            throw new BusinessException(FUNCIONARIO_NULL);
        }
        
        return this.funcionarioDAO.save(funcionario);
    }
    
    //Busca um objeto funcionario em Funcionario caixa Dao
    @Override
    public List<FuncionarioCaixa> findByCpfFuncionario(long cpf) {

        return this.funcionarioDAO.findByCpfFuncionario(cpf);
    }
    
    //Busca por funcionario para realizar login
    @Override
    public List<FuncionarioCaixa> Login() {
        return this.funcionarioDAO.Login();
    }
    
    
    
}
