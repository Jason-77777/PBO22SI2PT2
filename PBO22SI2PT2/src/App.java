// Ini merupakan file utama untuk menjalankan program yang kita buat

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int pilihan;
        String pilih;

        Scanner input = new Scanner(System.in);

        init();

        System.out.println("Menu utama :");
        System.out.println("1. Fitur Profile Pekerja dan Perusahaan");
        System.out.println("2. Fitur Rekomendasi Pekerjaan");
        System.out.println("3. Fitur Training");
        System.out.println("4. Fitur Pencarian Pekerjaan");
        System.out.println("5. Pesan dan Notifikasi");
        System.out.print("Pilihan : ");
        pilihan = input.nextInt();

        System.out.println("-----------------------");

        switch (pilihan) {
            case 1:
                System.out.println("Profile Pekerja dan Perusahaan");
                System.out.println("----------------------------------");
                System.out.println("Pekerja :");

                Pekerja john = new Pekerja("321", "laki-laki", "085127463845", "jl uph no 2 blok m");
                System.out.println(john);
                Pekerja jim = new Pekerja("123", "laki-laki", "085381633467", "jl murai no 2 blok 1");
                System.out.println(jim);
                Pekerja jack = new Pekerja("126", "laki-laki", "082739264789", "cemara garuda no 3");
                System.out.println(jack);

                System.out.println("----------------------------------");
                System.out.println("Perusahaan :");

                Perusahaan CAB = new Perusahaan("CAB", "jl adam malik no 2 medan", "30 orang", "pt sinar abadi");
                System.out.println(CAB);
                Perusahaan MOBILTERBANG = new Perusahaan("MOBILTERBANG", "mangga 2 jakarta", "150 orang", "tidak ada");
                System.out.println(MOBILTERBANG);
                Perusahaan PTtrans = new Perusahaan("PTtrans", "jl mongolia blok g", "50 orang", "pt jepang cahaya asia");
                System.out.println(PTtrans);
                break;
            case 2:
                System.out.println("Rekomendasi Pekerjaan");
                System.out.println("----------------------------------");
                System.out.println("Filter :");

                FilterRekomendasi filterPertama = new FilterRekomendasi("20-30 tahun", "laki-laki", "2-3 juta rupiah", "satpam", "pt unta terbang", "medan", "minimal tamatan SMA");
                System.out.println(filterPertama);
                FilterRekomendasi filterKedua = new FilterRekomendasi("25-35", "perempuan", "5-10 juta rupiah", "sekretaris", "pt oGoT", "sby", "minimal tamatan S1");
                System.out.println(filterKedua);
                FilterRekomendasi filterKetiga = new FilterRekomendasi("20-40", "laki-laki dan perempuan", "4-7 juta rupiah", "accountant", "cv indah kusuma", "medan", "minimal tamatan S1");
                System.out.println(filterKetiga);
                break;
            case 3:
                System.out.println("Training");
                System.out.println("----------------------------------");
                System.out.println("Materi :");

                Materi pertama = new Materi("123", "2023", "latihan", "permulaan");
                System.out.println(pertama);
                Materi kedua = new Materi("234", "2023", "workshop", "advance");
                System.out.println(kedua);
                Materi ketiga = new Materi("456", "2022", "latihan", "advance");
                System.out.println(ketiga);

                System.out.println("----------------------------------");
                System.out.println("Narasumber :");

                Narasumber andi = new Narasumber("andi", "laki laki", "22", "andi@gmail.com", "0834871249214", "S1", "HR Manager", "Aryaduta");
                System.out.println(andi);
                Narasumber budi = new Narasumber("budi", "laki laki", "22", "budi@gmail.com", "0874214788", "S1", "HR Manager", "Adimulia");
                System.out.println(budi);
                Narasumber anisa = new Narasumber("Anisa", "perempuan", "23", "Anisa@gmail.com", "0821838129738", "S1", "Founder", "Shihlin");
                System.out.println(anisa);

                break;
            case 4:
                System.out.println("Pencarian Pekerjaan");
                System.out.println("----------------------------------");
                System.out.println("Jenis Pekerjaan Yang Ditawarkan :");

                JenisPekerjaan dokter = new JenisPekerjaan("PT Sehat Abadi", "Jln Apel", "Dokter Umum", "S1 Kedokteran", "Rp.10,000,000");
                System.out.println(dokter);
                JenisPekerjaan karyawan = new JenisPekerjaan("CV Maju Jaya", "Jln Mangga", "Karyawan Toko", "SMA/Sederajat", "Rp.3,000,000");
                System.out.println(karyawan);
                JenisPekerjaan koki = new JenisPekerjaan("CV Sedap Wangi", "Jln Pisang", "Head Chef", "S1 Pariwisata", "Rp.5,000,000");
                System.out.println(koki);
                break;
            case 5:
                System.out.println("Pesan dan Notifikasi");
                break;
        }  
    }
    public static void init(){

        Pekerja john = new Pekerja("321", "laki-laki", "085127463845", "jl uph no 2 blok m");
        Pekerja jim = new Pekerja("123", "laki-laki", "085381633467", "jl murai no 2 blok 1");
        Pekerja jack = new Pekerja("126", "laki-laki", "082739264789", "cemara garuda no 3");
        
        Materi pertama = new Materi("123", "2023", "latihan", "permulaan");
        Materi kedua = new Materi("234", "2023", "workshop", "advance");
        Materi ketiga = new Materi("456", "2022", "latihan", "advance");

        Narasumber andi = new Narasumber("andi", "laki laki", "22", "andi@gmail.com", "0834871249214", "S1", "HR Manager", "Aryaduta");
        Narasumber budi = new Narasumber("budi", "laki laki", "22", "budi@gmail.com", "0874214788", "S1", "HR Manager", "Adimulia");
        Narasumber anisa = new Narasumber("Anisa", "perempuan", "23", "Anisa@gmail.com", "0821838129738", "S1", "Founder", "Shihlin");

        JenisPekerjaan dokter = new JenisPekerjaan("PT Sehat Abadi", "Jln Apel", "Dokter Umum", "S1 Kedokteran", "Rp.10,000,000");
        JenisPekerjaan karyawan = new JenisPekerjaan("CV Maju Jaya", "Jln Mangga", "Karyawan Toko", "SMA/Sederajat", "Rp.3,000,000");
        JenisPekerjaan koki = new JenisPekerjaan("CV Sedap Wangi", "Jln Pisang", "Head Chef", "S1 Pariwisata", "Rp.5,000,000");

        Perusahaan CAB = new Perusahaan("CAB", "jl adam malik no 2 medan", "30 orang", "pt sinar abadi");
        Perusahaan MOBILTERBANG = new Perusahaan("MOBILTERBANG", "mangga 2 jakarta", "150 orang", "tidak ada");
        Perusahaan PTtrans = new Perusahaan("PTtrans", "jl mongolia blok g", "50 orang", "pt jepang cahaya asia");
    
        FilterRekomendasi filterPertama = new FilterRekomendasi("20-30 tahun", "laki-laki", "2-3 juta rupiah", "satpam", "pt unta terbang", "medan", "minimal tamatan SMA");
        FilterRekomendasi filterKedua = new FilterRekomendasi("25-35", "perempuan", "5-10 juta rupiah", "sekretaris", "pt oGoT", "sby", "minimal tamatan S1");
        FilterRekomendasi filterKetiga = new FilterRekomendasi("20-40", "laki-laki dan perempuan", "4-7 juta rupiah", "accountant", "cv indah kusuma", "medan", "minimal tamatan S1");
    }

}   

