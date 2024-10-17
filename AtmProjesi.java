package baslangic;
import java.util.Scanner;
public class AtmProjesi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cekme,yatırma,bakiye;
		String kullanıcı,sifre,dogrulamaKullanıcı,dogrulamaSifre,secim,parayatırma,paracekme,islem;
		System.out.println("Oluşturulacak hesabınızın kullanıcı adını giriniz :");
		kullanıcı = input.nextLine();
		System.out.println("Oluşturulacak hesabınızın şifresini giriniz :");
		sifre = input.nextLine();
		System.out.println("Oluşturulacak hesabınızın bakiyesini giriniz :");
		bakiye = input.nextInt();
		input.nextLine();
		System.out.println("Başarılı bir şekilde hesabınız oluşturuldu.");
		System.out.println("Hesabınıza giriş yapmak ister misiniz (Girmek için Evet yaznınız) ? :");
		secim = input.nextLine().toUpperCase();
		if (secim.equals("evet".toUpperCase())) {
			 System.out.println("Kullanıcı adını giriniz :");
			 dogrulamaKullanıcı= input.nextLine();
			 System.out.println("Şifrenizi giriniz giriniz :");
			 dogrulamaSifre= input.nextLine();
			 if (dogrulamaKullanıcı.equals(kullanıcı)&dogrulamaSifre.equals(sifre))
			 {System.out.println("Hesaba başarılı bir şekilde giriş yapıldı."); 
			 System.out.println("Yapmak istediğiniz işlem türünü seçin (parayatırma,paracekme)");
			 islem=input.next().toUpperCase();
			 if(islem.equals("parayatırma".toUpperCase())) {
				 System.out.println("Kaç tl yatıracaksınız :");
				 yatırma=input.nextInt();
				 bakiye=bakiye+yatırma;
				 System.out.println("Yeni bakiyeniz :"+bakiye);
			 }
			 else if(islem.equals("paracekme".toUpperCase())) {
				 System.out.println("Kaç tl cekeceksiniz :");
				 cekme=input.nextInt();
				 cekme=cekme*(-1);
				 bakiye=bakiye+cekme;
				 System.out.println("Yeni bakiyeniz :"+bakiye);
			 }
			 
			 }
			 else {
				 System.out.println("Kullancı adı veya şifre hatalı yada ikisi birden hatalı .");
			 }
			 }
		else {System.out.println("Giriş yapma zaten boşuna yazdık dimi bu kadar kodu");}
		
	}

}
