import java.util.Scanner;

/**
 * Gera a tabuada de multiplicação de um número fornecido pelo usuário,
 * do 1 ao 10. Demonstra o uso do laço de repetição 'for'.
 */
public class GeradorTabuada {

    public static void main(String[] args) {
        // Cria uma instância de Scanner para ler a entrada do teclado.
        Scanner leitor = new Scanner(System.in);

        // Solicita ao usuário o número para o qual a tabuada será gerada.
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = leitor.nextInt();

        // Exibe um cabeçalho para a saída, melhorando a formatação.
        System.out.println("\n--- Tabuada do " + numero + " ---");

        // Utiliza um laço 'for' para iterar de 1 a 10.
        // A variável 'i' representa o multiplicador em cada passo da tabuada.
        for (int i = 1; i <= 10; i++) {
            // Calcula o produto do número base pelo multiplicador atual.
            int resultado = numero * i;

            // Exibe a linha da tabuada de forma formatada.
            System.out.printf("%d x %d = %d%n", numero, i, resultado);
        }

        // Fecha o recurso Scanner para evitar vazamento de recursos.
        leitor.close();
    }
}