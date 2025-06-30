import java.util.Scanner;

/**
 * Programa que recebe o nome e a idade de duas pessoas
 * e calcula a diferença de idade entre elas, exibindo um valor sempre positivo.
 */
public class DiferencaIdade {
    public static void main(String[] args) {
        // Cria uma instância de Scanner para ler a entrada do teclado.
        Scanner leitor = new Scanner(System.in);

        // Coleta os dados da primeira pessoa.
        System.out.println("--- Dados da Primeira Pessoa ---");
        System.out.print("Digite o nome: ");
        String nome1 = leitor.nextLine();
        System.out.print("Digite a idade: ");
        int idade1 = leitor.nextInt();

        // Consome o caractere de nova linha que sobra após o nextInt().
        // Essencial para a leitura correta do próximo nextLine().
        leitor.nextLine();

        // Coleta os dados da segunda pessoa.
        System.out.println("\n--- Dados da Segunda Pessoa ---");
        System.out.print("Digite o nome: ");
        String nome2 = leitor.nextLine();
        System.out.print("Digite a idade: ");
        int idade2 = leitor.nextInt();

        // Calcula a diferença e usa Math.abs() para garantir que o resultado seja positivo.
        int diferencaAbsoluta = Math.abs(idade1 - idade2);

        // Exibe o resultado final para o usuário.
        System.out.println("\n--- Resultado ---");
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferencaAbsoluta + " anos.");

        // Fecha o recurso Scanner.
        leitor.close();
    }
}