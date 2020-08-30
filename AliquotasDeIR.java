
public class AliquotasDeIR {
	public static void main(String[] args) {
		double salario = 3300.0;
		
		if(salario >= 1900 && salario <= 2800) {
			System.out.println("O IR é de 7.5% e pode deduzir na declaração o valor de R$ 142,00.");
		} else if(salario >= 2800.01 && salario <= 3751) {
			System.out.println("O IR é de 15% e pode deduzir R$350 na declaração.");
		} else if(salario >= 3751.01) {
			System.out.println("O IR é de 22.5% e pode deduzir R$636 na declaração.");
		} else {
			System.out.println("Não há necessidade de fazer a declaração de IR.");
		}
	}
}
