public class Compra {

    protected String idCompra;

    protected String preco;


    public Compra(String idCompra, String preco) {
        super();
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
