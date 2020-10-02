
public class FraseAleatoria {

	public static void main(String[] args) {
		
		//criando três arrays com palavras que serão selecionadas
		
		String[] listaDePalavrasUm = {"24/7", "várias camadas", "30.000 pés", "B-to-B",
				"todos ganham", "front-end", "baseado na Web", "difundido", "inteligente",
				"seis sigma", "caminho crítico", "dinâmico"};
		
		String[] listaDePalavrasDois = {"habilitado", "adesivo", "valor agregado", "orientado",
				"central", "distribuído", "agrupado", "solidificado", "independente da máquina", 
				"posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado",
				"compartilhado", "cooperativo", "acelerado"};
		String[] listaDePalavrasTres = {"processo", "ponto máximo", "solução", "arquitetura", 
				"habilitação no núcleo", "estratégia", "mindshare", "portal", "espaço", "visão", 
				"paradigma", "missão"};
		
		//descubra quantas palavras existem em cada uma das 3 listas
		int tamanhoDaPrimeira = listaDePalavrasUm.length;
		int tamanhoDaSegunda = listaDePalavrasDois.length;
		int tamanhoDaTerceira = listaDePalavrasTres.length;
		
		
		//gerando 3 números aleatórios e armazenando-os em variáveis
		int aleatorio1 = (int) (Math.random() * tamanhoDaPrimeira);
		int aleatorio2 = (int) (Math.random() * tamanhoDaSegunda);
		int aleatorio3 = (int) (Math.random() * tamanhoDaTerceira);
		
		String fraseAleatoria = listaDePalavrasUm[aleatorio1] + " " + listaDePalavrasDois[aleatorio2] + 
				" " + listaDePalavrasTres[aleatorio3]; 
		
		System.out.println("Precisamos de " + fraseAleatoria);
		
	}
		
}

