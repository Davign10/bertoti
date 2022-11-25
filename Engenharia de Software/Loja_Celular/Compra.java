public class Compra {

    private String idCompra;

    private String preco;


    public Compra(String idCompra, String preco) {
        this.idCompra = idCompra;
        this.preco = preco;

    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

}
