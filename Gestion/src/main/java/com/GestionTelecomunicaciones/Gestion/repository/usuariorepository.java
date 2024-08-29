/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.GestionTelecomunicaciones.Gestion.repository;

import com.GestionTelecomunicaciones.Gestion.modell.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Control
 */
public interface usuariorepository extends JpaRepository <usuario, Long>{
//Long es el tipo de dato que va tener mi llave primaria según en el archivo usuario.java    
//se van a traer o heredar los datos de usuario.java y el tipo de dato de mi llave primaria
}
