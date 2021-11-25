package strategy;

public class Main {

    public static void main(String[] args) {
        // variação de comportamento

        Comportamento normal = new ComportamentoNormal ();
        Comportamento defensivo = new ComportamentoDefensivo ();
        Comportamento agressivo = new ComportamentoAgressivo ();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();


    }
}
