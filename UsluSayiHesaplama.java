import java.util.Scanner;

public class UsluSayiHesaplama {
 public static void main(String[] args) {
    int deger, us, sonuc = 1;
    Scanner input = new Scanner(System.in);

    System.out.print("Taban değeri giriniz: ");
    deger = input.nextInt();
    System.out.print("Üs değeri giriniz: ");
    us = input.nextInt();

    for (int i = 1; i <= us; i++ ) {
        sonuc *= deger;


    }
    System.out.print("Üs alma sonucunuz: " + sonuc);
    input.close();
 }    
}
