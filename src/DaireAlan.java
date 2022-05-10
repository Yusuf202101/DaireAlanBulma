import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args) {
        int r,alfa;
        double pi,alan;
        pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen dairenin yaricapini giriniz : ");
        r = inp.nextInt();

        System.out.print("Lutfen bulmak istediginiz daire diliminin acisini giriniz : ");
        alfa = inp.nextInt();

        alan = (pi*(r*r)*alfa)/360;
        System.out.println("Dilimin alani : "+alan);





    }
}
