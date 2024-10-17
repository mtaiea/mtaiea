package baslangic;
import java.util.Scanner;
public class WhileOrnekeri2 {

	public static void main(String[] args) {
		// 1.faktöriyel hesaplama
		// 2.harmonik sayılar
		//3.yıldızlar ile üçgen yapma 
		// üslü sayı hesaplama
		
		//1.örnek
		Scanner input= new Scanner(System.in);
		int sayi,toplamfak;
		toplamfak=1;
		System.out.println("Faktoriyeli hesaplanacak sayıyı giriniz  :");
		sayi = input.nextInt();
		while(sayi>1) {
			toplamfak=sayi*toplamfak;
			sayi--;
		}
		System.out.println("Sayının faktöriyeli  : "+toplamfak);
		
		//-----------------------------------
		//2.örnek
		System.out.println("Harmoniği hesaplancak sayıyı gir :");
		double sayiHar=input.nextDouble();
		double toplam=0;
		while(sayiHar>1) {
			toplam=1/sayiHar+toplam;
			sayiHar--;
		}
		System.out.println("Harmokik :"+toplam);
		
		// --------------------------------
		// 3. örnek
		Scanner scan = new Scanner(System.in);
		System.out.println("Yıldız taban sayısını gir :");
		int star = scan.nextInt();
		int i = 1;
		while (i <= star) {
		    int k = 1;
		    while (k <= i) {
		        System.out.print("*");
		        k++;
		    }
		    System.out.println();
		    i++;
		}
		//--------------------------
		//4. örnek 
				System.out.println("Üssü alınacak sayıyı gir (örneğin 4üs4 istiyorsan ilk 4 sonra 3 gir) :");
				int usAltSayı = scan.nextInt();
				System.out.println("Üssü alınacak sayıyı gir (örneğin 4üs4 istiyorsan ilk 4 sonra 3 gir) :");
				int usSayı = scan.nextInt();
				int deg=usAltSayı;
				while(usSayı>=2) {
					usAltSayı=usAltSayı*deg;
					usSayı--;
				}
				System.out.println("Üs almanın sonucu  :"+usAltSayı);
				System.out.println("prınt deg"+deg);
			
		}

	

}
