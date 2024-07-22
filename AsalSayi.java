import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Sınır sayıyı giriniz: ");
        sayi = input.nextInt();

        if (sayi <= 1) {
            System.out.println("Lütfen 1'den farklı, pozitif bir sınır sayısı giriniz.");
        } 
        else { 
            System.out.print("Asal sayılar: ");
            for (int i = 2 ; i <= sayi ; i++) {
            if (i == 2 || i == 3 || i == 5 || i == 7 || (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) ) {
                System.out.print(i + " ");
            }
        } }
        input.close();
    }
}
