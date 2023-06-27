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
        String nama , usia , jenisKelamin , alamat , nomorHP , lulusan , kembali;

        System.out.print("Nama\t : ");
        nama = inputdata.nextLine();

        System.out.print("Usia\t : ");
        usia = inputdata.nextLine();

        System.out.print("Laki-laki(L) / Perempuan(P)\t : ");
        jenisKelamin = inputdata.nextLine();

        System.out.print("Alamat\t :");
        alamat = inputdata.nextLine();

        System.out.print("Nomor Handphone\t :");
        nomorHP = inputdata.nextLine();

        System.out.print("Lulusan\t : ");
        lulusan = inputdata.nextLine();

        pekerja.add(new Pekerja(nama, usia, jenisKelamin, alamat, nomorHP, lulusan));

        System.out.println("Selamat datang !!!");

        //System.out.print("Kembali Ke Menu Utama? (Y/N)\t : ");
        //kembali = inputdata.nextLine();

        //if (kembali.equalsIgnoreCase("Y")) {
            //return;
        //} else {
            //System.out.println("Terima Kasih !!!");
            //System.exit(0);
        //}

        System.out.println(pekerja);

        inputdata.close();

    }


        Pekerja john = new Pekerja();
        Pekerja jim = new Pekerja();
        Pekerja jack = new Pekerja();
        
        Materi pertama = new Materi("123", "2023", "latihan", "permulaan");
        Materi kedua = new Materi("234", "2023", "workshop", "advance");
        Materi ketiga = new Materi("456", "2022", "latihan", "advance");

        Narasumber andi = new Narasumber("andi", "laki laki", "22", "andi@gmail.com", "0834871249214", "S1", "HR Manager", "Aryaduta");
        Narasumber budi = new Narasumber("budi", "laki laki", "22", "budi@gmail.com", "0874214788", "S1", "HR Manager", "Adimulia");
        Narasumber anisa = new Narasumber("Anisa", "perempuan", "23", "Anisa@gmail.com", "0821838129738", "S1", "Founder", "Shihlin");

    

        Perusahaan CAB = new Perusahaan("CAB", "jl adam malik no 2 medan", "30 orang", "pt sinar abadi");
        Perusahaan MOBILTERBANG = new Perusahaan("MOBILTERBANG", "mangga 2 jakarta", "150 orang", "tidak ada");
        Perusahaan PTtrans = new Perusahaan("PTtrans", "jl mongolia blok g", "50 orang", "pt jepang cahaya asia");
    
        FilterRekomendasi filterPertama = new FilterRekomendasi("20-30 tahun", "laki-laki", "2-3 juta rupiah", "satpam", "pt unta terbang", "medan", "minimal tamatan SMA");
        FilterRekomendasi filterKedua = new FilterRekomendasi("25-35", "perempuan", "5-10 juta rupiah", "sekretaris", "pt oGoT", "sby", "minimal tamatan S1");
        FilterRekomendasi filterKetiga = new FilterRekomendasi("20-40", "laki-laki dan perempuan", "4-7 juta rupiah", "accountant", "cv indah kusuma", "medan", "minimal tamatan S1");
    

}   

