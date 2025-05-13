public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 150, 30);
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = ataqueBase;
        System.out.println(nome + " ataca com espada causando " + dano + " de dano.");
        inimigo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2;
        hp -= danoReduzido;
        if (hp < 0) hp = 0;
        System.out.println(nome + " bloqueia com escudo! Dano reduzido para " + danoReduzido + ". HP: " + hp);
    }

    @Override
    public void usarHabilidadeEspecial() {
        int dano = ataqueBase * 2;
        System.out.println(nome + " usa Golpe Duplo! Próximo ataque causará " + dano + " de dano.");
    }
}
