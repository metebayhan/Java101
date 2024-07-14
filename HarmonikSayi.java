import java.util.Scanner;

public class HarmonikSayi{
    public static void main(String[] main){
        Scanner input = new Scanner(System.in);
        double deger, sonuc = 0.0;
        
        System.out.print("Lütfen bir değer giriniz: ");
        deger = input.nextDouble();
       ;

        for (int i = 1; i <= deger; i++){
            sonuc += (1.0 / i);

        }
        System.out.print("Sonucunuz: " + sonuc);
        input.close();

    }  
}
