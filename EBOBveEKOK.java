import java.util.Scanner;

public class EBOBveEKOK {
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();

        if (n1 > n2) {
            int b = n1;
            int k = n2;
            while (k != 0) {
                int s = k;
                k = b % k;
                b = s;
            } 
            int ebob = b;
            int ekok = (n1 * n2) / ebob;
            System.out.println("EBOB: "+ ebob + " | EKOK: " + ekok);
        } else if (n2 > n1) {
            int b = n2;
            int k = n1;
            while (k != 0) {
                int s = k;
                k = b % k;
                b = s;
            } 
            int ebob = b;
            int ekok = (n1 * n2) / ebob;
            System.out.println("EBOB: "+ ebob + " | EKOK: " + ekok);
            
        }
            
        input.close();


    }
}
