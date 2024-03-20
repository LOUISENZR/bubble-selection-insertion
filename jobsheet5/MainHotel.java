package jobsheet5;
import java.util.Scanner;
public class MainHotel {
    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);
        System.out.print("Masukan Jumlah Hotel: ");
        int jumlahHotel = sc16.nextInt();
        HotelService htl = new HotelService(jumlahHotel);
        for(int i=0; i<jumlahHotel; i++){
            System.out.println("Hotel ke- "+(i+1));
            System.out.print("Masukan Nama: ");
            String nama = sc16.next();
            System.out.print("Masukan Kota: ");
            String kota = sc16.next();
            System.out.print("Masukan Harga: ");
            int harga = sc16.nextInt();
            System.out.print("Masukan Bintang: ");
            byte bintang = sc16.nextByte();
            htl.rooms[i] = new Hotel(nama, kota, harga, bintang);
            htl.tambah(htl.rooms[i]);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("                  HOTEL SERVICE                   ");
        System.out.println("--------------------------------------------------");

        while(true){
            System.out.println("                 Daftar Hotel                   ");
            System.out.println("----------------------------------------------");
            System.out.println("1) Berdasarkan Harga"+ " Termurah --> Tertinggi");
            System.out.println("2) Berdasarkan Bintang"+ " Tertinggi --> Termurah");
            System.out.println("3) Keluar");
            System.out.println("----------------------------------------------");
            System.out.println("Masukan Pilihan");
            int pilihan = sc16.nextInt();
            if(pilihan==1){
                System.out.println("Daftar Hotel"+" Berdasarkan Harga Termurah --> Tertinggi");
                htl.bubbleSort();
                htl.tampilAll();
            }else if(pilihan==2){
                System.out.println("Daftar Hotel"+" Berdasarkan Bintang Tertinggi --> Terendah");
                htl.selectionSort();
                htl.tampilAll();
            }else{
                System.out.println("----------------------------------------------");
                System.out.println("                  TERIMAKASIH                 ");
                System.out.println("----------------------------------------------");
                break;
            }

        }
    }
}
