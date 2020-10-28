/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import MODEL.ObjetoBase;

/**
 *
 * 
 */
public class PersistenciaJPA<T extends ObjetoBase>{
    private final Class<T> classePersistente;

    public PersistenciaJPA(Class<T> classePersistente) {
        this.classePersistente = classePersistente;
    }
    
    public void salvar(T obj){
        if (obj.getId() > 0) {
            FuncoesJPA.fundir(obj);
        } else {
            FuncoesJPA.persistir(obj);
        }
    }
    
    public void remover(int chave){
        FuncoesJPA.excluir(chave, classePersistente);
    }
    
    public T recuperar(int chave){
        Object obj = FuncoesJPA.recuperar(chave, classePersistente);
        return (T)obj;
    }
    
    public List<T> recupertodos(){
        return (List<T>) FuncoesJPA.selecionar(classePersistente);
    }
}
