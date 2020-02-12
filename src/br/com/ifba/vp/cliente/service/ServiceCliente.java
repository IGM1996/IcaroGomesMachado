/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.cliente.service;

import br.com.ifba.vp.cliente.model.bean.Cliente;
import br.com.ifba.vp.cliente.model.dao.ClienteDAO;
import br.com.ifba.vp.cliente.model.dao.IClienteDAO;
import br.com.ifba.vp.infrastructure.exception.BusinessException;
import static br.com.ifba.vp.produto.service.ServiceProduto.PRODUTO_NULL;
import java.util.List;

/**
 *
 * @author Icaro
 */
public class ServiceCliente implements IServiceCliente{

    //Representa mensagem de erro se o produto for null
    public final static String CLIENTE_NULL = "Cliente null";
    
    //Objeto que faz a comunicação com a camada DAO
    private final IClienteDAO clienteDAO = new ClienteDAO();
    
    //Manda o objeto cliente para ser salvo em Cliente Dao
    @Override
    public Cliente saveCliente(Cliente cliente) {
        if(cliente == null){
            //Tratamento de exceção
            throw new BusinessException(CLIENTE_NULL);
        }
        
        return this.clienteDAO.save(cliente);
    
    }
    
}
