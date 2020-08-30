
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 15;
		int quantidadeDePessoas = 3;
		boolean acompanhanteValido = false;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos.");
			System.out.println("Seja bem, vindo(a)");
		} else {
			if (quantidadeDePessoas >= 1 && acompanhanteValido == true) {
				System.out.println("Pode entrar por estar acompanhado(a).");
			} else {
				System.out.println("Você tem menos de 18 anos. Infelizmente não pode entrar.");

			}
		}
	}
}