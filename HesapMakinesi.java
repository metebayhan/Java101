import java.util.Scanner;

public class HesapMakinesi{
    public static void main(String[] args) {
        double n1, n2;
        Scanner input = new Scanner (System.in);
        System.out.print("İlk sayıyı giriniz: " );
        n1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextDouble();

        System.out.println("Yapılacak işlemi seçiniz: Toplama(1) / Çıkarma (2) / Bölme (3) / Çarpma (4) ");
        int select = input.nextInt();
        System.out.println("İşlem sonucunuz: ");
        
        switch (select) {
            case 1:
            System.out.print(n1 + n2);
            break;
            case 2:
            System.out.print(n1 - n2);
            break;
            case 3:
            System.out.print(n1 / n2);
            break;
            case 4:
            System.out.print(n1 * n2);
            break;
            default:
            System.out.println("Geçerli bir işlem giriniz.");
            break;
        }
        }
    }    

