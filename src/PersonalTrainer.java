import java.util.Scanner;

public class PersonalTrainer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("BEM-VINDO! 💪");

        System.out.print("Insira seu nome: ");
        String nome = input.nextLine();

        System.out.print("Insira sua idade: ");
        int idade = input.nextInt();

        String mensagem = "";
        if (idade < 18) {
            mensagem = "Foco no crescimento!";
        } else {
            mensagem = "Foco na consistência!";
        }

        int opcao = 0;

        while (opcao != 3) {

            String menu = """
                    --- MENU ---
                    1 - Ganho de massa (bulking)
                    2 - Perda de peso (corte)
                    3 - Sair
                    """;
            System.out.println(menu);

            System.out.print("Insira sua opção: ");
            opcao = input.nextInt();

            String objetivo = "";

            if (opcao == 1) {
                objetivo = "Ganho de massa (bulking)";
            } else if (opcao == 2) {
                objetivo = "Perda de peso (corte)";
            } else if (opcao == 3) {
                System.out.println("Programa encerrado.");
                break;
            } else {
                System.out.println("Opção inválida.");
                continue;
            }

            String menu2 = """
                    O QUE VOCÊ DESEJA RECEBER?
                    1 - Lista de exercícios + dieta sugerida
                    2 - Somente lista de exercícios
                    """;
            System.out.println(menu2);

            System.out.print("Insira sua opção: ");
            int opcao2 = input.nextInt();

            int diasTreino;
            do {
                System.out.print("Quantos dias na semana você deseja treinar (1 a 6)? ");
                diasTreino = input.nextInt();
                if (diasTreino < 1 || diasTreino > 6) {
                    System.out.println("❌ Insira um número entre 1 e 6.");
                }
            } while (diasTreino < 1 || diasTreino > 6);

            System.out.println("\n--- RESUMO ---");
            System.out.printf(
                    "Nome: %s%nIdade: %d%nObjetivo: %s%nDias de treino por semana: %d%nMensagem motivacional: %s%n",
                    nome.toUpperCase(), idade, objetivo, diasTreino, mensagem
            );

            if (opcao2 == 1) {
                System.out.println("Você receberá exercícios + dieta sugerida.");
            } else if (opcao2 == 2) {
                System.out.println("Você receberá somente a lista de exercícios.");
            } else {
                System.out.println("Opção inválida no segundo menu.");
            }

            System.out.println("\nVoltando ao menu...\n");
        }

        input.close();
    }
}
