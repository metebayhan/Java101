import java.util.Scanner;
public class NSayma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int saymasayisi, sayi;

         System.out.print("Kaç tane sayı gireceksiniz? ");
        saymasayisi = input.nextInt();
        int n = saymasayisi;
        if (n <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        } else {
            System.out.print("1. sayıyı giriniz: ");
            sayi = input.nextInt();
            int buyuk = sayi;
            int kucuk = sayi;

            for (int i = 2; i <= saymasayisi ; i++) {
                System.out.print( i + ". sayıyı giriniz: ");
                sayi = input.nextInt();

                if (sayi > buyuk) {
                    buyuk = sayi;
                }
                if (sayi < kucuk ) {
                    kucuk = sayi;
                }
            }

            System.out.println("En büyük sayınız: " + buyuk);
            System.out.println("En küçük sayınız: " + kucuk);

        }
        input.close();    
    }
        
    

        }
    
