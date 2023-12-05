package org.example;
import java.util.ArrayList;
import java.util.List;

public class UsuarioFactory {
    public static List<Usuario> criarListaDeUsuarios(int quantidade) {
        List<Usuario> usuarios = new ArrayList<>();
        for (int i = 1; i <= quantidade; i++) {
            usuarios.add(new Usuario("Usuário " + i, "usuario" + i + "@example.com"));
        }
        return usuarios;
    }
}
