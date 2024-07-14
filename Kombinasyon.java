import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args){
        int a, b, afak = 1, bfak = 1, abfak = 1, comb;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kombinasyon için a değerini giriniz [C(a,b)]: ");
        a = input.nextInt();
        System.out.print("Kombinasyon için b değerini giriniz [C(a,b)]: ");
        b = input.nextInt();

        for (int i = 1; i <= a; i++ ) {
            afak *= i;
        }

        for (int i = 1; i <= b; i++ ) {
            bfak *= i;
        }

        for (int i = 1; i <= (a-b); i++ ) {
            abfak *= i;
        }
        
        if (a < b) {
            System.out.println("A sayısı, B'den büyük olamaz!");} else {
        comb = (afak / (bfak * abfak));

        System.out.print("Kombinasyon, C" + "(" + a + ", " + b + ") =" + comb);}
        input.close();
    }    
}
