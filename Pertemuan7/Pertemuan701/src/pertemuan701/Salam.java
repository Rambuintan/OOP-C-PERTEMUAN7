
package pertemuan701;

/**
 *
 * @author Rambu Intan
 * TGL 8 Mei 2025
 */
public class Salam {
    String tx ="Menggunakan Method tulisSalam tanpa parameter";

    
    public void tulisSalam(){
        System.out.print(tx);
        
    }   
        
           // Method dengan 1 parameter String
    public void tulisSalam(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    // Method dengan 1 parameter int
    public void tulisSalam(int jumlah) {
        System.out.println("Salam sebanyak " + jumlah + " kali!");
    }

    // Method dengan 2 parameter (String dan int)
    public void tulisSalam(String nama, int umur) {
        System.out.println("Halo " + nama + ", kamu berusia " + umur + " tahun.");
    }

    // Method dengan 2 parameter (int dan boolean)
    public void tulisSalam(int angka, boolean tampilkan) {
        if (tampilkan) {
            System.out.println("Angka yang ditampilkan: " + angka);
        } else {
            System.out.println("Tidak menampilkan angka.");
        }
    }
}
      
    
    
