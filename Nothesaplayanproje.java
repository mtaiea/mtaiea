package baslangic;
import java.util.Scanner;

public class Nothesaplayanproje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("    Not Ortalaması Hesaplayıcıya Hoşgeldiniz  ");
		double a,b,c,ortalama ;
		System.out.println("1.vizenin notunu giriniz :  ");
		a = input.nextInt();
		System.out.println("2.vizenin notunu giriniz :  ");
		b = input.nextInt();
		System.out.println("Final notunu giriniz :  ");
		c = input.nextInt();
		ortalama = ((a*0.3)+(b*0.3)+(c*0.4));
		System.out.println("Not ortalamanız :");
		System.out.println(ortalama);
		String sonuc = (ortalama>=40) ? "Dersi başarılı bir şekilde geçtiniz":"Malesef dersten kaldınız";
		System.out.println(sonuc);
	}

}
