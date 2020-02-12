/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Icaro
 */
//Classe abstrata da qual herdam funcionario, cliente e gerente.
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Pessoa extends AbstractEntity implements Serializable{
    
    protected String Nome;
    protected long Telefone;
    protected int RG;
    protected String Estado;
    protected String Cidade;;
    protected String Rua;
    protected String Bairro;
    protected int Numero;
    protected String Sexo;
    protected long CPF;
    protected int CEP;
    
}
