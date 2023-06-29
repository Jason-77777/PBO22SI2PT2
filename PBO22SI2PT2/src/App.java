import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<Pekerja> pekerja = new ArrayList<Pekerja>();
    public static void main(String[] args) throws Exception {


        Scanner input = new Scanner(System.in);

        System.out.println("Menu Utama :");
        System.out.println("1. Profile Pekerja");
        System.out.println("2. Rekomendasi Pekerjaan");
        System.out.println("3. Training / Seminar ");
        System.out.println("4. Pencarian Pekerjaan");
        System.out.println("5. Pesan dan Notifikasi");
        System.out.print("Pilihan : ");

        int pilihan;
        pilihan = input.nextInt();

        System.out.println("-----------------------");

        switch (pilihan) {
            case 1:
                dataPekerja();
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
        } 
    }

    public static void dataPekerja() {
        
        Scanner inputdata = new Scanner(System.in);
        String idPekerja, nama , usia , jenisKelamin , alamat , nomorHP , lulusan , kembali , email;

        System.out.print("ID\t : ");
        idPekerja = inputdata.nextLine();

        System.out.print("Nama\t : ");
        nama = inputdata.nextLine();

        System.out.print("Usia\t : ");
        usia = inputdata.nextLine();

        System.out.print("Jenis Kelamin (L/P)\t : ");
        jenisKelamin = inputdata.nextLine();

        System.out.print("Alamat\t : ");
        alamat = inputdata.nextLine();

        System.out.print("Nomor Handphone\t :");
        nomorHP = inputdata.nextLine();

        System.out.print("Email\t : ");
        email = inputdata.nextLine();

        System.out.print("Lulusan\t : ");
        lulusan = inputdata.nextLine();

        pekerja.add(new Pekerja(idPekerja, nama, usia, jenisKelamin, alamat, nomorHP, email, lulusan));


        System.out.println("Selamat datang !!!");

        System.out.print("Kembali Ke Menu Utama? (Y/N)\t : ");
        kembali = inputdata.nextLine();

        if (kembali.equalsIgnoreCase("Y")) {
            return;
        } else {
            System.out.println("Terima Kasih !!!");
            System.exit(0);
        }

        inputdata.close();

    }


        Pekerja john = new Pekerja();
        Pekerja jim = new Pekerja();
        Pekerja jack = new Pekerja();
        
        Materi pertama = new Materi();
        Materi kedua = new Materi();
        Materi ketiga = new Materi();

        Narasumber andi = new Narasumber("andi", "laki laki", "22", "andi@gmail.com", "0834871249214", "S1", "HR Manager", "Aryaduta");
        Narasumber budi = new Narasumber("budi", "laki laki", "22", "budi@gmail.com", "0874214788", "S1", "HR Manager", "Adimulia");
        Narasumber anisa = new Narasumber("Anisa", "perempuan", "23", "Anisa@gmail.com", "0821838129738", "S1", "Founder", "Shihlin");

        Perusahaan CAB = new Perusahaan();
        Perusahaan MOBILTERBANG = new Perusahaan();
        Perusahaan PTtrans = new Perusahaan();
    
        
    

}   

