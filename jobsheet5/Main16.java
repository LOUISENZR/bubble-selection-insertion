package jobsheet5;
import java.util.Scanner;
public class Main16 {
   public static void main(String[] args) {
      daftarMahasiswaBerprestasi List = new daftarMahasiswaBerprestasi();
      mahasiswa m1 = new  mahasiswa("Nusa", 2017,25, 3);
      mahasiswa m2 = new  mahasiswa("Rara", 2012, 19, 4);
      mahasiswa m3 = new  mahasiswa("Dompu", 2017,19, 3.5);
      mahasiswa m4 = new  mahasiswa("Abdul", 2017,23, 32);
      mahasiswa m5 = new  mahasiswa("Ummi", 2019,21, 3.75);

      List.tambah(m1);
      List.tambah(m2);
      List.tambah(m3);
      List.tambah(m4);
      List.tambah(m5);

      System.out.println("Data Mahasiswa Sebelum Shorting = ");
      List.tampil();

      System.out.println("Data Mahasiswa Setlah Shorting Desc Berdasarkan IPK");
      List.bubbleSort();
      List.tampil();
   }
}