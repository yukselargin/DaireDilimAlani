import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r,alfa ;
        double alan,pi= 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print ("Daire diliminin yarıçapını giriniz: ");
        r= input.nextInt();

        System.out.print ("Daire diliminin açısını giriniz: ");
        alfa= input.nextInt();

        alan= (pi*r*r*alfa)/360;
        System.out.println ("Daire diliminin alanı= "+alan);

    }
}