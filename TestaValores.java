
public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		//quanto vale o segundo?
		//Em JAVA ele guarda somente o valor na hora que foi chamado
		System.out.println(segundo);
		
	}
}
