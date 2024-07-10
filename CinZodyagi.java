import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        int dogum;
        String zodyak;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınız: ");
        dogum = input.nextInt();

        if (dogum % 12 == 0) {
            zodyak = "Maymun";
        } else if (dogum % 12 == 1) {
            zodyak = "Horoz";
        } else if (dogum % 12 == 2) {
            zodyak = "Köpek";
        } else if (dogum % 12 == 3) {
            zodyak = "Domuz";
        } else if (dogum % 12 == 4) {
            zodyak = "Fare";
        } else if (dogum % 12 == 5) {
            zodyak = "Öküz";
        } else if (dogum % 12 == 6) {
            zodyak = "Kaplan";
        } else if (dogum % 12 == 7) {
            zodyak = "Tavşan";
        } else if (dogum % 12 == 8) {
            zodyak = "Ejderha";
        } else if (dogum % 12 == 9) {
            zodyak = "Yılan";
        } else if (dogum % 12 == 10) {
            zodyak = "At";
        } else if (dogum % 12 == 11) {
            zodyak = "Koyun";

        } else zodyak = "bos";  

        if (zodyak == "bos") {
            System.out.print("Geçerli bir değer giriniz.");            
        } else {
            System.out.print("Zodyak burcunuz: " + zodyak);
        }

        input.close();

    }
}
