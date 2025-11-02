public class CalculoJurosCompostos extends Calculo {
    private double capital;
    private double taxa;
    private int tempo;
    private double montante;

    public CalculoJurosCompostos(double capital, double taxa, int tempo) {
        super("Juros Compostos");
        this.capital = capital;
        this.taxa = taxa;
        this.tempo = tempo;
    }

    @Override
    public void executar() {
        montante = capital * Math.pow(1 + taxa, tempo);
    }

    @Override
    public void exibirResultado() {
        System.out.println("Montante com Juros Compostos: " + montante);
    }
}
