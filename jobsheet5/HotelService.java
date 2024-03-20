package jobsheet5;
import java.util.Scanner;
public class HotelService {
    Hotel rooms[];
    int idx;

    public HotelService(int n){
        rooms = new Hotel[n];
        idx = 0;
    }

    void tambah(Hotel h){
        if (idx<rooms.length){
            rooms[idx] = h;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampilAll(){
        for (Hotel h:rooms){
            h.tampil();
        }
    }

    void bubbleSort (){
        for(int i=0; i<rooms.length-1; i++){
            for (int j=i; j<rooms.length-i; j++){
                if(rooms[j].harga < rooms[j-1].harga){
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for(int i=0; i<rooms.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j< rooms.length; j++){
                if(rooms[j].bintang > rooms[idxMin].bintang){
                    idxMin = j;
                }
            }
            Hotel tmp =  rooms[idxMin];
            rooms[idxMin]  = rooms[i];
            rooms[i]=tmp;
        }
    }
}
