import java.util.ArrayList;
import java.util.Scanner;

import model.FullTime;
import model.PartTime;

public class App {
    public static ArrayList<Pekerja> pekerja = new ArrayList<Pekerja>();
    public static ArrayList<FullTime> full = new ArrayList<FullTime>();
    public static ArrayList<PartTime> part = new ArrayList<PartTime>();
    public static void main(String[] args) {

        init();

        boolean kembali = true;

    while (kembali) {

        Scanner input = new Scanner(System.in);

        System.out.println("Menu Utama :");
        System.out.println("1. Profile Pekerja");
        System.out.println("2. Jenis dan Lowongan Pekerjaan");
        System.out.println("3. Training / Seminar");
        System.out.println("4. Tampilkan Profile Pekerja");
        System.out.println("5. Tampilkan Jenis dan Lowongan Pekerjaan");
        System.out.println("6. Tampilkan Data Training / Seminar");
        System.out.println("7. Hapus Data Pekerja");
        System.out.println("8. Hapus Data Jenis dan Lowongan Pekerjaan");
        System.out.println("9. Hapus Data Training / Seminar");
        System.out.println("10. Keluar");
        System.out.print("Pilihan : ");

        int pilihan = input.nextInt();

        System.out.println("-----------------------");

        switch (pilihan) {
            case 1:
                dataPekerja();
                break;
            case 2:
                dataJenisLowonganPekerjaan();
                break;
            case 3:
                dataMateri();
                dataNarasumber();
                break;
            case 4:
                tampilPekerja();
                break;
            case 5:
                tampilJenisLowongan();
                break;
            case 6 :
                tampilMateri();
                tampilNarasumber();
                break;
            case 7 :
                hapusPekerja(0);
                break;
            case 8 :
                hapusJenisLowongan();
                break;
            case 9 :
                hapusMateri();
                hapusNarasumber();
                break;
            case 10:
                kembali = false;
                System.out.println("Terima kasih !!!");
                break;
        }
        input.close();
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
        
        Scanner inputdata = new Scanner(System.in);
        String idPekerja, nama, usia, jenisKelamin, alamat, nomorHP, lulusan, email;

        System.out.print("ID\t : #");
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
        System.out.println("Profile Pekerja");

        for (Pekerja pekerja2 : pekerja) {
            System.out.println(pekerja2);
        }

        System.out.println("Selamat datang !!!");

        System.out.print("Kembali ke menu utama ? (yes/no): ");
        String kembali = inputdata.nextLine();
        if (kembali.equalsIgnoreCase("yes")) {
                return;
        } 
        else if (kembali.equalsIgnoreCase("no")) {
            System.out.println("Terima Kasih !!!");
            return;
        }
        inputdata.close();
        
    }

    public static void dataJenisLowonganPekerjaan(){

        Scanner inputdata = new Scanner(System.in);

        System.out.println("Jenis Pekerjaan :");
        System.out.println("1. Full Time");
        System.out.println("2. Part Time");
        System.out.print("Pilihan : ");

        int pilih = inputdata.nextInt();

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
        String kembali = inputdata.nextLine();
        if (kembali.equalsIgnoreCase("yes")) {
            return;
        } 
        else if (kembali.equalsIgnoreCase("no")) {
            System.out.println("Terima Kasih !!!");
            return;
        }
        inputdata.close();
    }

    public static void dataMateri() {

    }

    public static void dataNarasumber() {

    }

    public static void tampilPekerja() {

        System.out.println("Profile Pekerja :");
        for (Pekerja pekerja2 : pekerja) {
            System.out.println(pekerja2);
        }

    }

    public static void tampilJenisLowongan() {

    }

    public static void tampilMateri() {

    }

    public static void tampilNarasumber() {

    }

    public static void hapusPekerja(int andi) {
        pekerja.remove(andi);
    }

    public static void hapusJenisLowongan() {

    }

    public static void hapusMateri() {

    }

    public static void hapusNarasumber() {

    }
}   

