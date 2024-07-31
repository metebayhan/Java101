import java.util.Scanner;

public class UsAlmaRecursive {

    static int UsAlma(int taban, int us){ // taban * taban ^ us - 1
        if (us == 0){
        return 1;
    }
        else {
        return taban * UsAlma(taban, us - 1);
        
        }
    }

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.print("Taban değeri giriniz: ");
    int taban = input.nextInt();
    System.out.print("Üs değeri giriniz: ");
    int us = input.nextInt();
    int sonuc = UsAlma(taban, us);
    System.out.println(sonuc);
    input.close();
    }    
}
