import java.util.Scanner;

public class CalculadoraPintura4261214227{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final double ALTURA_PAREDE = 2.7;
        final double RENDIMENTO_LITROS = 10.0;
        final double DESCONTO_ABERTURAS = 0.10;


        System.out.println("Digite o comprimento de um dos lados do quarto (em metros): ");
        double lado = entrada.nextDouble();

        double areaUmaParede = lado * ALTURA_PAREDE;
        double areaTotalParedes = areaUmaParede * 4;


        double areaLiquida = areaTotalParedes * (1 - DESCONTO_ABERTURAS);
     
        
        double litrosNecessarios = areaLiquida / RENDIMENTO_LITROS;


        System.out.println("\n---- Resumo do Orçamento ----");
        System.out.printf("Área bruta das paredes: %.2f m²\n", areaTotalParedes);
        System.out.printf("Área a ser pintada (com desconto): %.2f m²\n", areaLiquida);
        System.out.printf("Total de tinta necessaria: %.2f Litros\n",litrosNecessarios);
        System.out.println("---------------------------------------------");


        entrada.close();


    }
}
