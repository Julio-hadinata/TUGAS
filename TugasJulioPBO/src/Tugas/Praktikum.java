
package Tugas;

import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama     : ");
    String Nama = input.nextLine();
        
        System.out.print("Alamat   : ");
    String Alamat = input.nextLine();
        
        System.out.print("No. Telp : ");
    double No = input.nextDouble();
    input.nextLine();
    
        System.out.print("Email    : ");
    String email = input.nextLine();
    
        
    String nama= ("Julio Hadinata");
    System.out.println("Nama      : "+nama);
    String alamat= ("Bandar Jaya, Lampung Tengah");
    System.out.println("Alamat    : "+alamat);
    String nomor = ("085798065256");
    System.out.println("No. Telp  : "+nomor);
    String Email = ("Juliohadinata@gmail.com");
    System.out.println("Email     : "+Email);
    }
    
}
