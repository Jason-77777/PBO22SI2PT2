import java.util.ArrayList;
import java.util.Scanner;

import model.FullTime;
import model.PartTime;

public class App {
    public static ArrayList<Pekerja> pekerja = new ArrayList<Pekerja>();
    public static ArrayList<FullTime> full = new ArrayList<FullTime>();
    public static ArrayList<PartTime> part = new ArrayList<PartTime>();
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        init();

        boolean kembali = true;

    while (kembali) {
        
        System.out.println("Menu Utama :");
        System.out.println("1. Profile Pekerja");
        System.out.println("2. Perusahaan");
        System.out.println("3. Jenis dan Lowongan Pekerjaan");
        System.out.println("4. Training / Seminar");
        System.out.println("5. Tampilkan Profile Pekerja");
        System.out.println("6. Tampilkan Data Perusahaan");
        System.out.println("7. Tampilkan Jenis dan Lowongan Pekerjaan Full Time dan Part Time");
        System.out.println("8. Tampilkan Data Training / Seminar");
        System.out.println("9. Hapus Data Pekerja");
        System.out.println("10. Hapus Data Jenis dan Lowongan Pekerjaan Full Time");
        System.out.println("11. Hapus Data Jenis dan Lowongan Pekerjaan Part Time");
        System.out.println("12. Hapus Data Training / Seminar");
        System.out.println("13. Keluar");
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
                dataMateri();
                dataNarasumber();
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
                tampilMateri();
                tampilNarasumber();
                break;
            case 9 :
                hapusPekerja(0);
                break;
            case 10 :
                hapusJenisLowonganFullTime(0);
                break;
            case 11 :
                hapusJenisLowonganPartTime(0);
                break;
            case 12:
                hapusMateri();
                hapusNarasumber();
                break;
            case 13 :
                kembali = false;
                System.out.println("Terima kasih !!!");
                break;
        }
    } 
}

    public static void init() {

        Pekerja andi = new Pekerja("03", "Andi", "22", "L", "Jln. Sirsak No.10", "081345789153", "andiwin24@gmail.com", "S1");
        pekerja.add(andi);
        Pekerja tono = new Pekerja("05", "Tono", "24", "L", "Jln Durian No.41", "081234671579", "tonokeren29@gmail.com", "S1");
        pekerja.add(tono);
        Pekerja hanni = new Pekerja("07", "Hanni", "18", "P", "Jln. Seoul No.18", "081264531257", "hanni17@gmail.com", "SMA");
        pekerja.add(hanni);

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



        
        
    }

    

    public static void dataPekerja() {
        
        String idPekerja="", nama="", usia="", jenisKelamin="", alamat="", nomorHP="", lulusan="", email="";

        System.out.print("ID\t : #");
        idPekerja = input.nextLine();

        System.out.print("Nama\t : ");
        nama = input.nextLine();

        System.out.print("Usia\t : ");
        usia = input.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        jenisKelamin = input.nextLine();

        System.out.print("Alamat\t : ");
        alamat = input.nextLine();

        System.out.print("Nomor Handphone\t : ");
        nomorHP = input.nextLine();

        System.out.print("Email\t : ");
        email = input.nextLine();

        System.out.print("Lulusan\t : ");
        lulusan = input.nextLine();

        pekerja.add(new Pekerja(idPekerja, nama, usia, jenisKelamin, alamat, nomorHP, email, lulusan));
        
        System.out.println("Selamat datang !!!");

        System.out.print("Kembali ke menu utama ? (yes/no): ");
        String kembali = input.nextLine();
        if (kembali.equalsIgnoreCase("yes")) {
            return;
        } else  {
            System.out.println("Terima Kasih !!!");
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

        System.out.print("Kembali ke menu utama ? (yes/no): ");
        String kembali = input.nextLine();
        if (kembali.equalsIgnoreCase("yes")) {
            return;
        } else  {
            System.out.println("Terima Kasih !!!");
            System.exit(0);
        }
        
    }

    public static void dataMateri() {

    }

    public static void dataPerusahaan() {

    }

    public static void dataNarasumber() {

    }

    public static void tampilPekerja() {

        System.out.println("Profile Pekerja :");
        for (Pekerja pekerja2 : pekerja) {
            System.out.println(pekerja2);
        }
    }

    public static void tampilPerusahaan() {
        
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

    }

    public static void tampilMateri() {

    }

    public static void tampilNarasumber() {

    }

    public static void hapusPekerja(int andi) {
        pekerja.remove(andi);
    }

    public static void hapusJenisLowonganFullTime(int fullsatu) {
        full.remove(fullsatu);
    }

    public static void hapusJenisLowonganPartTime(int partsatu) {
        part.remove(partsatu);
    }

    public static void hapusMateri() {

    }

    public static void hapusNarasumber() {

    }
}   

