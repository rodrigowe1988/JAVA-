
public class GarrafasDeCerveja {
	
	public static void main(String[] args) {
		
		int beerNum = 99;
		String word = "bottles";
		
		if(beerNum == 1) {
			word = "bottle";  //alterar para garrafa no singular
		}
		
		while(beerNum > 0) {
			System.out.println(beerNum + " " + word + " of beer on the wall.");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take on down.");
			System.out.println("Pass it around.");
			beerNum--;	
		
		
			if(beerNum > 0) {
				System.out.println("");
			} else {
				System.out.println("");
				System.out.println("There's no more bottles of beer on the wall.");
			}		
		}
	}
}
