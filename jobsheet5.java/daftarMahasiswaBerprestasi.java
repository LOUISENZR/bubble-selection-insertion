package jobsheet5;
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
            for(int j=1; j<ListMhs.length-1; j++){
                if(ListMhs[j].ipk > ListMhs[j-i].ipk){
                    mahasiswa tmp = ListMhs[j];
                    ListMhs[j] = ListMhs[j-i];
                    ListMhs[j-i] = tmp;
                }
            }
        }
    }
}
