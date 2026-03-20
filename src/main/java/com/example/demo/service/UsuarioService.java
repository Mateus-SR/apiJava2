package com.example.demo.service;

import com.example.demo.model.Usuario;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class UsuarioService {
    private final ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    // listar todos
    public ArrayList<Usuario> listar() {
        return listaUsuarios;
    }
    // buscar por índice
    public Usuario buscarPorIndice(int indice) {
        if (indice < 0 || indice >= listaUsuarios.size()) {
            return null;
        }
        return listaUsuarios.get(indice);
    }
    // adicionar
    public Usuario adicionar(Usuario usuario) {
        listaUsuarios.add(usuario);
        return usuario;
    }
    // atualizar
    public Usuario atualizar(int indice, Usuario usuario) {
        if (indice < 0 || indice >= listaUsuarios.size()) {
            return null;
        }
        listaUsuarios.set(indice, usuario);
        return usuario;
    }
    // deletar
    public boolean deletar(int indice) {
        if (indice < 0 || indice >= listaUsuarios.size()) {
            return false;
        }
        listaUsuarios.remove(indice);
        return true;
    }

}
