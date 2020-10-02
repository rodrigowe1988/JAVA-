
public class CachorroTesteDrive {
	
	public static void main(String[] args) {
		
		Cachorro d = new Cachorro();
		
		d.tamanho = 40;
		d.nome = "Teddy";
		d.raca = "Pastor Alemão";
		
		d.bark();
		System.out.println(d.tamanho);
		System.out.printf("%s é um cachorro da raça %s e seu tamanho é %d.", 
				d.nome, d.raca, d.tamanho);
	}
}
