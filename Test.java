import java.io.Console;
import java.util.Scanner;




public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz:");
        int yil = input.nextInt();

        if(yil%100==0)
            if(yil%400==0){
                System.out.println("Artık Yıldır");
            }
            else
                System.out.println("Artık Yıl Değildir");
        if(yil%4==0 && yil%100!=0)
            System.out.println("Artık Yıldır");




    }
}




