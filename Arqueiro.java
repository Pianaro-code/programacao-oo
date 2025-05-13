import java.util.Random;

public class Arqueiro extends Personagem {

    private Random random = new Random();

    public Arqueiro(String nome) {
        super(nome, 100, 25);
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = ataqueBase;
        boolean critico = random.nextDouble() < 0.2;
        if (critico) {
            dano *= 2;
            System.out.println(nome + " ataca com crítico! Dano: " + dano);
        } else {
            System.out.println(nome + " ataca com flecha causando " + dano + " de dano.");
        }
        inimigo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        hp -= dano;
        if (hp < 0) hp = 0;
        System.out.println(nome + " recebe " + dano + " de dano. HP: " + hp);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Chuva de Flechas! Lança 3 ataques consecutivos.");
    }
}
