package jobsheet5;

import java.util.List;

public class daftarMahasiswaBerprestasi {
    mahasiswa ListMhs[] = new mahasiswa[5];
    int idx;
    void tambah(mahasiswa m){
        if(idx<ListMhs.length){
            ListMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah penuh");
        }
    }
    void tampil(){
        for(mahasiswa m : ListMhs){
            m.tampil();
            System.out.println("-------------------------------------------");
        }
    }
    void bubbleSort(){
        for (int i=0; i<ListMhs.length-1; i++){
            for(int j=1; j<ListMhs.length-i; j++){
                if(ListMhs[j].ipk > ListMhs[j-1].ipk){
                    mahasiswa tmp = ListMhs[j];
                    ListMhs[j] = ListMhs[j-1];
                    ListMhs[j-1] = tmp;
                }
            }
        }
    }
    void selectionSort(){
        for (int i=0; i<ListMhs.length; i++){
            int idxMin = i;
            for(int j=i+1; j<ListMhs.length; j++){
                if (ListMhs[j].ipk<ListMhs[idxMin].ipk){
                    idxMin=j;
                }
            }
            mahasiswa tmp = ListMhs[idxMin];
            ListMhs[idxMin] = ListMhs[i];
            ListMhs[i] = tmp;
        }
    }
    void insertionSort(){
        for (int i =1; i < ListMhs.length; i++){
            mahasiswa temp = ListMhs[i];
            int j =i;
            while (j>0 && ListMhs[j-1].ipk < temp.ipk){
                ListMhs[j]= ListMhs[j-1];
                j--;
            }
            ListMhs[j] = temp;
        }
    }
}
