package baslangic;
public class Continueornek {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // 4 sayısına geldiğimizde döngünün bu adımını atlayacağız
            if (i == 4) {
                continue; // 4 olduğunda bu iterasyonu atlayacak ve bir sonraki i'ye geçilecek
            }

            // Sadece çift sayıları yazdıracağız
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
