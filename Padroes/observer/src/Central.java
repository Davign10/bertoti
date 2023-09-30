import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Central extends Observable {

    private int velocidade;
    private ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

    public void setVelocidade(int velocidade) {
        if (this.velocidade != velocidade) { // Verifica se a velocidade mudou
            this.velocidade = velocidade;
            setChanged();
            notifyObservers(velocidade);
        }
    }

    public void iniciarSimulacao() {
        executor.scheduleAtFixedRate(() -> {
            int novaVelocidade = (int) (Math.random() * 100); // Gera uma nova velocidade aleatória
            setVelocidade(novaVelocidade);
        }, 0, 5, TimeUnit.SECONDS); // Altera a velocidade a cada 5 segundos
    }
}
