package baslangic;
import java.util.Scanner;
public class KullanıcıGirisiProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String kullanıcı,sifre,dogrulamaKullanıcı,dogrulamaSifre,secim;
		System.out.println("Oluşturulacak hesabınızın kullanıcı adını giriniz :");
		kullanıcı = input.nextLine();
		System.out.println("Oluşturulacak hesabınızın şifresini giriniz :");
		sifre = input.nextLine();
		System.out.println("Başarılı bir şekilde hesabınız oluşturuldu.");
		System.out.println("Hesabınıza giriş yapmak ister misiniz (Girmek için Evet yaznınız) ? :");
		secim = input.nextLine().toUpperCase();
		if (secim.equals("evet".toUpperCase())) {
			 System.out.println("Kullanıcı adını giriniz :");
			 dogrulamaKullanıcı= input.nextLine();
			 System.out.println("Şifrenizi giriniz giriniz :");
			 dogrulamaSifre= input.nextLine();
			 if (dogrulamaKullanıcı.equals(kullanıcı)&dogrulamaSifre.equals(sifre))
			 {System.out.println("Hesaba başarılı bir şekilde giriş yapıldı."); }
			 else {
				 System.out.println("Kullancı adı veya şifre hatalı yada ikisi birden hatalı .");
			 }
			 }
		else {System.out.println("Giriş yapma zaten boşuna yazdık dimi bu kadar kodu");}
		
	}

}
