package tr.edu.medipol.yazilimaraclari.melih�zer;
import java.util.Scanner;

public class MuhasebeProgrami {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("�al���lan Saati Giriniz ");
        int calisilanSaat = scan.nextInt();
         
        System.out.println("Saatlik �cretinizi Giriniz");
        int saatlikUcret = scan.nextInt();
         
        System.out.println("Sayilar Carpimi : " + (calisilanSaat * saatlikUcret));
    }
}