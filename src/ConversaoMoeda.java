public class ConversaoMoeda extends Calculo {
    private double valorOriginal;
    private double cotacao;
    private double valorConvertido;
    private String moedaOrigem;
    private String moedaDestino;

    public ConversaoMoeda(double valorOriginal, double cotacao, String moedaOrigem, String moedaDestino) {
        super("Conversão de Moeda");
        this.valorOriginal = valorOriginal;
        this.cotacao = cotacao;
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
    }

    @Override
    public void executar() {
        valorConvertido = valorOriginal * cotacao;
    }

    @Override
    public void exibirResultado() {
        System.out.println(valorOriginal + " " + moedaOrigem + " equivalem a " + valorConvertido + " " + moedaDestino + " (Cotação: " + cotacao + ")");
    }
}
