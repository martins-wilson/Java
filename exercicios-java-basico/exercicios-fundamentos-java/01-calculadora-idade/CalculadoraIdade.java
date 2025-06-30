import java.util.Scanner;
import java.time.Year;

/**
 * Programa que solicita o nome e o ano de nascimento do usuário,
 * calcula a idade atual e exibe uma saudação personalizada.
 */
public class CalculadoraIdade {

    public static void main(String[] args) {
        // Cria uma instância de Scanner para ler a entrada do teclado.
        Scanner leitor = new Scanner(System.in);

        // Solicita e armazena o nome do usuário.
        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();

        // Solicita e armazena o ano de nascimento.
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = leitor.nextInt();

        // Obtém o ano corrente do sistema.
        int anoAtual = Year.now().getValue();

        // Calcula a idade subtraindo o ano de nascimento do ano atual.
        int idade = anoAtual - anoNascimento;

        // Exibe a mensagem final formatada para o usuário.
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        // Fecha o recurso Scanner para liberar a memória.
        leitor.close();
    }
}