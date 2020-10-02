
public class Jogador {
	
	int number = 0;		//aqui entra o palpite do player
	
	public void guess() {
		number = (int) (Math.random() * 10);
		System.out.println("Estou pensando em " + number);
	}
}
