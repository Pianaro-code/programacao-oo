public class ProgramaLogin {
    public static void main(String[] args) {
        Administrador admin = new Administrador("Admin", "admin123");
        Visitante visitante = new Visitante("guest", "qualquer");
        Cliente cliente = new Cliente("joao", "segredo");

        //Administrador
        admin.exibirLogin();
        System.out.println("Autenticação com 'admin': " + admin.autenticar("admin123"));
        System.out.println("Autenticação com 'errada': " + admin.autenticar("errada"));
        admin.alterarSenha("novaSenha");
        admin.bloquearUsuario();
        admin.resgistrarLog("Exclusão de conta");
        System.out.println();

        //Visitante
        visitante.exibirLogin();
        System.out.println();

        //Cliente
        cliente.exibirLogin();
        System.out.println("Autenticação com 'segredo123: " + cliente.autenticar("segredo123"));
        System.out.println("Autenticação com '12345': " + cliente.autenticar("12345"));
    }
}