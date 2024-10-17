package baslangic;
import java.util.Scanner;
public class EtkinlikOnermeProjesi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sıcaklık;
		// sıcaklığı al 
		// sıcaklık 30 veya daha fazlaysa yüzmeyi öner 
		// 5 ile 30 arası ise sinemayı oner 
		// 5ten azsa kayak öner 
		System.out.println("Hava sıcaklığı kaç derece ?:");
		sıcaklık=input.nextInt();
		switch (sıcaklık) {
		case 30:// bu yapıyı hiç switch case kullanmadığım için yaptım
			System.out.println("Yüzmeye git.");
			break;
		case 5:
			System.out.println("Sinemaya git.");
			break;		
		}
		if (sıcaklık<5) {
			System.out.println("Kayağa git .");
		}
		else if (sıcaklık>5 && sıcaklık<30) {
			System.out.println("Sinemaya git.");
		}
		else if (sıcaklık >30 && sıcaklık < 80)
		{System.out.println("Yüzmeye git .");}
		else {
			System.out.println("Bu kadar yüksek sıcak bir yerde  nasıl olabilirsin herhalde lava atladın ?");
		}
	}

}
