import java.util.Scanner;

class Soma2{
	public static void main(String[ ] args){
	Scanner entrada = new Scanner(System.in);
    int n1 = 0, n2 = 0, soma = 0;

	System.out.println("Digite o primeiro numero: ");
	n1 = entrada.nextInt();
	System.out.println("Digite o segundo numero: ");
	n2 = entrada.nextInt();
    
	System.out.print(n1+ "+"+n2+ "=" +(n1+n2)); 
    entrada.close();
	}
}
