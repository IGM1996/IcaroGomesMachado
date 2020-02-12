/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.fornecedor.service;

import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import br.com.ifba.vp.fornecedor.model.dao.FornecedorDAO;
import br.com.ifba.vp.fornecedor.model.dao.IFornecedorDAO;
import br.com.ifba.vp.infrastructure.exception.BusinessException;

/**
 *
 * @author Icaro
 */
public class ServiceFornecedor implements IServiceFornecedor{
    
    //Representa mensagem de erro se o produto for null
    public final static String FORNECEDOR_NULL = "Fornecedor null";
    
    //Objeto que faz a comunicação com a camada DAO
    private final IFornecedorDAO fornecedorDAO = new FornecedorDAO();
    
    //Passa um objeto fornecedor para ser salvo em Fornecedor DAO
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null){
            //Tratamento de exceção
            throw new BusinessException(FORNECEDOR_NULL);
        }
        
        return this.fornecedorDAO.save(fornecedor);
    }
    
}
