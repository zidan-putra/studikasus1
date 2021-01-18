
package studikasus;
import java.util.Scanner;   //mengimpor class dari java

public class studikasus1 {


    public static void main(String[] args) {
        System.out.println("selamat berhitung");
        segitiga tiga = new segitiga();     //membuat objek baru dari class segitiga dengan nama tiga
        tiga.input();           // memanggil method input dari objeck tiga
        tiga.hitung();              //memanggil method hitung dari object tiga
        
        System.out.println(tiga.hasil());   // menampilkan nilai method hasil dari objeck tiga
        
    }
    
}
class segitiga{                                 //membuat class baru
    Scanner input = new Scanner(System.in);         //membuat objeck Scanner baru
    
    int sisi;   //membuat variabel baru
    int tinggi; // membuat variabel baru
    int pilih;  // membuat variabel baru
    
    public void input(){    //membuat method baru dengan nama input
        System.out.println("masukan niali sisi segitiga");
        sisi = input.nextInt(); //memberi nilai pada varibel sisi di dalam class dengan Scanner
        input.nextLine(); // menggunakan Scanner nextLine untuk nilai String tombol enter
        
        System.out.println("masukan nilai tinggi segitiga");
        tinggi = input.nextInt(); // memmberi nilai variabel tinggi di dalam class dengan Scanner
    }
    public void hitung(){ // membuat method baru
        System.out.println("masukan operasi yang ingin anda lakukan\n1. luas\n2. keliling");
        pilih = input.nextInt(); // memberi nilai pilih dengan Scanner
        System.out.println("hasilnya adalah");
    }
    public int hasil(){ //membuat method baru yang non void
        if (pilih == 1){ // membuat percabangan dengan syarat niali pilih sama dengan 1, jika benar maka instruksi dibawahnya akan dijalankan
            int luas = tinggi * sisi / 2;               // operasi pemberian nilai variabel luas
            return luas;                        //mereturn nilai luas sehingga nilai dari method adalah nilai luas
        }
        else if (pilih == 2){ // membuatt percabangan dengan syarat nilai pilih sama dengan dua, jika benar maka instruksi dibawahnya akan dijalankan
            int keliling = sisi * 3;        // operasi pemberian nilai variabel keliling
            return keliling;                // mereturn nilai keliling sehinga nilai dari method adalah nilai keliling
        }
        return 0; // jika percabangan tidak ada yang bernilai benar maka nilai 0 di return
    }
    
}
