
public class JogoDeAdivinhacao {

	Jogador p1;				//JogoDeAdivinhacao tem 3 variáveis de instância 	
	Jogador p2;				//para os 3 objetos Jogador
	Jogador p3;

	public void startGame() {
		p1 = new Jogador();	
		p2 = new Jogador();
		p3 = new Jogador();
		
		int guessp1 = 0;
		int guessp2 = 0;	//declara 3 variáveis para armazenar um valor 	
		int guessp3 = 0;	//verdadeiro ou falso baseado na resposta do jogador
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Estou pensando em um número entra 0 e 9...");
		
		while(true) {
			System.out.println("O número a adivinhar é:" + targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("O jogador 1 deu o palpite " + guessp1);
			guessp2 = p2.number;
			System.out.println("O jogador 2 deu o palpite " + guessp2);
			guessp3 = p3.number;
			System.out.println("O jogador 3 deu o palpite " + guessp3);
			
			if(guessp1 == targetNumber) {
				p1isRight = true;
			}
			if(guessp2 == targetNumber) {
				p2isRight = true;
			}
			if(guessp3 == targetNumber) {
				p3isRight = true;
			}
			
			if(p1isRight || p2isRight || p3isRight) {
				System.out.println("Temos um vencedor!");
				System.out.println("O jogador 1 acertou? " + p1isRight);
				System.out.println("O jogador 2 acertou? " + p2isRight);
				System.out.println("O jogador 3 acertou? " + p3isRight);
				System.out.println("Fim do jogo.");
				break;			//fim do jogo, saia do loop

			} else {
				//continuando caso ninguém tenha acertado
				System.out.println("Os jogadores precisam tentar novamente.");
			}
		}
	}
}
