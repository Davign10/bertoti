public class Teste {

    public static void main(String[] args) {

        Central central = new Central();
        Radar radar = new Radar();

        central.addObserver(radar);

        central.iniciarSimulacao();

    }
}

