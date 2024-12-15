package JAVA101;
import java.util.Scanner;

public class ikinci_ornek {
    public static void main(String[] args) {
        double para , kdvorani ;
        Scanner input =new Scanner(System.in);
        System.out.println("para degerini giriniz: ");
        para = input.nextInt();
        boolean kdv = para > 1000 ;
        kdvorani = kdv ? 0.08 : 0.18 ;
        double kdvtutar = para * kdvorani ;
        System.out.println("kdv'li fiyat: "+(kdvtutar+para));
        System.out.print("kdv fiyati: "+kdvtutar);

    }
}
