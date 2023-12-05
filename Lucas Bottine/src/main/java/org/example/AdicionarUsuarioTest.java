package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class AdicionarUsuarioTest {

    @Test
    public void adicionarCincoUsuariosDeveFuncionarCorretamente() {
        // Preparação do teste
        AdicionarUsuario gerenciadorUsuarios = new AdicionarUsuario();

        // Adiciona cinco usuários
        List<Usuario> usuarios = UsuarioFactory.criarListaDeUsuarios(5);
        for (Usuario usuario : usuarios) {
            boolean adicaoBemSucedida = gerenciadorUsuarios.adicionarNovoUsuario(usuario);
            Assertions.assertTrue(adicaoBemSucedida, "Falha ao adicionar o usuário " + usuario.getNome());
        }

        // Obter a lista de todos os usuários adicionados
        List<Usuario> usuariosAdicionados = gerenciadorUsuarios.obterTodosUsuarios();
        System.out.println("usuarios" + usuariosAdicionados);

        // Verificação usando asserções do JUnit
        Assertions.assertEquals(5, usuariosAdicionados.size(), "A quantidade de usuários adicionados está incorreta.");
    }
}
