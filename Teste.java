
public class Teste {
	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		while(x < 5) {
			//y = x - y;   resultado 00 11 21 32 42
			
			//y = y + x;   resultado 00 11 23 36 410	
			
			/*y += 2;	   resultado 02 14 25 36 47
			if(y > 4) {
				y--;
			}*/
			
			/*x++;		   resultado 11 34 59
			y += x;*/
 			
			if(y < 5) {	   //resultado 02 14 36 48
				x++;
				if(y < 3) { 
					x--;
				}
			}
			y +=2;
			
			System.out.print(x + "" + y + " ");
			x++;
		}
	}
}
