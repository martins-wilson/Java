import java.util.Scanner;

/**
 * Programa que solicita a base e a altura de um retângulo,
 * calcula sua área e exibe o resultado.
 */
public class AreaRetangulo {
    public static void main(String[] args) {
        // Cria uma instância de Scanner para ler a entrada do teclado.
        Scanner leitor = new Scanner(System.in);

        // Solicita e armazena o valor da base.
        System.out.print("Digite o valor da base do retângulo (use vírgula para decimais): ");
        double base = leitor.nextDouble();

        // Solicita e armazena o valor da altura.
        System.out.print("Digite o valor da altura do retângulo (use vírgula para decimais): ");
        double altura = leitor.nextDouble();

        // Calcula a área multiplicando a base pela altura.
        double area = base * altura;

        // Exibe o resultado formatado com duas casas decimais.
        System.out.printf("A área de um retângulo com base %.2f e altura %.2f é: %.2f%n", base, altura, area);

        // Fecha o recurso Scanner.
        leitor.close();
    }
}