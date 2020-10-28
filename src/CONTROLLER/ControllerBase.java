/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import DAO.FuncoesJPA;
import DAO.PersistenciaJPA;
import MODEL.ObjetoBase;

/**
 *
 * @author qwerty
 */
public abstract class ControllerBase<T extends ObjetoBase> {

    protected ObjetoBase obj;
    protected Class classe;

    public Boolean inserirGenerico(String dados) {
        try {
            obj.toObjeto(dados);
            System.out.println(obj.toString());
            PersistenciaJPA DAO = new PersistenciaJPA(classe);
            DAO.salvar(obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void deletar(int codigo) {
        PersistenciaJPA DAO = new PersistenciaJPA(classe);
        DAO.remover(codigo);
    }

    public String recuperar(int chave) {
        PersistenciaJPA DAO = new PersistenciaJPA(classe);
        obj = (T) DAO.recuperar(chave);
        String dados = obj.toStringVetor();
        return dados;
    }

    public Boolean atualizar(String dados) {
        try {
            obj.toObjeto(dados);
            PersistenciaJPA DAO = new PersistenciaJPA(classe);
            DAO.salvar(obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    protected void pegarClass() {
        classe = obj.getClass();
        System.out.println(classe);
    }
    
}
