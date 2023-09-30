import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;
import java.util.List;

class Radar implements Observer, MeuObserver {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Central) {
            int velocidade = (int) arg;
            System.out.println("A velocidade atual é: " + velocidade + " km/h.");
        }
    }

    @Override
    public void update(int velocidade) {
        System.out.println("A velocidade atual é: " + velocidade + " km/h.");
    }
}
