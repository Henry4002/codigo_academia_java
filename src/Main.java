public class Main{
    public static void main (String[] args){

        //Aqui inicializamos as variáveis.
        int idade = 12;
        boolean estudante = false;
        boolean temCarteirinha = false;
        boolean acompanhado = false;

        /*
        Aqui o bloco if verifica se a variável estudante
        é TRUE |E| se a variavel temCarteirinha também é TRUE,
        se sim, ganha desconto, senão, não ganha.
         */
        System.out.println("|VERIFICAÇÃO DESCONTO|");
            if(estudante && temCarteirinha){
                System.out.println("Você ganha desconto!\n");

            }
            else{
                System.out.println("Você não tem desconto\n");
            }

        System.out.println("|VERIFICAÇÃO EVENTO|");
            if(idade <18 && acompanhado){
                System.out.println("Você entra!");
            }
            else if(idade>=18){
                System.out.println("Você entra!");
            }
            else{
                System.out.println("Voce nao entra!");
            }

             
    }
}