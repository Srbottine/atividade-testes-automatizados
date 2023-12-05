package org.example;
import java.util.ArrayList;
import java.util.List;

public class AdicionarUsuario {
    private List<Usuario> usuarios = new ArrayList<>();

    public AdicionarUsuario() {
        this.usuarios = new ArrayList<>();
    }

    public boolean adicionarNovoUsuario(Usuario novoUsuario) {
        // Verificar se o usuário já existe pelo email
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(novoUsuario.getEmail())) {
                return false; // Usuário já existe, a adição falha
            }
        }
        // Se o usuário não existir, adiciona à lista
        usuarios.add(novoUsuario);
        return true; // Usuário adicionado com sucesso
    }

    public List<Usuario> obterTodosUsuarios() {
        return usuarios;
    }


}
