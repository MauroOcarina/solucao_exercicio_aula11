public class Cheque extends Pagamento {
    private String numeroDoCheque;

    public Cheque(String n, String c, double v, String chq) {
        super(n, c, v);
        setNumeroDoCheque(chq);
    }

    public String getNumeroDoCheque() {
        return numeroDoCheque;
    }

    public void setNumeroDoCheque(String chq) {
        numeroDoCheque = chq;
    }

    public String toString() {
        return "Pagamento com cheque = Número do cheque: " + numeroDoCheque + "\n" + super.toString() + "\n\n";
    }
}