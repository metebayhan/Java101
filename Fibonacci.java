import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int deger;
        int ilk = 0, ikinci = 1;

        System.out.print("Eleman sayısı giriniz: ");
        deger = input.nextInt();

        System.out.print("Fibonacci serisi:" + ilk);
        for (int i = 0 ; i <= (deger - 2) ; i++) {
            System.out.print(" " + ikinci);
            int sonuc = ilk + ikinci;
            ilk = ikinci;
            ikinci = sonuc;
        }
        input.close();
    }    
}
