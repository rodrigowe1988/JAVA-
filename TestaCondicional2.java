
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 15;
		int quantidadeDePessoas = 1;
		boolean acompanhanteValido = true;
		// boolean acompanhanteValido = quantidadeDePessoas >= 1;
		// como essa comparação retorna um valor true ou false pode ser usada
		if (idade >= 18 || (quantidadeDePessoas >= 1 && acompanhanteValido)) {
			System.out.println("Seja bem, vindo(a).");
		} else {
			System.out.println("Infelizmente não pode entrar.");
		}
	}
}
