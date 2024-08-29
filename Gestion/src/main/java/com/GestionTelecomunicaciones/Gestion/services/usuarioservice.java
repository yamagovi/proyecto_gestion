/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.GestionTelecomunicaciones.Gestion.services;

import com.GestionTelecomunicaciones.Gestion.modell.usuario;

/**
 *
 * @author Control
 */
// cuatro procesos o servicios que voy a tener
public interface usuarioservice {
    //los componentes los cuales voy a generar la interfaz o servicios que tengo en la aplicación
    usuario newusuario (usuario newusuario); //guardar información
    Iterable<usuario> getAll();//consultar información--getAll me permite tener toda la información de la tabla en la bd
    usuario modifyusuario (usuario usuario_objeto);//modificar información - y el objeto con nombre similar a usuario 
    Boolean deleteusuario (Long iduser);//eliminar información -- el dato booleano me dice falso o verdadero es decir
    // me dice si el usuario existe o no y depende lo elimino.
    //public void deleteusuario (Long iduser);
}
