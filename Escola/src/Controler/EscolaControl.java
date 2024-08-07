/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Model.EscolaModel;
import Model.EscolaModelDB;

/**
 *
 * @author HP
 */
public class EscolaControl extends EscolaModel{
    public void addEscola(EscolaModel model){
        model.getId();
        model.getNome();
        model.getPais();
        model.getRegiao();
        model.getLocal();
        model.getTel();
        model.getEmail();
        model.getTurma();
        model.getNiveis();
        
        EscolaModelDB dao = new EscolaModelDB();
        dao.addEscola(model);
                
        
    }
    
}
