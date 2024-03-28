public class main {
    public static void main(String[] args) {
        // Criando usuários
        Usuario usuario1 = new Usuario("João", 25, "joao@example.com", "Rua A, 123", "123456789");
        Usuario usuario2 = new Usuario("Maria", 30, "maria@example.com", "Rua B, 456", "987654321");
        Usuario usuario3 = new Usuario("Pedro", 40, "pedro@example.com", "Rua C, 789", "123123123");

        // Adicionando usuários a uma lista
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        // Imprimindo menu de cadastro de usuários
        Menu.imprimirMenuCadastroUsuarios();

        // Imprimindo usuários após serem criados
        Menu.imprimirMenuListagemUsuarios(usuarios);
    }
}
