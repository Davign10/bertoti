public class Veiculo {

    private String placa;

    private boolean voar;

    private Locomocao locomocao;

    public void setLocomocao(Locomocao loc) {
        locomocao = loc;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isVoar() {
        return voar;
    }

    public void setVoar(boolean voar) {
        this.voar = voar;
    }

    public Locomocao getLocomocao() {
        return locomocao;
    }

    public void realizarLocomocao(String string) {
        locomocao.locomover(placa);
    }

}
