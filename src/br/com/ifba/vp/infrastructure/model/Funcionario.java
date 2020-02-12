/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.model;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Icaro
 */
//Classe abstrata de onde Funcionario caixa e gerente herdam.
@Entity
public abstract class Funcionario extends Pessoa implements Serializable{
    
    protected String email;
    protected int Senha;
    
    public abstract void CadastroCliente();
    
    public abstract void CadastroProduto();
    
    public abstract void ControleEstoque();
}
