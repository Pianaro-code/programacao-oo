public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 80, 40);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " lança magia causando " + ataqueBase + " de dano.");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        hp -= dano; // defesa fraca
        if (hp < 0) hp = 0;
        System.out.println(nome + " recebe " + dano + " de dano. HP: " + hp);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lança Bola de Fogo! Causa " + (ataqueBase + 20) + " de dano em área.");
    }
}
