package exercicio01;
import java.util.*;

class SomartresNumeros {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]){
		//Declaracao de variaveis
		int num1, num2, soma, num3;
		//Leituras
		System.out.println("Digite um número");
		num1 = sc.nextInt();
		System.out.println("Digite outro número");
		num2 = sc.nextInt();
		System.out.println("Digite um número");
		num3 = sc.nextInt();
		//Somar
		soma =  num1 +  num2 + num3;
		//Mostrar na tela
		System.out.println("Soma:" + soma);          
		}

}
