public class Administrador extends Usuario implements Autentical, Gerenciavel, Logavel{
    public Administrador(String login, String senha){
        super(login, senha);
    }

    @Override
    public boolean autenticar(String senha){
        return this.senha.equals(senha);
    }

    @Override
    public void alterarSenha(String novaSenha){
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso.");
    }
    @Override
    public void bloquearUsuario(){
        System.out.println("Usuario bloqueado com sucesso.");
    }
    @Override
    public void resgistrarLog(String operacao){
    System.out.println("Log registrado: "+operacao);
    }
}
