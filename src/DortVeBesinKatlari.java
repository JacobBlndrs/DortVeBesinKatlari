import java.util.Scanner;

public class DortVeBesinKatlari {
    public static void main(String[] args) {
        int n;

        Scanner inp=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        n=inp.nextInt();
        for (int i = 1; i<=n;i*=4 ){
            System.out.println("Dordun Katlari : "+ i);
        }
        System.out.println("*******************************");
        for (int j = 1; j<=n; j*=5){
            System.out.println("Besin Katlari : "+ j);
        }
    }
}
