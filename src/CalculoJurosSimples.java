public class CalculoJurosSimples extends Calculo {
    private double capital;
    private double taxa;
    private int tempo;
    private double juros;

    public CalculoJurosSimples(double capital, double taxa, int tempo) {
        super("Juros Simples");
        this.capital = capital;
        this.taxa = taxa;
        this.tempo = tempo;
    }

    @Override
    public void executar() {
        juros = capital * taxa * tempo;
    }

    @Override
    public void exibirResultado() {
        System.out.println("Juros Simples: " + juros);
    }
}