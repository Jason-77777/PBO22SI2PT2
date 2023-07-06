import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.FullTime;
import model.PartTime;

public class App {
    public static ArrayList<Pekerja> pekerja = new ArrayList<Pekerja>();
    public static ArrayList<FullTime> full = new ArrayList<FullTime>();
    public static ArrayList<PartTime> part = new ArrayList<PartTime>();
    public static ArrayList<Perusahaan> perusahaan = new ArrayList<Perusahaan>();
    public static ArrayList<Narasumber> narasumber = new ArrayList<Narasumber>();
    public static ArrayList<LowonganPekerjaan> lowongan = new ArrayList<LowonganPekerjaan>();
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        init();

        boolean kembali = true;

    while (kembali) {
        
        System.out.println("Menu Utama :");
        System.out.println("1.  Pekerja");
        System.out.println("2.  Perusahaan");
        System.out.println("3.  Jenis dan Lowongan Pekerjaan");
        System.out.println("4.  Training");
        System.out.println("5.  Tampilkan Profile Pekerja");
        System.out.println("6.  Tampilkan Data Perusahaan");
        System.out.println("7.  Tampilkan Jenis dan Lowongan Pekerjaan Full Time dan Part Time");
        System.out.println("8.  Tampilkan Data Training dan Narasumber");
        System.out.println("9.  Hapus Data Pekerja");
        System.out.println("10. Hapus Data Perusahaan");
        System.out.println("11. Hapus Data Lowongan Pekerjaan Full Time");
        System.out.println("12. Hapus Data Lowongan Pekerjaan Part Time");
        System.out.println("13. Hapus Data Training dan Narasumber");
        System.out.println("15. Keluar");
        System.out.print("Pilihan : ");

        int pilihan = input.nextInt();

        System.out.println("-----------------------");

        switch (pilihan) {
            case 1:
                dataPekerja();
                break;
            case 2 :
                dataPerusahaan();
                break;
            case 3:
                dataJenisLowonganPekerjaan();
                break;
            case 4:
                dataMateriNarasumber();
                break;
            case 5:
                tampilPekerja();
                break;
            case 6 :
                tampilPerusahaan();
                break;
            case 7:
                tampilJenisLowongan();
                break;
            case 8 :
                tampilMateriNarasumber();
                break;
            case 9 :
                hapusPekerja(0);
                break;
            case 10 :
                hapusPerusahaan(0);
                break;
            case 11 :
                hapusJenisLowonganFullTime(0);
                break;
            case 12 :
                hapusJenisLowonganPartTime(0);
                break;
            case 13:
                hapusMateriNarasumber(0);
                break;
            case 15 :
                kembali = false;
                System.out.println("Terima kasih !!!");
                break;
            default :
                kembali = true;
                System.out.println("Pilihan anda salah. Silakan coba kembali !!!");
        }
    } 
}

    public static void init() {

        Pekerja andi = new Pekerja("031", "1", "Andi", "22", "L", "Jln. Sirsak No.10", "081345789153", "andiwin24@gmail.com", "S1", "Full Time");
        pekerja.add(andi);
        Pekerja tono = new Pekerja("056", "1", "Tono", "24", "L", "Jln Durian No.41", "081234671579", "tonokeren29@gmail.com", "S1", "Full Time");
        pekerja.add(tono);
        Pekerja hanni = new Pekerja("018", "2", "Hanni", "18", "P", "Jln. Seoul No.18", "081264531257", "hanni17@gmail.com", "SMA", "Part Time");
        pekerja.add(hanni);

        Perusahaan maju = new Perusahaan("101", "PT. Maju Jaya", "Jln. Industri No.109, Medan", "majujaya90@gmail.com", "061-123478", null);
        perusahaan.add(maju);
        Perusahaan desa = new Perusahaan("157", "UD. Desa Maju", "Jln. Sutomo No.19, Medan", "desamaju51@gmail.com", "081354794568", null);
        perusahaan.add(desa);
        Perusahaan emas = new Perusahaan("146", "PT. Emas Top", "Jln. Mabar No.296, Medan", "emastoptop88@gmail.com", "061-457183", null);
        perusahaan.add(emas);

        FullTime fullsatu = new FullTime("PT Maju Jaya", "Jln. Industri No.109, Medan", "061-123478", "8 jam", "Rp.3,500,000", "Full Time");
        full.add(fullsatu);
        FullTime fulldua = new FullTime("CV. Angin Topan", "Jln. Berastagi No.56, Medan", "061-786451", "7 jam", "Rp.3,000,000", "Full Time");
        full.add(fulldua);
        FullTime fulltiga = new FullTime("PT Emas Top", "Jln. Mabar No.296, Medan", "061-457183", "9 jam", "Rp.4,500,000", "Full Time");
        full.add(fulltiga);

        PartTime partsatu = new PartTime("UD. Desa Maju", "Jln. Sutomo No.19, Medan", "081354794568", "4 jam", "Rp.1,500,000", "Part Time");
        part.add(partsatu);
        PartTime partdua = new PartTime("CV. Sumatra Jaya", "Jln. Krakatau No.29, Medan", "061-156347", "3 jam", "Rp.1,300,000", "Part Time");
        part.add(partdua);
        PartTime parttiga = new PartTime("UD. Bersama Makmur", "Jln. Jeruk No.12, Medan", "081364857164", "3 jam", "Rp.1,000,000", "Part Time");
        part.add(parttiga);

        Narasumber narasatu = new Narasumber("Aldi Taher", "L", "31 tahun", "alditaher22@gmail.com", "081364758945", "S2", "Senior Financial Manager", "PT. Sumber Jaya");
        narasumber.add(narasatu);
        Narasumber naradua = new Narasumber("Surya Wicaksono", "L", "28", "suryawcs17@gmail.com", "081264751834", "S2", "Software Egineer", "LevelUp");
        narasumber.add(naradua);
        Narasumber naratiga = new Narasumber("Michelle Alexandra", "P", "24", "michie20@gmail.com", "081245781357", "S1", "Freelance Web Designer", "");
        narasumber.add(naratiga);

    }

    public static void dataPekerja() {

        input.nextLine();
        String idPekerja, idJenisPekerjaan, nama, usia, jenisKelamin, alamat, nomorHP, email, lulusan, jenisPekerjaan;

        System.out.print("ID Pekerja\t : #"); 
        idPekerja = input.nextLine();

        System.out.print("ID Jenis Pekerjaan : #");
        idJenisPekerjaan = input.nextLine();

        System.out.print("Nama\t\t : ");
        nama = input.nextLine();

        System.out.print("Usia\t\t : ");
        usia = input.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        jenisKelamin = input.nextLine();

        System.out.print("Alamat\t\t : ");
        alamat = input.nextLine();

        System.out.print("Nomor Handphone\t : ");
        nomorHP = input.nextLine();

        System.out.print("Email\t\t : ");
        email = input.nextLine();

        System.out.print("Lulusan\t\t : ");
        lulusan = input.nextLine();

        System.out.print("Jenis pekerjaan  : ");
        jenisPekerjaan = input.nextLine();

        pekerja.add(new Pekerja(idPekerja, idJenisPekerjaan, nama, usia, jenisKelamin, alamat, nomorHP, email, lulusan, jenisPekerjaan));
        
        System.out.println("Selamat datang !!!");
        
        System.out.print("Kembali ke menu utama ? (yes/no): ");
        String goBack = input.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else  {
            System.out.println("Terima Kasih !!!");
            System.exit(0);
        }
    }

    public static void dataPerusahaan() {

        input.nextLine();
        String idPerusahaan, namaPerusahaan, alamatPerusahaan, email, nomorHP, lowonganPekerjaan;
        
        System.out.print("ID Perusahaan : #");
        idPerusahaan = input.nextLine();

        System.out.print("Nama perusahaan\t : ");
        namaPerusahaan = input.nextLine();

        System.out.print("Alamat\t : ");
        alamatPerusahaan = input.nextLine();

        System.out.print("Email\t : ");
        email = input.nextLine();

        System.out.print("No.Telp\t : ");
        nomorHP = input.nextLine();

        System.out.print("Lowongan\t : ");
        lowonganPekerjaan = input.nextLine();;

        perusahaan.add(new Perusahaan(idPerusahaan, namaPerusahaan, alamatPerusahaan, email, nomorHP, null));

        System.out.println("Data perusahaan telah masuk");

        System.out.print("Kembali ke menu utama ? (yes/no): ");
        String goBack = input.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else {
            System.out.println("Terima kasih !!!");
            System.exit(0);
        }
    }

    public static void dataJenisLowonganPekerjaan(){

        System.out.println("Jenis Pekerjaan :");
        System.out.println("1. Full Time");
        System.out.println("2. Part Time");
        System.out.print("Pilihan : ");

        int pilih = input.nextInt();

        System.out.println("Lowongan pekerjaan yang tersedia :");

        switch (pilih) {
            case 1:
                for (FullTime full2 : full) {
                    System.out.println(full2);
                }
                break;
        
            case 2:
                for (PartTime part2 : part) {
                    System.out.println(part2);
                }
                break;
        }
        
        input.nextLine();
        System.out.print("Kembali ke menu utama ? (yes/no): ");
        String goBack = input.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else {
            System.out.println("Terima kasih !!!");
            System.exit(0);
        }
    }

    public static void dataMateriNarasumber() {

        System.out.println("Silakan memilih topik Training yang tersedia :");
        System.out.println("1. Akuntansi");
        System.out.println("2. Teknologi");
        System.out.print("Pilihan : ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            Narasumber narasatu =  new Narasumber("Aldi Taher", "L", "31", "alditaher22@gmail.com", "081364758945", "S2", "Senior Financial Manager", "PT. Sumber Jaya");
            System.out.println(narasatu);
        } else {
            Narasumber naradua = new Narasumber("Surya Wicaksono", "L", "28", "suryawcs17@gmail.com", "081264751834", "S2", "Software Egineer", "LevelUp");
            System.out.println(naradua);
            Narasumber naratiga = new Narasumber("Michelle Alexandra", "P", "24", "michie20@gmail.com", "081245781357", "S1", "Freelance Web Designer", "");
            System.out.println(naratiga);
        }

        input.nextLine();
        System.out.print("Kembali ke menu utama ? (yes/no): ");
        String goBack = input.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else {
            System.out.println("Terima kasih !!!");
            System.exit(0);
        }
    }

    public static void tampilPekerja() {

        System.out.println("Profile Pekerja :");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s |%n",
        "IDPekerja", "IDJenisPekerjaaan", "Nama", "Usia", "Gender", "Alamat", "NomorHP", "Email", "Lulusan", "JenisPekerjaan");
        for (Pekerja pekerja2 : pekerja) {
            System.out.println(pekerja2);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
        input.nextLine();        

        System.out.print("Kembali ke menu utama ? (yes/no): ");
        String goBack = input.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else {
            System.out.println("Terima kasih !!!");
            System.exit(0);
        }
    }

    public static void tampilPerusahaan() {
        
        System.out.println("Data Perusahaan :");
        for (Perusahaan perusahaan2 : perusahaan) {
            System.out.println(perusahaan2);
        }

        input.nextLine();
        System.out.print("Kembali ke menu utama ? (yes/no): ");
        String goBack = input.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else {
            System.out.println("Terima kasih !!!");
            System.exit(0);
        }
    }

    public static void tampilJenisLowongan() {

        System.out.println("Lowongan pekerjaan Full Time :");
        for (FullTime full2 : full) {
            System.out.println(full2);
        }

        System.out.println("-----------------------");

        System.out.println("Lowongan pekerjaan Part Time :");
        for (PartTime part2 : part) {
            System.out.println(part2);
        }

        input.nextLine();
        System.out.print("Kembali ke menu utama ? (yes/no): ");
        String goBack = input.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else {
            System.out.println("Terima kasih !!!");
            System.exit(0);
        }
    }

    public static void tampilMateriNarasumber() {

        System.out.println("Narasumber :");
        for (Narasumber narasumber2 : narasumber) {
            System.out.println(narasumber2);
        }

        input.nextLine();
        System.out.print("Kembali ke menu utama ? (yes/no): ");
        String goBack = input.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else {
            System.out.println("Terima kasih !!!");
            System.exit(0);
        }
    }

    public static void hapusPekerja(int andi) {
        pekerja.remove(andi);
    }

    public static void hapusPerusahaan(int maju) {
        perusahaan.remove(maju);
    }

    public static void hapusJenisLowonganFullTime(int fullsatu) {
        full.remove(fullsatu);
    }

    public static void hapusJenisLowonganPartTime(int partsatu) {
        part.remove(partsatu);
    }

    public static void hapusMateriNarasumber(int narasatu) {
        narasumber.remove(narasatu);
    }
}   