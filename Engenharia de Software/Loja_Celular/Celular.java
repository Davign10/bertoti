public class Celular {

    static Object getCelular(){
        return null;}

    private String idCelular;

    private String marca;

    private String modelo;

    private String cor;


    protected Celular(String idCelular, String marca, String modelo, String cor) {
        super();
        this.idCelular = idCelular;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getIdCelular() {
        return idCelular;
    }

    public void setIdCelular(String estado) {
        this.idCelular = idCelular;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {this.marca = marca;}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
