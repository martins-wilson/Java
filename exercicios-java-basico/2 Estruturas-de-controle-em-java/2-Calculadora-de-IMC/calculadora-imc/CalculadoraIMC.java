import java.util.Scanner;

/**
 * Calcula o Índice de Massa Corporal (IMC) e fornece uma classificação
 * com base no resultado, utilizando uma cadeia condicional if-else if-else.
 */
public class CalculadoraIMC {

    public static void main(String[] args) {
        // Cria uma instância de Scanner para ler a entrada do usuário.
        Scanner leitor = new Scanner(System.in);
        
        // Solicita e armazena o peso do usuário.
        System.out.print("Digite seu peso em kg (ex: 68,5): ");
        double peso = leitor.nextDouble();

        // Solicita e armazena a altura do usuário.
        System.out.print("Digite sua altura em metros (ex: 1,75): ");
        double altura = leitor.nextDouble();

        // Calcula o IMC de acordo com a fórmula padrão.
        double imc = peso / (altura * altura);

        // Declara uma variável para armazenar o resultado da classificação.
        String classificacao;

        // Estrutura condicional para determinar a faixa de IMC.
        if (imc <= 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc <= 24.9) {
            classificacao = "Peso ideal";
        } else if (imc <= 29.9) {
            classificacao = "Levemente acima do peso";
        } else if (imc <= 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc <= 39.9) {
            classificacao = "Obesidade Grau II (Severa)";
        } else {
            classificacao = "Obesidade Grau III (Mórbida)";
        }

        // Exibe os resultados finais para o usuário.
        System.out.println("\n--- Seu Resultado ---");
        System.out.printf("Seu IMC é: %.2f%n", imc);
        System.out.println("Classificação: " + classificacao);

        // Fecha o recurso Scanner.
        leitor.close();
    }
}