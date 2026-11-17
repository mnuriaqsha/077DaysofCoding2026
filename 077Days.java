import java.util.Scanner;

public class Day77 {
public static void main(String[] args) {

Scanner hi = new Scanner(System.in);  

    int j,g;  
      
    System.out.print("Masukkan Jumlah pemain: ");  
    j = hi.nextInt();  
    hi.nextLine();  
      
    for (int i = 1; i <= j; i++) {  
          
        System.out.print("\n\n== Data Pemain ke"+i+" ==");  
          
        System.out.print("\nMasukkan Nama: ");  
        String nama = hi.nextLine();  
          
        System.out.print("Masukkan jumlah goal: ");  
        g =hi.nextInt();  
        hi.nextLine();  
          
        System.out.println("\n=== Hasil Data ===");  
        System.out.println("Nama         : "+nama);  
        System.out.println("Huruf Kapital: "+nama.toUpperCase());  
        System.out.println("Huruf Kecil  : "+nama.toLowerCase());  
        System.out.println("Panjang Nama : "+nama.length());  
        System.out.println("Nama Without Spasi: "+nama.trim());  
          
        if (g>=1500) {  
            System.out.println("Status: Anomali");  
        } else if (g>=1000) {  
            System.out.println("Status: Goat");  
        } else if (g>=500) {  
            System.out.println("Status: Great Player");  
        } else if (g>=100) {  
            System.out.println("Status: Profesional Player");  
        } else if (g<100 || g>0) {  
            System.out.println("Status: Young Player");  
        }else{  
            System.out.println("Fundamental");  
        }  
          
        if (nama.toUpperCase().contains("A")){  
            System.out.println("Nama mengandung huruf A");  
        }else{  
            System.out.println("Nama tidak mengandung huruf A");  
        }  
    }  
      
}

}
