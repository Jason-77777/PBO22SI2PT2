import java.util.ArrayList;
import java.util.Scanner;

import model.JenisPekerjaanFullTime;

public class App {
    public static ArrayList<Pekerja> pekerja = new ArrayList<Pekerja>();
    public static ArrayList<JenisPekerjaanFullTime> pertama = new ArrayList<JenisPekerjaanFullTime>();
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        init();

        boolean kembali = true;

    while (kembali) {

        Scanner input = new Scanner(System.in);

        System.out.println("Menu Utama :");
        System.out.println("1. Profile Pekerja");
        System.out.println("2. Jenis Pekerjaan");
        System.out.println("3. Training / Seminar");
        System.out.println("4. Lowongan Pekerjaan");
        System.out.println("5. Pesan dan Notifikasi");
        System.out.print("Pilihan : ");

        int pilihan = input.nextInt();

        System.out.println("-----------------------");

        switch (pilihan) {
            case 1:
                dataPekerja();
                break;
            case 2:
                dataJenisPekerjaan();
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
        }
        input.close();
    } 
}

    public static void init() {

        JenisPekerjaanFullTime pertama = new JenisPekerjaanFullTime("PT Maju Jaya", "Jln. Melati No.14, Medan", "061-457896", "8 jam", "Rp,3.500.000", "Full Time") {

            
        };
        
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

        for (Pekerja pekerja2 : pekerja) {
            System.out.println("Profile Pekerja");
            System.out.println(pekerja2);
        }


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

    public static void dataJenisPekerjaan(){

        Scanner inputdata = new Scanner(System.in);

        System.out.println("Jenis Pekerjaan :");
        System.out.println("1. Full Time");
        System.out.println("2. Part Time");
        System.out.print("Pilihan : ");

        int pilih = inputdata.nextInt();

        switch (pilih) {
            case 1:
                for(JenisPekerjaanFullTime pertama2 : pertama) {
                    System.out.println("Lowongan Pekerjaan Yang Tersedia :");
                    System.out.println(pertama2);
                }
                break;
            default:

                break;
        }


    }
}   

