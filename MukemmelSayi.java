import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deger, mukemmel = 0;

        System.out.print("Lütfen bir değer giriniz: ");
        deger = input.nextInt();

        for (int i = 1 ; i < deger ; i++) {
            if (deger % i == 0) {
                mukemmel += i;
            }
        }
        if (mukemmel == deger) {
            System.out.println(deger + " bir mükemmel sayıdır.");
        } else {
            System.out.println(deger + " bir mükemmel sayı değildir.");
        }
        input.close();
    }    
}
