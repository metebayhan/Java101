import java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(int sayi){
        int temp = sayi, terssayi = 0, sonsayi; 

        while (temp != 0) {
            sonsayi = temp % 10; // Geçici sayının ona bölümünden kalanı veriyor.
            terssayi = (terssayi * 10) + sonsayi; // Sayının tersini bulmak amacıyla terssayi değişkenini on katının son sayı fazlasına eşitliyor.
            temp /= 10; // Geçici sayının bir sonraki basamağını hesaplamak için ona bölerek eşitliyor ve döngü devam ediyor.

        }
            if (terssayi == sayi) // Sayıların eşitliğini kontrol eden bir şart giriliyor; eğer şart sağlanıyorsa true, sağlanmıyorsa false değeri veriliyor. 
            return true;
            else
            return false;
        
    }
    public static void main(String[] args){ // Ana metod.
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayıyı giriniz: ");
        int deger = input.nextInt();
      

        if (isPalindrom(deger)) // deger değişkeni isPalindrom metodundaki sayı değişkenine eşitleniyor. isPalindrom metoduna girilen değere göre metod çalışıyor ve true/false değeri veriliyor.
        System.out.println(deger + " sayısı palindrom bir sayıdır.");
        else 
        System.out.println(deger + " sayısı palindrom bir sayı değildir.");

        input.close();
    }
}
