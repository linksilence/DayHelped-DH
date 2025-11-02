public class CalculoSalarioLiquido extends Calculo {
    private double salarioBruto;
    private double descontos;
    private double beneficios;
    private double salarioLiquido;

    public CalculoSalarioLiquido(double salarioBruto, double descontos, double beneficios) {
        super("Cálculo Salário Líquido");
        this.salarioBruto = salarioBruto;
        this.descontos = descontos;
        this.beneficios = beneficios;
    }

    @Override
    public void executar() {
        salarioLiquido = salarioBruto - descontos + beneficios;
    }

    @Override
    public void exibirResultado() {
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}