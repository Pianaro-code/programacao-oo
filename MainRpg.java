public class MainRpg {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");

        System.out.println("\n--- STATUS INICIAL ---");
        g.status();
        m.status();
        a.status();

        System.out.println("\n--- AÇÕES ---");
        g.atacar(m);
        m.usarHabilidadeEspecial();
        a.usarHabilidadeEspecial();

        System.out.println("\n--- STATUS FINAL ---");
        g.status();
        m.status();
        a.status();
    }
}
