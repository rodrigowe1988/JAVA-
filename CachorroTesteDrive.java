
public class CachorroTesteDrive {
	
	public static void main(String[] args) {
		
		Cachorro d = new Cachorro();
		
		d.tamanho = 40;
		d.nome = "Teddy";
		d.raca = "Pastor Alem�o";
		
		d.bark();
		System.out.println(d.tamanho);
		System.out.printf("%s � um cachorro da ra�a %s e seu tamanho � %d.", 
				d.nome, d.raca, d.tamanho);
	}
}
