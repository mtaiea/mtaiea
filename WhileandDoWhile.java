package baslangic;

public class WhileandDoWhile {

	public static void main(String[] args) {
		int i = 1;
		int a = 12;
		while(i<=5) {System.out.println(i+".");
					i++;}
		System.out.println("Döngü bitti.");
		
		do {  // Koşul sağlamasa dahil 1 kere yaptırır do whıle zaten do yap demek
			System.out.println(a);
			a++;
		} while(a<30);
	}

}
