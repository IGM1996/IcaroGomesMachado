/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.service;

import br.com.ifba.vp.infrastructure.exception.BusinessException;
import br.com.ifba.vp.produto.model.bean.Produto;
import br.com.ifba.vp.produto.model.dao.IProdutoDAO;
import br.com.ifba.vp.produto.model.dao.ProdutoDAO;
import java.util.List;

/**
 *
 * @author Icaro
 */
public class ServiceProduto implements IServiceProduto{
    
    //Representa mensagem de erro se o produto for null
    public final static String PRODUTO_NULL = "Produto null";
    
    //Objeto que faz a comunicação com a camada DAO
    private final IProdutoDAO produtoDAO = new ProdutoDAO();
    
    //Manda a requisição para salvar o produto na camada ProdutoDAO
    @Override
    public Produto saveProduto(Produto produto) {
        
        if(produto == null){
            //Tratamento de exceção
            throw new BusinessException(PRODUTO_NULL);
        }
        
        return this.produtoDAO.save(produto);
    }
    
    //Manda a requisição para buscar o produto por nome na camada ProdutoDAO
    @Override
    public List <Produto> findByNomeProduto(String produto){
        
        return this.produtoDAO.findByNomeProduto(produto);
    }
    
    //Manda a requisição para buscar o produto por codigo de barras na camada ProdutoDAO
    @Override
    public List<Produto> findByCodigoBarras(long produto) {
        return this.produtoDAO.findByCodigoBarras(produto);
    }
    
    //Manda a requisição para deletar o produto por codigo de barras na camada ProdutoDAO
    @Override
    public void deleteByCodigoBarras(Produto produto) {
        if(produto == null){
            //Tratamento de exceção
            throw new BusinessException(PRODUTO_NULL);
        }
        this.produtoDAO.delete(produto);
    }
    
}
