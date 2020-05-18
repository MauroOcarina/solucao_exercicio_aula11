public class Boleto extends Pagamento {
    private String numeroDoBoleto;
    private int dia;
    private int mes;
    private int anoDeVencimento;

    public Boleto(String n, String c, double v, String ndb, int d, int m, int adv) {
        super(n, c, v);
        setNumeroDoBoleto(ndb);
        setDia(d);
        setMes(m);
        setAnoDeVencimento(adv);
    }

    public String getNumeroDoBoleto() {
        return numeroDoBoleto;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnoDeVencimento() {
        return anoDeVencimento;
    }

    public void setNumeroDoBoleto(String ndb) {
        numeroDoBoleto = ndb;
    }

    public void setDia(int d) {
        dia = d;
    }

    public void setMes(int m) {
        mes = m;
    }

    public void setAnoDeVencimento(int adv) {
        anoDeVencimento = adv;
    }

    public String toString() {
        return "Pagamento com Boleto = Número do boleto: " + numeroDoBoleto + 
                "\ndia, mês e ano de vencimento: "+ dia + "/" + mes + "/" + anoDeVencimento + "\n" + super.toString() + "\n\n";
    }
}