/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.dao;

import br.com.ifba.vp.infrastructure.model.AbstractEntity;

//import javax.persistence.Entity;

/**
 *
 * @author Icaro
 */
public interface IGenericDAO <Entity extends AbstractEntity> {
    
    //Salva uma entidade no banco de dados
    Entity save(Entity obj);
    
    //deleta uma entidade no banco de dados
    void delete(Entity obj);
}
