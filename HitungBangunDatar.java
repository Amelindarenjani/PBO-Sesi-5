
import java.util.Scanner;


/**
 *
 * @author HP
 */
public class HitungBangunDatar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Bujur sangkar");
        System.out.println("2. Persegi Panjang");
        System.out.println("Isikan Pilihan : ");
        
        int pilihan = sc.nextInt();
        
        if(pilihan==1){
            System.out.println("\n Masukan nilai sisi : ");
            int s = sc.nextInt();

              BujurSangkar bs = new BujurSangkar(s);
              System.out.println(bs);
        }
        else{
            System.out.println("Masukan nilai panjang : ");
            int p = sc.nextInt();
            
            System.out.println("Masukan nilai lebar : ");
            int l = sc.nextInt();
            
            PersegiPanjang pp = new PersegiPanjang(p,l);
            System.out.println(pp);
        }
        
    }
    
}
