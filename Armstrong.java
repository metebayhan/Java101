import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        int deger;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        deger = input.nextInt();

        int gecicideger = deger;
        int basamakdeger;

        int basamaksayisi = 0;
        while (gecicideger != 0){
            gecicideger /= 10;
            basamaksayisi++;
        }
        
        gecicideger = deger; 
        int toplam = 0; 
        while (gecicideger != 0){
            int ussonuc = 1;
            basamakdeger = gecicideger % 10;
            for (int i = 1; i <= basamaksayisi; i++){
                ussonuc *= basamakdeger;
            }
            toplam += ussonuc;
            gecicideger /= 10;
        }

        if (toplam == deger) {
            System.out.println(deger + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(deger + " bir Armstrong sayısı değildir.");
        }
        input.close();
    }
}
