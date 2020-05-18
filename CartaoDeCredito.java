public class CartaoDeCredito extends Pagamento {
    private String numeroDoCartao;

    public CartaoDeCredito(String n, String c, double v, String ndc) {
        super(n, c, v);
        setNumeroDoCartao(ndc);
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String ndc) {
        numeroDoCartao = ndc;
    }

    public String toString() {
        return "Pagamento com cartão de crédito = Número do cartão: " + numeroDoCartao + "\n" + super.toString() + "\n\n";
    }
}