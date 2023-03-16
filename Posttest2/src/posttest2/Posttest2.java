/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Swift 3x
 */
public class Posttest2 {
 static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<Tembakau> list = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        while(true){
        System.out.println("Manajemen Toko Bacco");
        System.out.println(" 1. Tambah Data bacco \n 2. Lihat Data Bacco \n 3. update Data Bacco \n 4. Hapus Data Bacco \n 5. exit \n masukkan pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        
       
        switch (pilihan){
            case 1 -> tambah();
            case 2 -> tampil();
            case 3 -> ubah();
            case 4 -> hapus();
            case 5 -> System.exit(0);
            default -> System.out.println("Input Menu Salah");
        }
            System.out.println("\n\n");
    }
   }
    
    static void tambah()throws IOException{
        System.out.println("Masukkan Nama Tembakau : ");
        String nama = br.readLine();
        
        System.out.println("Masukkan rasa  : ");
        String rasa = br.readLine();
        
        System.out.println("Masukkan Harga per gram : ");
        float harga = Float.parseFloat(br.readLine());
        
        Tembakau tbk = new Tembakau(nama, rasa, harga);
        list.add(tbk);
        System.out.println("Data berhasil ditambahkan.");
    }
  static void tampil(){
        if (list.isEmpty()){
            System.out.println("List masih kosong");
        }  else{
            System.out.println("Nama\t Rasa\t Harga\t");
            for(int i = 0; i< list.size(); i++){ 
                System.out.print(list.get(i).getNama()+"\t");
                System.out.print(list.get(i).getRasa()+"\t");
                System.out.print(list.get(i).getHarga()+"\n");
                
            }
        }
    }
    static void ubah()throws IOException{
        System.out.println("mau diubah index berapa : ");
        int pilihan = Integer.parseInt(br.readLine());
        pilihan -=1;
        
        System.out.println("nama : ");
        list.get(pilihan).setNama(br.readLine());
       
        
        System.out.println("rasa : ");
        list.get(pilihan).setRasa(br.readLine());
        
        System.out.println("Harga : "); 
        list.get(pilihan).setHarga(Float.parseFloat(br.readLine()));
       
        
        
    }
    static void hapus()throws IOException{
        System.out.println("mau hapus index berapa : ");
        int pilihan = Integer.parseInt(br.readLine());
        pilihan -=1;
        
        list.remove(pilihan);
        System.out.println("data berhasil dihapus");
    }
}
