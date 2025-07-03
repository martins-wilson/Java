import java.util.Scanner;

/**
 * Lê um número inicial e, em seguida, outros números continuamente.
 * O laço para quando um número não é um múltiplo exato do número inicial.
 * Demonstra o uso de um laço 'while(true)' com controle de fluxo 'break' e 'continue'.
 */
public class ValidadorDeMultiplos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Coleta o número que servirá como divisor base.
        System.out.print("Digite o número inicial (divisor): ");
        int numeroInicial = leitor.nextInt();

        // Inicia um laço que, a princípio, é infinito.
        while (true) {
            System.out.print("\nDigite um novo número para testar: ");
            int numeroAtual = leitor.nextInt();

            // Condição para ignorar a iteração atual se o número for muito pequeno.
            if (numeroAtual < numeroInicial) {
                System.out.println("Número ignorado por ser menor que o inicial.");
                // 'continue' pula para a próxima iteração do laço.
                continue;
            }

            // Condição de parada do laço.
            if (numeroAtual % numeroInicial != 0) {
                System.out.println("Condição de parada atingida: " + numeroAtual + " não é múltiplo de " + numeroInicial + ".");
                // 'break' encerra o laço permanentemente.
                break;
            }

            // Feedback para o usuário se o número for um múltiplo válido.
            System.out.println("Válido. " + numeroAtual + " é um múltiplo. Continuando...");
        }

        // Mensagem final, exibida somente após a saída do laço.
        System.out.println("\nPrograma encerrado.");
        leitor.close();
    }
}