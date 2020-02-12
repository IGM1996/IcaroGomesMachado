/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.service;

import br.com.ifba.vp.cliente.model.bean.Cliente;
import br.com.ifba.vp.cliente.service.IServiceCliente;
import br.com.ifba.vp.produto.model.bean.Produto;
import br.com.ifba.vp.produto.service.IServiceProduto;
import br.com.ifba.vp.produto.service.ServiceProduto;
import java.util.List;
import br.com.ifba.vp.cliente.service.ServiceCliente;
import br.com.ifba.vp.fornecedor.model.bean.Fornecedor;
import br.com.ifba.vp.fornecedor.service.IServiceFornecedor;
import br.com.ifba.vp.fornecedor.service.ServiceFornecedor;
import br.com.ifba.vp.funcionariocaixa.model.bean.FuncionarioCaixa;
import br.com.ifba.vp.funcionariocaixa.service.IServiceFuncionario;
import br.com.ifba.vp.funcionariocaixa.service.ServiceFuncionario;
import br.com.ifba.vp.infrastructure.model.Funcionario;

/**
 *
 * @author Icaro
 */
public class Facede implements IFacede {
    
    private final IServiceProduto serviceProduto = new ServiceProduto();
    
    private final IServiceCliente serviceCliente = new ServiceCliente();
    
    private final IServiceFornecedor serviceFornecedor = new ServiceFornecedor();
    
    private final IServiceFuncionario serviceFuncionario = new ServiceFuncionario();
    
    
    //Produto
    @Override
    public Produto saveProduto(Produto produto){
        //Envia a requisição para o metodo save produto em service
        return this.serviceProduto.saveProduto(produto);
    }
    
    @Override
    public List <Produto> findByNomeProduto(String produto){
        //Envia a requisição para o metodo que busca produto por nome em service
        return this.serviceProduto.findByNomeProduto(produto);
    }
    
    @Override
    public List<Produto> findByCodigoBarras(long produto) {
        //Envia a requisição para o metodo que busca produto por codigo de barras em service
        return this.serviceProduto.findByCodigoBarras(produto);
    }
    
    @Override
    public void deleteByCodigoBarras(Produto produto) {
        //Envia a requisição para o metodo apaga produto por codigo de barras em service
        this.serviceProduto.deleteByCodigoBarras(produto);
    }
    
    //Cliente
    @Override
    public Cliente saveCliente(Cliente cliente) {
        //Envia a requisição para o metodo save cliente em service
        return this.serviceCliente.saveCliente(cliente);
    }
    
    //Fornecedor
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        //Envia a requisição para o metodo save fornecedor em service
        return this.serviceFornecedor.saveFornecedor(fornecedor);
    }
    
    //Funcionario
    @Override
    public Funcionario saveFuncionario(FuncionarioCaixa funcionario) {
        //Envia a requisição para o metodo save funcionario em service
        return this.serviceFuncionario.saveFuncionario(funcionario);
    }

    @Override
    public List<FuncionarioCaixa> findByCpfFuncionario(long cpf) {
        //Envia a requisição para o metodo save produto em service
        return this.serviceFuncionario.findByCpfFuncionario(cpf);
    }

    

    

    @Override
    public List<FuncionarioCaixa> Login() {
        return this.serviceFuncionario.Login();
    }

}
