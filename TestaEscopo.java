
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 15;
		int quantidadeDePessoas = 1;
		boolean acompanhanteValido = true;
		
		if (idade >= 18 || (quantidadeDePessoas >= 1 && acompanhanteValido)) {
			System.out.println("Seja bem, vindo(a).");
		} else {
			System.out.println("Infelizmente não pode entrar.");
		}
	}
}
