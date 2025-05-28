public abstract class Usuario {
    private String login;
    protected String senha;

    public Usuario(String login, String senha){
        this.senha = senha;
        this.login = login;
    }
    public void exibirLogin(){
        System.out.println("Login: "+ login);
    }
}
