// Ini merupakan file utama untuk menjalankan program yang kita buat

public class App {
    public static void main(String[] args) {
        System.out.println("Menu utama :");
        System.out.println("1. Fitur Profile Pekerja dan Perusahaan");
        System.out.println("2. Fitur Kualifikasi");
        System.out.println("3. Fitur Training");
        System.out.println("4. Fitur Pencarian Pekerjaan");
        System.out.println("5. Pesan dan Notifikasi");
    }
    public static void init(){
        System.out.println("data");
        Pekerja john = new Pekerja("321", "laki-laki", "0851274638", "jl uph no 2 blok m");
        Pekerja jim = new Pekerja("123", "laki-laki", "085381633", "jl murai no 2 blok 1");
        Pekerja jack = new Pekerja("126", "laki-laki", "082739264", "cemara garuda no 3");
        
        Materi pertama = new Materi("123", "2023", "latihan", "permulaan");
        Materi kedua = new Materi("234", "2023", "workshop", "advance");
        Materi ketiga = new Materi("456", "2022", "latihan", "advance");
    }   
}
