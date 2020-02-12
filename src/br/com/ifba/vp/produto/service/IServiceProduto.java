/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.service;

import br.com.ifba.vp.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author Icaro
 */
public interface IServiceProduto {
    
    //Método que salva o produto na base de dados
    public abstract Produto saveProduto(Produto produto);
    
    //Método que busca um produto por nome da base de dados
    public abstract List <Produto> findByNomeProduto(String produto); 
    
    //Método que busca um produto por codigo de barras da base de dados
    public abstract List <Produto> findByCodigoBarras(long produto); 
    
    //Método que deleta um produto por codogo de barras da base de dados
    public abstract void deleteByCodigoBarras(Produto produtoo); 
    
}
