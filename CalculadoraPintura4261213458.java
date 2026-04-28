import java.util.Scanner;

public class CalculadoraPintura4261213458 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final double ALTURA_PAREDE = 2.7; // metros
        final double RENDIMENTO_LITRO = 10.0; // metros quadrados por litro
        final double DESCONTO_ABERTURAS - 0.10; // 10% para portas/janelas

        // 1. Entrada de dados
        System.out.println("Digite o comprimento de um dos lados do quarto (em metros): ");
        double lado = teclado.nextDouble();

        // 2. Processamento lógico
        double areaUmaParede = lado * ALTURA_PAREDE;
        double areaTotalParedes = areaUmaParede * 4;

        // Aplicando o desconto de portas e janelas
        double areaLiquida = areaTotalParedes * (1 - DESCONTO_ABERTURAS);

        // Cálculo final de litros
        double litrosNecessarios = areaLiquida / RENDIMENTO_LITRO;

        // 3. Saída de dados formatada
        System.out.println("\n--- Resumo do Orçamento ---");
        System.out.println("Área bruta das paredes: %.2f m2\n", areaTotalParedes);
        System.out.println("Área a ser pintada (com descontos): %.2f m2\n", areaLiquida);
        System.out.println("Total de tinta necessária: %.2f Litros\n", litrosNecessarios);
        System.out.println("----------------------------");


        teclado.close();
    }
}
