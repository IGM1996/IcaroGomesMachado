/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.produto.model.dao;

import br.com.ifba.vp.infrastructure.dao.GenericDAO;
import br.com.ifba.vp.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author Icaro
 */
public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO{
    
    //Salva o produto no banco de dados.
    @Override
    public List<Produto> findByNomeProduto(String produto) {
        String query = "select p from Produto p where upper(p.nomeProduto) like upper('" + produto +"%')";
        return GenericDAO.em.createQuery(query).getResultList();
    }

    //Busca o produto por codigo de barras.
    @Override
    public List<Produto> findByCodigoBarras(long produto) {
        String query = "select p from Produto p where upper(p.codigoBarras) like upper('" + produto +"%')";
        return GenericDAO.em.createQuery(query).getResultList();
    }
    
}
