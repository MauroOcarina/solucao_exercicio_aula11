public class Pagamento {
    private String nomeDoPagador;
    private String cpf;
    private double valorASerPago;

    public Pagamento(String n, String c, double v) {
        nomeDoPagador = n;
        cpf = c;
        valorASerPago = v;
    }

    public String getNomeDoPagador() {
        return nomeDoPagador;
    }

    public String getCpf() {
        return cpf;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setNomeDoPagador(String n) {
        nomeDoPagador = n;
    }

    public void setCpf(String c) {
        cpf = c;
    }

    public void setValorASerPago(double v) {
        valorASerPago = v;
    }

    public String toString() {
        return "Dados do cliente = Nome: " + nomeDoPagador + "\nCPF: " + cpf + "\nValor a ser pago: " + valorASerPago;
    }
}