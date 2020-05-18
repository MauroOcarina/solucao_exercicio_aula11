public class Teste {
    public static void main(String [] args) {
        //Pagamento pagamento = new Pagamento("Mauro", "44944944949", 1.555);
        //System.out.println(pagamento.toString());
        CartaoDeCredito cartao = new CartaoDeCredito("Mauro", "449.449.449-49", 1.555, "1001 1001 1001 1001");
        System.out.println(cartao.toString());
        Cheque cheque = new Cheque("Mauro", "449.449.449-49", 1.555, "10011001100110011001100101");
        System.out.println(cheque.toString());
        Boleto boleto = new Boleto("Mauro", "449.449.449-49", 1.555, "32983098239820389342900000321", 10, 05, 2021);
        System.out.println(boleto.toString());
    }
}