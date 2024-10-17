package baslangic;
import java.util.Scanner;
public class EbobEkokHesabı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ekok = (s1*s2)/ebob
		int sayi,sayac,ebob;
		ebob=0;
		Scanner input= new Scanner(System.in);
		System.out.println("Ebob ve ekoku alınacak sayıyı gir :");
		sayi=input.nextInt();
		sayac=sayi-1;
		while(sayac>=1) {
			if (sayi%sayac==0) {
				ebob=sayac;
				System.out.println("Sayının ebobu :"+ebob);
				break;
			}
			sayac--;
		}
		
	}

}
