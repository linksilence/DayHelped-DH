public class CalculoEnergiaEletrica extends Calculo {
    private double consumoKwh;
    private double precoKwh;
    private double custoTotal;

    public CalculoEnergiaEletrica(double consumoKwh, double precoKwh) {
        super("Consumo de Energia Elétrica");
        this.consumoKwh = consumoKwh;
        this.precoKwh = precoKwh;
    }

    @Override
    public void executar() {
        custoTotal = consumoKwh * precoKwh;
    }

    @Override
    public void exibirResultado() {
        System.out.println("Custo Total de Energia Elétrica: " + custoTotal);
    }
}
