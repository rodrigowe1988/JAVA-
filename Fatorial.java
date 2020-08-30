
public class Fatorial {

	public static void main(String[] args) {
		
		int fatorial = 1;
		for(int contador = 1; contador <= 10; contador++) {
			if(contador == 0 || contador == 1) {
				System.out.println("Fatorial de 0 e 1 tem como resultado 1.");
			}
				fatorial *= contador;
			System.out.println("O resultado fatorial de " + contador + "! = " + fatorial);
		}
	}
}
