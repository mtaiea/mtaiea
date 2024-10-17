package baslangic;
import java.util.Scanner;


public class ScannerTarayıcı {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.println("A değerini giriniz :");
		a = input.nextInt();
		System.out.println("B değerini giriniz :");
		b = input.nextInt();
		System.out.println("Bu iki sayının toplamı "+ (a+b)+" dur/dir");
		input.nextLine(); // burada bunu yazmamızın sebebi input.nextInt çalışınca /n bırakır bizim gariban nextLine bunu yakalar onun için bu boşluğu yakalıyoz burada
		String c,d;
		System.out.println("İsminiz nedir? :");
		c = input.nextLine(); // tüm line yazılanları alır kısaca ne kadar yazarsan o kadar alır
		System.out.println("Sizin isminiz "+c+" gibi gözüküyor.");
		System.out.println("En az 2 kelimelik bişey yaz :");
		d = input.next(); // bu ilk boşluğu gördüğünde durar o zamana kadarki gördüğü kelimeyi yazar
		System.out.println(d+" kelimesi ilk kelimedir");
	}

}
