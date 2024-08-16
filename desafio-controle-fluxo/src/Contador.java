import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numeroUm = terminal.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numeroDois = terminal.nextInt();

        try{
    
            contar(numeroUm, numeroDois);

        } catch(ParametrosInvalidosException exception){

            System.out.println("O segundo numero deve ser maior que o primeiro.");
        }
    }

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException{

        if(numeroUm > numeroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = numeroDois - numeroUm;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o numero: " + i);
        }
    }
}
