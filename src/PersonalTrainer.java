import java.util.Scanner;

public class PersonalTrainer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String fichabulking = """
                ==============================
                FICHA DE TREINO – BULKING
                Descanso: Domingo
                ==============================
                
                SEGUNDA – PEITO + TRÍCEPS
                Supino reto – 4x8-10
                Supino inclinado – 3x8-10
                Crucifixo – 3x10-12
                Paralelas – 3x8-10
                Tríceps testa – 3x8-10
                Tríceps pulley – 3x10
                
                TERÇA – COSTAS + BÍCEPS
                Puxada frontal ou barra – 4x6-10
                Remada curvada – 3x8-10
                Remada baixa – 3x10
                Rosca direta – 3x8-10
                Rosca alternada – 3x10
                Rosca martelo – 3x8-10
                
                QUARTA – PERNAS
                Agachamento livre – 4x6-8
                Leg press – 4x10
                Cadeira extensora – 3x12
                Mesa flexora – 3x10
                Panturrilha – 5x12-15
                
                QUINTA – OMBROS + TRAPÉZIO
                Desenvolvimento – 4x8-10
                Elevação lateral – 4x10-12
                Elevação frontal – 3x10
                Remada alta – 3x8-10
                Encolhimento – 4x12
                
                SEXTA – ABDÔMEN
                Abdominal infra – 4x15
                Abdominal supra – 4x20
                Prancha – 4x40s
                
                SÁBADO – BRAÇOS
                Rosca direta – 3x10
                Rosca concentrada – 3x10
                Tríceps corda – 3x12
                Tríceps banco – 3x15
                
                DOMINGO – DESCANSO
                """;
        String fichacorte = """
                ==============================
                FICHA DE TREINO – CORTE
                Descanso: Domingo
                ==============================
                
                SEGUNDA – PEITO + CARDIO
                Supino reto – 3x12-15
                Supino inclinado – 3x12
                Crucifixo – 3x15
                Cardio – 20 min
                
                TERÇA – COSTAS + CARDIO
                Puxada frontal – 3x12-15
                Remada baixa – 3x12
                Remada unilateral – 3x12
                Cardio – 20 min
                
                QUARTA – PERNAS + HIIT
                Agachamento – 3x12
                Leg press – 3x15
                Extensora – 3x15
                Flexora – 3x15
                HIIT – 12-15 min
                
                QUINTA – OMBROS + ABDÔMEN
                Elevação lateral – 3x15
                Desenvolvimento – 3x12
                Elevação frontal – 3x15
                Abdominal infra – 3x15
                Prancha – 3x30s
                
                SEXTA – FULL BODY + CARDIO
                Supino – 3x12
                Remada – 3x12
                Agachamento – 3x15
                Flexão – 3x10
                Cardio – 25 min
                
                SÁBADO – CARDIO + CORE
                Cardio (esteira/bike) – 30-40 min
                Abdominais variados – 15 min
                
                DOMINGO – DESCANSO
                """;
        System.out.println("---------------------------- 💪 BEM-VINDO! 💪 ----------------------------\nEste serviço foi feito especialmente para usuários/novos usuários da academia ******.\nPrecisamos dos seus dados digite os abaixo.");

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
                    ----------- MENU -----------
                    1 - Ganho de massa (bulking)
                    2 - Perda de peso (corte)
                    3 - Sair
                    ----------------------------
                    """;
            System.out.println(menu);

            System.out.print("Insira sua opção: ");
            opcao = input.nextInt();
            String ficha = "";
            if (opcao == 1){
                ficha = fichabulking;
            } else if (opcao == 2) {
                ficha = fichacorte;
            }else{
                ficha = "";
            }
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
                    ----------------------------------------
                    O QUE VOCÊ DESEJA RECEBER?
                    1 - Lista de exercícios + dieta sugerida
                    2 - Somente lista de exercícios
                    ----------------------------------------
                    """;

            int opcao2;
            do {
                System.out.println(menu2);
                System.out.print("Insira sua opção: ");
                opcao2 = input.nextInt();
                if (opcao2 != 1 && opcao2 != 2) {
                    System.out.println("❌ Opção inválida. Tente novamente.");
                }
            } while (opcao2 != 1 && opcao2 != 2);

            int diasTreino;
            do {
                System.out.print("-----------------------------\nCalculasse que para perder/ganhar 5 kilos em 3 meses precisa de 1 hora de treino.\nQuantos dias na semana você deseja treinar (1 a 6)? ");
                diasTreino = input.nextInt();
                if (diasTreino < 1 || diasTreino > 6) {
                    System.out.println("❌ Insira um número entre 1 e 6.");
                }
            } while (diasTreino < 1 || diasTreino > 6);

            System.out.println("\n--- RESUMO ---");
            System.out.printf(
                    "Sua ficha de treino: %s%nNome: %s%nIdade: %d%nObjetivo: %s%nDias de treino por semana: %d%nMensagem motivacional: %s%n\n----------------------------------------\n", ficha, nome.toUpperCase(), idade, objetivo, diasTreino, mensagem
            );

            if (opcao2 == 1) {
                System.out.println("\nVocê receberá exercícios + dieta sugerida.");
            } else {
                System.out.println("Você receberá somente a lista de exercícios.");
            }

            System.out.println("\nVoltando ao menu...\n");
        }

        input.close();
    }
}
