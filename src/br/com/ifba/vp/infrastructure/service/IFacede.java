/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.service;

import br.com.ifba.vp.cliente.model.bean.Cliente;
import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import br.com.ifba.vp.funcionariocaixa.model.bean.FuncionarioCaixa;
import br.com.ifba.vp.infrastructure.model.Funcionario;
import br.com.ifba.vp.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author Icaro
 */
public interface IFacede {
    
    //metodos para Produto
    public abstract Produto saveProduto(Produto protudo);
    
    public abstract List <Produto> findByNomeProduto(String produto);
    
    public abstract List <Produto> findByCodigoBarras(long produto);
    
    public abstract void deleteByCodigoBarras(Produto produto);
    
    //Metodos para cliente.
    public abstract Cliente saveCliente(Cliente cliente);
    
    public abstract Fornecedor saveFornecedor(Fornecedor fornecedor);
    
    //Metodos para funcionario
    public abstract Funcionario saveFuncionario(FuncionarioCaixa funcionario);
    
    public abstract List <FuncionarioCaixa> findByCpfFuncionario(long cpf);
    
    //metodo para login
    public abstract List <FuncionarioCaixa> Login();
    
}
