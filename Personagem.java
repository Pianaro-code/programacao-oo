public abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;
    public Personagem(String nome, int hp, int ataqueBase){
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }
    public abstract void usarHabilidadeEspecial();

    public void atacar(Personagem inimigo){
        System.out.println(this.nome + "ataca "+ inimigo.nome + " com " + ataqueBase + " de dano.");
        inimigo.defender(ataqueBase);
    }
    public void defender(int dano){
        hp -= dano;
        System.out.println(nome + " recebeu " + dano +"de dano. HP restante" + hp);
    }
    public void status(){
        System.out.println(nome + " - HP: " + hp +" | Ataque: " + ataqueBase);
    }
}
