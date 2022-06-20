import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Tutar giriniz : ");
        tutar = girdi.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;
        System.out.println(kdvliTutar);

        if (tutar < 1000 && 0 < tutar){
            kdvOran = 0.18;
        }else if (tutar > 1000){
            kdvOran = 0.8;
        }
        System.out.println(kdvliTutar);
    }
}
