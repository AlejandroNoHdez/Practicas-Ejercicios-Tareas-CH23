package com.generation.cohorte23.jpa.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.cohorte23.jpa.model.UsuarioModel;
import com.generation.cohorte23.jpa.repositories.UsuarioRepositorio;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;

@Service
public class UsuarioServices {

    @Autowired
    UsuarioRepositorio usuarioRepository;
    
    public boolean eliminarUsuario(Long id) {
    	try {
    		usuarioRepository.deleteById(id);
        	return true; 
		} catch (Exception e) {
			return false;
		}
    }

    public ArrayList<UsuarioModel> listarUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
    
    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }
    
     public ArrayList<UsuarioModel> obtenerPorPrioridad (Integer prioridad) {
      return usuarioRepository.findByPrioridad(prioridad); 
      }
     
     public Optional<UsuarioModel> obtenerPorId (Long id){
         return usuarioRepository.findById(id);
     }
}