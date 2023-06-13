// Ini merupakan file utama untuk menjalankan program yang kita buat

public class App {
    public static void main(String[] args) {
        System.out.println("Menu utama :");
        System.out.println("1. Fitur Profile Pekerja dan Perusahaan");
        System.out.println("2. Fitur Kualifikasi");
        System.out.println("3. Fitur Training");
        System.out.println("4. Fitur Pencarian Pekerjaan");
        System.out.println("5. Pesan dan Notifikasi");

        init();
    }
    public static void init(){
        System.out.println("data");
        Pekerja john = new Pekerja("321", "laki-laki", "0851274638", "jl uph no 2 blok m");
        Pekerja jim = new Pekerja("123", "laki-laki", "085381633", "jl murai no 2 blok 1");
        Pekerja jack = new Pekerja("126", "laki-laki", "082739264", "cemara garuda no 3");
        
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
    
    
    
    
    }

}   

