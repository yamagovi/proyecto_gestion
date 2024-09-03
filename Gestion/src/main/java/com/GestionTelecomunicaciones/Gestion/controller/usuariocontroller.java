/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GestionTelecomunicaciones.Gestion.controller;

import com.GestionTelecomunicaciones.Gestion.modell.usuario;
import com.GestionTelecomunicaciones.Gestion.services.usuarioservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Control
 */
@RestController
@RequestMapping("/usuario")//usuario es el nombre que coloco y va a ser la url con el que voy hacer el llamado en el postman usuario/nuevo etc
@CrossOrigin("*")
public class usuariocontroller {
    @Autowired
    private usuarioservice users;
    
    @PostMapping("/nuevo")//me redirige a la opción de crear el nuevo
    public usuario newusuario (@RequestBody usuario newusuario){
        return this.users.newusuario(newusuario);
    }
    
    @GetMapping("/mostrar") //me muestra los datos ingresados
    public Iterable<usuario> getAll(){
        return users.getAll();
    }   
    
    @PostMapping("/modificar")
    public usuario updateusuario(@RequestBody usuario objeto_usuario){
        return this.users.modifyusuario(objeto_usuario);
    }
        
    //para que el postman lo lea normal y elimine el dato coloco este código
    //@DeleteMapping(value="/{id}")
    //public Boolean deleteusuario(@PathVariable(value="id")Long id){
    //    return this.users.deleteusuario(id);
    //}
    
    //PARA EL FRONTEND COLOCO ESTE CÓDIGO QUE SE COMUNICA CON userservice.js
    //@PostMapping("delete/{id}")
    @DeleteMapping("delete/{id}")
    public void deleteusuario(@PathVariable Long id){
        this.users.deleteusuario(id);
    }
}
