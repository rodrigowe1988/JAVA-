
public class EchoTestDrive {

	public static void main(String[] args) {
		
		Echo e1 = new Echo();
		Echo e2 = new Echo();
		
		int x = 0;
		
		while(x < 4) {
			e1.hello();
			x++;
		}
		
		for(x = 0; x < 10; x++) {
			e2.count++;
		}
		System.out.println(e2.count);
		
	}
}
