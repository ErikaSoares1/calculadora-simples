package calculadora;

import java.util.Scanner;

public class Calculadoa_Simples {

	public static void main(String[] args) {
		double n1, n2;
		int  op;
		double soma, subtracao, multiplicacao, divisao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		n1 = entrada.nextDouble();
		System.out.println("Digite o segundo valor:");
		n2 = entrada.nextDouble();
		
		System.out.println("##SELECIONE UMA OPERAÇÃO###");
		System.out.println("{1} - SOMAR");
		System.out.println("{2} - SUBTRAIR");
		System.out.println("{3} - MULTIPLICAR");
		System.out.println("{4} - DIVIDIR");
		op = entrada.nextInt();
		
		switch(op) {
		case 1:
			soma = n1 + n2;
			System.out.println("A soma é: " + soma);
			break;
		case 2:
			subtracao = n1-n2;
			System.out.println("A subtração é:" + subtracao);
			break;
		case 3:
			multiplicacao = n1*n2;
			System.out.println("A multiplicação é:" + multiplicacao);
			break;
		case 4:
			if(n1<n2) {
				System.out.println("Impossivel realizar o calculo");
			}
			else {
				divisao = n1/n2;
				System.out.println("A divisão é:" + divisao);
			}
			break;
			
			default:
				System.out.println("OPERAÇÃO INVÁLIDA !!");
			
			
		}
		
		
	}

}
