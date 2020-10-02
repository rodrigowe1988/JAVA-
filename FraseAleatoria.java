
public class FraseAleatoria {

	public static void main(String[] args) {
		
		//criando tr�s arrays com palavras que ser�o selecionadas
		
		String[] listaDePalavrasUm = {"24/7", "v�rias camadas", "30.000 p�s", "B-to-B",
				"todos ganham", "front-end", "baseado na Web", "difundido", "inteligente",
				"seis sigma", "caminho cr�tico", "din�mico"};
		
		String[] listaDePalavrasDois = {"habilitado", "adesivo", "valor agregado", "orientado",
				"central", "distribu�do", "agrupado", "solidificado", "independente da m�quina", 
				"posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado",
				"compartilhado", "cooperativo", "acelerado"};
		String[] listaDePalavrasTres = {"processo", "ponto m�ximo", "solu��o", "arquitetura", 
				"habilita��o no n�cleo", "estrat�gia", "mindshare", "portal", "espa�o", "vis�o", 
				"paradigma", "miss�o"};
		
		//descubra quantas palavras existem em cada uma das 3 listas
		int tamanhoDaPrimeira = listaDePalavrasUm.length;
		int tamanhoDaSegunda = listaDePalavrasDois.length;
		int tamanhoDaTerceira = listaDePalavrasTres.length;
		
		
		//gerando 3 n�meros aleat�rios e armazenando-os em vari�veis
		int aleatorio1 = (int) (Math.random() * tamanhoDaPrimeira);
		int aleatorio2 = (int) (Math.random() * tamanhoDaSegunda);
		int aleatorio3 = (int) (Math.random() * tamanhoDaTerceira);
		
		String fraseAleatoria = listaDePalavrasUm[aleatorio1] + " " + listaDePalavrasDois[aleatorio2] + 
				" " + listaDePalavrasTres[aleatorio3]; 
		
		System.out.println("Precisamos de " + fraseAleatoria);
		
	}
		
}

