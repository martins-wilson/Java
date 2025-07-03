import java.util.Scanner;

/**
 * Exibe números pares ou ímpares em um intervalo definido pelo usuário,
 * em ordem decrescente. Demonstra a combinação de laços e condicionais.
 */
public class FiltroDeNumeros {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Coleta o limite inferior do intervalo.
        System.out.print("Digite o primeiro número (o menor do intervalo): ");
        int primeiroNumero = leitor.nextInt();

        int segundoNumero;
        // Utiliza um laço 'do-while' para validar que o segundo número é maior que o primeiro.
        do {
            System.out.print("Digite o segundo número (deve ser MAIOR que o primeiro): ");
            segundoNumero = leitor.nextInt();
            if (segundoNumero <= primeiroNumero) {
                System.out.println("Erro: O segundo número precisa ser maior que o primeiro.");
            }
        } while (segundoNumero <= primeiroNumero);

        // Coleta a escolha do usuário entre par ou ímpar.
        System.out.print("Digite 1 para ver os PARES ou 2 para ver os ÍMPARES: ");
        int escolha = leitor.nextInt();

        System.out.println("\n--- Resultado (em ordem decrescente) ---");

        // Laço 'for' decrescente para iterar do maior número até o menor.
        for (int i = segundoNumero; i >= primeiroNumero; i--) {
            
            boolean ehPar = (i % 2 == 0);
            
            // Lógica condicional aninhada para decidir se o número atual deve ser impresso.
            if ((escolha == 1 && ehPar) || (escolha == 2 && !ehPar)) {
                System.out.println(i);
            }
        }

        leitor.close();
    }
}