package universitas;

public class MahasiswaBeraksi {
    
public static void main(String[] args){
            
Mahasiswa datadiri = new Mahasiswa("2110010517", "Muhammad Miftah Hidayat", " Teknik Informatika");
       
    System.out.println("Nama    : "+datadiri.getNama());
    System.out.println("NPM     : "+datadiri.getNpm());
    System.out.println("Prodi   : "+datadiri.getProdi());
        
    System.out.println(datadiri.setDetail());
}
}
