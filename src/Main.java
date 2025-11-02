import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Calculo> calculos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- Menu de Cálculos ---");
            System.out.println("1. Calcular Salário Líquido");
            System.out.println("2. Calcular IMC");
            System.out.println("3. Conversão de Moeda");
            System.out.println("4. Juros Simples");
            System.out.println("5. Juros Compostos");
            System.out.println("6. Consumo de Energia Elétrica");
            System.out.println("0. Sair e Exibir Todos Resultados");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Salário bruto: ");
                    double sb = sc.nextDouble();
                    System.out.print("Descontos: ");
                    double d = sc.nextDouble();
                    System.out.print("Benefícios: ");
                    double b = sc.nextDouble();
                    calculos.add(new CalculoSalarioLiquido(sb, d, b));
                    break;
                case 2:
                    System.out.print("Peso (kg): ");
                    double peso = sc.nextDouble();
                    System.out.print("Altura (m): ");
                    double altura = sc.nextDouble();
                    calculos.add(new CalculoIMC(peso, altura));
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Moeda de origem: ");
                    String origem = sc.nextLine();
                    System.out.print("Moeda de destino: ");
                    String destino = sc.nextLine();
                    System.out.print("Valor original: ");
                    double vo = sc.nextDouble();
                    System.out.print("Cotação (quanto vale 1 " + origem + " em " + destino + "): ");
                    double cot = sc.nextDouble();
                    calculos.add(new ConversaoMoeda(vo, cot, origem, destino));
                    break;
                case 4:
                    System.out.print("Capital Inicial: ");
                    double capS = sc.nextDouble();
                    System.out.print("Taxa (ex: 0.05 para 5%): ");
                    double taxaS = sc.nextDouble();
                    System.out.print("Tempo (períodos): ");
                    int tempoS = sc.nextInt();
                    calculos.add(new CalculoJurosSimples(capS, taxaS, tempoS));
                    break;
                case 5:
                    System.out.print("Capital Inicial: ");
                    double capC = sc.nextDouble();
                    System.out.print("Taxa (ex: 0.05 para 5%): ");
                    double taxaC = sc.nextDouble();
                    System.out.print("Tempo (períodos): ");
                    int tempoC = sc.nextInt();
                    calculos.add(new CalculoJurosCompostos(capC, taxaC, tempoC));
                    break;
                case 6:
                    System.out.print("Consumo em kWh: ");
                    double kwh = sc.nextDouble();
                    System.out.print("Preço por kWh: ");
                    double preco = sc.nextDouble();
                    calculos.add(new CalculoEnergiaEletrica(kwh, preco));
                    break;
                case 0:
                    System.out.println("\n--- Resultados dos Cálculos ---");
                    for (Calculo c : calculos) {
                        c.executar();
                        c.exibirResultado();
                        System.out.println("- - -");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
