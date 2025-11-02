public class CalculoIMC extends Calculo {
    private double peso;
    private double altura;
    private double imc;

    public CalculoIMC(double peso, double altura) {
        super("Cálculo de IMC");
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public void executar() {
        imc = peso / (altura * altura);
    }

    @Override
    public void exibirResultado() {
        System.out.println("Resultado IMC: " + imc);
    }
}
