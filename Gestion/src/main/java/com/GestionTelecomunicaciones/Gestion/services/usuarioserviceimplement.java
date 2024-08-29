/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GestionTelecomunicaciones.Gestion.services;

import com.GestionTelecomunicaciones.Gestion.modell.usuario;
import com.GestionTelecomunicaciones.Gestion.repository.usuariorepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Control
 */
@Service
public class usuarioserviceimplement implements usuarioservice {
    
    //autowired es un apuntador con una variable userrepository 
    @Autowired
    private usuariorepository userrepository;

    @Override
    public usuario newusuario(usuario newusuario) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return userrepository.save(newusuario);
    }

    @Override
    public Iterable<usuario> getAll() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.userrepository.findAll();
    }

    @Override
    public usuario modifyusuario(usuario usuario_objeto) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //en mi clase usuario voy asignar una variable el usuario que se encuentre
        Optional<usuario> usuarioEncontrado = this.userrepository.findById(usuario_objeto.getIduser());
            if(usuarioEncontrado.get()!= null){            
                usuarioEncontrado.get().setNomuser(usuario_objeto.getNomuser());
                usuarioEncontrado.get().setClave(usuario_objeto.getClave());
                return this.newusuario(usuarioEncontrado.get());
            }//creo la variable usuarioEncontrado para que apunte al repositorio userrepository y busque en la bd y se le da la propiedad que encuentre los datos por el Id
            return null;
    }

    @Override
    public Boolean deleteusuario(Long iduser) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.userrepository.deleteById(iduser);
        return true;
    }
    
    
    
}
