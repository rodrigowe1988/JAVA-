import java.util.Scanner;

public class ForcandoTiposDeVariaveis {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Digite um número real para ser convertido para inteiro: ");
		
		num1 = (int) input.nextInt();
	
		System.out.printf("O número digitado pelo usuário foi %d", num1);
	}
}
