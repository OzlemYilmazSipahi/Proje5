
import java.util.Scanner;
public class Proje5 {

    public static void main(String[] args){

       Double kilo, boy, vki;

       Scanner inp = new Scanner(System.in);

       System.out.print("Boyunuzu Metre Cinsinden Giriniz: ");
       boy = inp.nextDouble();

       System.out.print("Kilonuzu Giriniz: ");
       kilo = inp.nextDouble();

       vki = kilo/(boy*boy);
       System.out.print("Vücut Kitle Endeksi: " + vki);





    }


}
