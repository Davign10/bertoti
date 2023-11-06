public class Celular {

    private Cpu cpu = null;
    private Memoria memoria = null;
    private Bateria bateria = null;

    public Celular(Cpu cpu,
                   Memoria memoria,
                   Bateria bateria) {
        this.cpu = cpu;
        this.memoria = memoria;
        this.bateria = bateria;
    }

    public void ligarCelular() {
        cpu.start();
        cpu.execute();
        memoria.load();
        bateria.unload();
    }
}
