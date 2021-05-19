package TicTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {
	
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> computadorPositions = new ArrayList<Integer>();

	
	public static void main(String[] args) {
		
		char[][] tabuleiro = {{' ', '|', ' ', '|', ' '},
				{'-', '+', '-','+', '-'},
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '}};
		
		criandoTabuleiro(tabuleiro);
		
		
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Entre com sua posição entre 1 e 9: ");
			int playerPos = scan.nextInt();
			while(playerPositions.contains(playerPos) || computadorPositions.contains(playerPositions)) {
				System.out.println("Posição já está preeenchida. Escolha outra: ");
				playerPos = scan.nextInt();
			}
			
			placePiece(tabuleiro, playerPos, "jogador");
			
			String resultado = checkVencedor();
			if(resultado.length() > 0) {
				System.out.println(resultado);
				break;
			}
			
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
			while(playerPositions.contains(cpuPos) || computadorPositions.contains(cpuPos)) {
				cpuPos = rand.nextInt(9) + 1;
			}
			placePiece(tabuleiro, cpuPos, "computador");
			
			criandoTabuleiro(tabuleiro);
			
			resultado = checkVencedor();
			if(resultado.length() > 0) {
				System.out.println(resultado);
				break;
			}
		
		}
		
	}

	public static void criandoTabuleiro(char[][] tabuleiro) {
		for(char[] row : tabuleiro) {
			for(char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void placePiece(char[][] tabuleiro, int pos, String user) {
		
		char symbol = ' ';
		
		if(user .equals("jogador")) {
			symbol = 'X';
			playerPositions.add(pos);
		} else if(user.equals("computador")) {
			symbol = 'O';
			computadorPositions.add(pos);
		}
		
		switch(pos) {
			case 1:
				tabuleiro[0][0] = symbol;
				break;
			case 2:
				tabuleiro[0][2] = symbol;
				break;
			case 3:
				tabuleiro[0][4] = symbol;
				break;
			case 4:
				tabuleiro[2][0] = symbol;
				break;
			case 5:
				tabuleiro[2][2] = symbol;
				break;
			case 6:
				tabuleiro[2][4] = symbol;
				break;
			case 7:
				tabuleiro[4][0] = symbol;
				break;
			case 8:
				tabuleiro[4][2] = symbol;
				break;
			case 9:
				tabuleiro[4][4] = symbol;
				break;
			default:
				break;
		}
	}
	
	public static String checkVencedor() {
		
		List topLinha = Arrays.asList(1, 2, 3);
		List midLinha = Arrays.asList(4, 5, 6);
		List botLinha = Arrays.asList(7, 8, 9);
		List esqCol = Arrays.asList(1, 4, 7);
		List midCol = Arrays.asList(2, 5, 8);
		List dirCol = Arrays.asList(3, 6, 9);
		List diagonal1 = Arrays.asList(1, 5, 9);
		List diagonal2 = Arrays.asList(3, 5, 7);
		
		List<List> vencendo = new ArrayList<List>();
		vencendo.add(topLinha);
		vencendo.add(midLinha);
		vencendo.add(botLinha);
		vencendo.add(esqCol);
		vencendo.add(midCol);
		vencendo.add(dirCol);
		vencendo.add(diagonal1);
		vencendo.add(diagonal2);
		
		for(List l : vencendo) {
			if(playerPositions.containsAll(l)) {
				return "Parabéns, você ganhou!!!";
			} else if(computadorPositions.containsAll(l)) {
				return "O computador venceu :(";
			} else if(playerPositions.size() + computadorPositions.size() == 9) {
				return "Empate!!!";
			}
		}
		
		
		return "";
	}
}
