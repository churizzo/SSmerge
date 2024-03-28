public class Menu {
    public static void imprimirMenuCadastroUsuarios() {
        System.out.println("Menu de Opções de Cadastro de Usuários:");
        System.out.println("1. Cadastrar novo usuário");
        System.out.println("2. Voltar ao menu principal");
    }

    public static void imprimirMenuListagemUsuarios(ArrayList<Usuario> usuarios) {
        System.out.println("Usuários cadastrados:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
