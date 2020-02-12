/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.service;

/**
 *
 * @author Icaro
 */
public class Singleton extends Facede{
 
    /**
     * Representa a instância singleton da classe.
     */
    private static Singleton instance;

    /**
     * Monitor de objeto para sincronização.
     */
    private static final Object MONITOR = new Object();
    
    /**
     *Nova instância da classe
     */
    public Singleton() {
        super();
    }
    
    /**
     * Retorne uma nova instância do Facede, se não houver.
     * @return 
     */
    public static Singleton getInstance() {
        synchronized (MONITOR) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
    
}
