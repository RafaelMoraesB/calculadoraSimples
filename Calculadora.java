package CalculadoraSimples;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {

        double n1, n2;
        double soma, subtracao, multiplicacao, divisao;
        int op;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o 1º valor: ");
        n1 = leitor.nextDouble();

        System.out.println("Informa o 2º valor: ");
        n2 = leitor.nextDouble();

        System.out.println("Selecione uma operação: ");
        System.out.println("[1] para somar");
        System.out.println("[2] para subtrair");
        System.out.println("[3] para multiplicar");
        System.out.println("[4] para dividir");
        System.out.println("Digite a opção desejada: ");

        op = leitor.nextInt();

        switch(op){ //EXECUTA UMA DECLARAÇÃO VINDA DE MULTIPLAS CONSIÇÕES
            case 1:
                soma = n1+n2;
                System.out.println("A soma dos valores é "+soma);
                break; //PARA REALIZAR SOMENTE UMA OPERAÇÃO

            case 2:
                subtracao = n1-n2;
                System.out.println("A subtração dos valores é: " + subtracao);
                break;

            case 3:
                multiplicacao = n1*n2;
                System.out.println("A multiplicação dos valores é: "+multiplicacao);
                break;

            case 4:
                divisao = n1/n2;
                System.out.println("A divisão dos valores é: "+divisao);
                break;
        }



    }
}
