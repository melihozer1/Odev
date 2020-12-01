package tr.edu.medipol.yazilimaraclari.melihözer;
import java.util.Scanner;

public class MuhasebeProgrami {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Çalýþýlan Saati Giriniz ");
        int calisilanSaat = scan.nextInt();
         
        System.out.println("Saatlik Ücretinizi Giriniz");
        int saatlikUcret = scan.nextInt();
         
        System.out.println("Sayilar Carpimi : " + (calisilanSaat * saatlikUcret));
    }
}