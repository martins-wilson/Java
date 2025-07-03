import java.util.Scanner;

/**
 * Programa que solicita o tamanho do lado de um quadrado,
 * calcula sua área e exibe o resultado.
 */
public class AreaQuadrado {
    public static void main(String[] args) {
        // Cria uma instância de Scanner para ler a entrada do teclado.
        Scanner leitor = new Scanner(System.in);

        // Solicita e armazena o tamanho do lado.
        // O tipo double é usado para permitir valores decimais.
        System.out.print("Digite o tamanho do lado do quadrado (use vírgula para decimais): ");
        double lado = leitor.nextDouble();

        // Calcula a área multiplicando o lado por ele mesmo.
        double area = lado * lado;

        // Exibe o resultado da área calculada.
        System.out.println("A área do quadrado é: " + area);

        // Fecha o recurso Scanner.
        leitor.close();
    }
}