import java.util.ArrayList;
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
        System.out.println("7.  Tampilkan Data Jenis Pekerjaan");
        System.out.println("8.  Tampilkan Data Lowongan Pekerjaan Full Time dan Part Time");
        System.out.println("9.  Tampilkan Data Training dan Narasumber");
        System.out.println("10. Hapus Data Pekerja");
        System.out.println("11. Hapus Data Perusahaan");
        System.out.println("12. Hapus Data Lowongan Pekerjaan Full Time");
        System.out.println("13. Hapus Data Lowongan Pekerjaan Part Time");
        System.out.println("14. Hapus Data Training dan Narasumber");
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
            case 6:
                tampilPerusahaan();
                break;
            case 7:
                tampilJenisPekerjaan();
                break;
            case 8:
                tampilLowongan();
                break;
            case 9:
                tampilMateriNarasumber();
                break;
            case 10:
                hapusPekerja(0);
                break;
            case 11:
                hapusPerusahaan(0);
                break;
            case 12:
                hapusJenisLowonganFullTime(0);
                break;
            case 13:
                hapusJenisLowonganPartTime(3);
                break;
            case 14:
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

        //Tipe Full Time
        LowonganPekerjaan lowosatu = new LowonganPekerjaan("A1", "164", "PT. Siantar Top", "Accountant", 2, null, "Medan", "S1");
        lowongan.add(lowosatu);
        LowonganPekerjaan lowodua = new LowonganPekerjaan("A1", "547", "PT. Silverware", "Product Manager", 1, null, "Medan", "S1");
        lowongan.add(lowodua);
        LowonganPekerjaan lowotiga = new LowonganPekerjaan("A1", "761", "PT. Kelapa Hijau", "Social Media Specialist", 1, null, "Medan", "S1");
        lowongan.add(lowotiga);

        //Tipe Part Time
        LowonganPekerjaan lowoempat = new LowonganPekerjaan("B1", "321", "UD. Jaya Makmur", "Security", 2, null, "Medan", "SMA");
        lowongan.add(lowoempat);
        LowonganPekerjaan lowolima = new LowonganPekerjaan("B1", "648", "CV. Sumatra One", "Karyawati", 3, null, "Medan", "SMA");
        lowongan.add(lowolima);
        LowonganPekerjaan lowoenam = new LowonganPekerjaan("B1", "391", "CV. Lintas Abadi", "Karyawan", 2, null, "Medan", "SMA");
        lowongan.add(lowoenam);

        FullTime fullsatu = new FullTime("Full Time", "AsuransiKesehatan", "5 juta");
        full.add(fullsatu);
        FullTime fulldua = new FullTime("Full Time", "AsuransiKesehatan", "10 juta");
        full.add(fulldua);
        FullTime fulltiga = new FullTime("Full Time", "AsuransiKesehatan", "15 juta");
        full.add(fulltiga);

        PartTime partsatu = new PartTime("Part Time", "AsuransiKesehatan", "100 ribu per jam");
        part.add(partsatu);
        PartTime partdua = new PartTime("Part Time", "AsuransiTenagaKerja", "200 ribu per jam");
        part.add(partdua);
        PartTime parttiga = new PartTime("Part Time", "AsuransiTenagaKerja", "300 ribu per jam");
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

        System.out.println("Tipe pekerjaan :");

        switch (pilih) {
            case 1:
                for (FullTime full2 : full) {
                    System.out.println(full2);
                }

                System.out.print("Pilih 1 atau 2 atau 3 : ");
                int pilihan = input.nextInt();
                System.out.println("Lowongan pekerjaan yang tersedia : ");
                switch (pilihan) {
                    case 1:
                        LowonganPekerjaan lowosatu = new LowonganPekerjaan("A1", "164", "PT. Siantar Top", "Accountant", 2, null, "Medan", "S1");
                        System.out.println(lowosatu);
                        break;
                    case 2:
                        LowonganPekerjaan lowodua = new LowonganPekerjaan("A1", "547", "PT. Silverware", "Product Manager", 1, null, "Medan", "S1");
                        System.out.println(lowodua);
                        break;
                    case 3:
                        LowonganPekerjaan lowotiga = new LowonganPekerjaan("A1", "761", "PT. Kelapa Hijau", "Social Media Specialist", 1, null, "Medan", "S1");
                        System.out.println(lowotiga);
                        break;
                    
                }
            break;
        
            case 2:
                for (PartTime part2 : part) {
                    System.out.println(part2);
                }

                System.out.print("Pilih 1 atau 2 atau 3 : ");
                int choice = input.nextInt();
                System.out.println("Lowongan pekerjaan yang tersedia : ");
                switch (choice) {
                    case 1:
                        LowonganPekerjaan lowoempat = new LowonganPekerjaan("B1", "321", "UD. Jaya Makmur", "Security", 2, null, "Medan", "SMA");
                        System.out.println(lowoempat);
                        break;
                    case 2:
                        LowonganPekerjaan lowolima = new LowonganPekerjaan("B1", "648", "CV. Sumatra One", "Karyawati", 3, null, "Medan", "SMA");
                        System.out.println(lowolima);
                        break;
                    case 3:
                        LowonganPekerjaan lowoenam = new LowonganPekerjaan("B1", "391", "CV. Lintas Abadi", "Karyawan", 2, null, "Medan", "SMA");
                        System.out.println(lowoenam);
                        break;
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

            StringBuilder sb = new StringBuilder();

            // Membangun header tabel
            sb.append(String.format("| %-15s | %-6s | %-4s | %-20s | %-12s | %-10s | %-20s | %-20s |\n",
            "Nama", "Gender", "Usia", "Email", "Nomor HP", "Lulusan", "Jabatan", "Perusahaan"));
            sb.append("----------------------------------------------------------------------------\n");

            // Membangun data
            if (!narasumber.isEmpty()) {
                Narasumber narasumberData1 = narasumber.get(0);
                sb.append(String.format("| %-15s | %-6s | %-4s | %-20s | %-12s | %-10s | %-20s | %-20s |\n",
                narasumberData1.getNama(), narasumberData1.getJenisKelamin(), narasumberData1.getUsia(),
                narasumberData1.getEmail(), narasumberData1.getNomorTelepon(), narasumberData1.getLulusan(),
                narasumberData1.getJabatan(), narasumberData1.getPerusahaan()));
            }   else {
                sb.append("Tidak ada data narasumber.\n");
            }

            // Menambahkan garis penutup tabel
            sb.append("----------------------------------------------------------------------------\n");

            // Menampilkan output
            System.out.println(sb.toString());

        } else if (pilihan == 2) {
            StringBuilder sb = new StringBuilder();

            // Membangun header tabel
            sb.append(String.format("| %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s |\n",
            "Nama", "Gender", "Usia", "Email", "Nomor HP", "Lulusan", "Jabatan", "Perusahaan"));
            sb.append("----------------------------------------------------------------------------\n");

            // Membangun data naradua
            Narasumber naradua = new Narasumber("Surya Wicaksono", "L", "28", "suryawcs17@gmail.com", "081264751834", "S2", "Software Engineer", "LevelUp");
            sb.append(String.format("| %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s |\n",
            naradua.getNama(), naradua.getJenisKelamin(), naradua.getUsia(), naradua.getEmail(),
            naradua.getNomorTelepon(), naradua.getLulusan(), naradua.getJabatan(), naradua.getPerusahaan()));

            // Membangun data naratiga
            Narasumber naratiga = new Narasumber("Michelle Alexandra", "P", "24", "michie20@gmail.com", "081245781357", "S1", "Freelance Web Designer", "");
            sb.append(String.format("| %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s |\n",
            naratiga.getNama(), naratiga.getJenisKelamin(), naratiga.getUsia(), naratiga.getEmail(),
            naratiga.getNomorTelepon(), naratiga.getLulusan(), naratiga.getJabatan(), naratiga.getPerusahaan()));

            // Menambahkan garis penutup tabel
            sb.append("----------------------------------------------------------------------------\n");

            // Menampilkan output
            System.out.println(sb.toString());

        } else {
            System.out.println("Pilihan tidak valid.");
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

        StringBuilder sb = new StringBuilder();

        // Membangun header tabel
        sb.append(String.format("| %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s |\n",
        "ID", "JenisPekerjaan", "Nama", "Usia", "Gender", "Alamat", "No HP", "Email", "Lulusan", "JenisPekerjaan"));
        sb.append("------------------------------------------------------------------------------------------------------------\n");

         // Membangun data pekerja
        for (Pekerja pekerja : pekerja) {
            sb.append(String.format("| %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s |\n",
                pekerja.getIdPekerja(), pekerja.getIdJenisPekerjaan(), pekerja.getNama(), pekerja.getUsia()
                , pekerja.getJenisKelamin(), pekerja.getAlamat(),
                pekerja.getNomorHP(), pekerja.getEmail(), pekerja.getLulusan(), pekerja.getJenisPekerjaan()));
        }

        // Menambahkan garis penutup tabel
        sb.append("------------------------------------------------------------------------------------------------------------\n");

        // Menampilkan output
        System.out.println(sb.toString());

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

        StringBuilder sb = new StringBuilder();

        // Membangun header tabel
        sb.append(String.format("| %-3s | %-3s | %-3s | %-3s | %-3s |\n",
        "ID Perusahaan", "Alamat Perusahaan", "Email", "Nomor HP", "Lowongan Pekerjaan"));
        sb.append("------------------------------------------------------------------------------------------------------------\n");


         // Membangun data
        for (Perusahaan perusahaan : perusahaan) {
            sb.append(String.format("| %-3s | %-3s | %-3s | %-3s | %-3s |\n",
                perusahaan.getIdPerusahaan(), perusahaan.getNamaPerusahaan(), perusahaan.getAlamatPerusahaan(), 
                perusahaan.getEmail(), perusahaan.getNomorHP(), perusahaan.getLowonganPekerjaan()));
        }

        // Menambahkan garis penutup tabel
        sb.append("------------------------------------------------------------------------------------------------------------\n");

        // Menampilkan output
        System.out.println(sb.toString());
        

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

    public static void tampilJenisPekerjaan() {

        System.out.println("Full Time ");
        for (FullTime full2 : full) {
            System.out.println(full2);
        }

        System.out.println("-----------------------");

        System.out.println("Part Time");
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

    public static void tampilLowongan() {

        System.out.println("Lowongan pekerjaan Full Time dan Part Time :");
        for (LowonganPekerjaan lowongan2 : lowongan) {
            System.out.println(lowongan2);
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

    StringBuilder sb = new StringBuilder();

    // Membangun header tabel
    sb.append(String.format("| %-15s | %-6s | %-4s | %-20s | %-12s | %-10s | %-20s | %-20s |\n",
    "Nama", "Gender", "Usia", "Email", "Nomor HP", "Lulusan", "Jabatan", "Perusahaan"));
    sb.append("-------------------------------------------------------------------------------\n");

    // Membangun data narasumber
    for (Narasumber narasumber : narasumber) {
        sb.append(String.format("| %-15s | %-6s | %-4s | %-20s | %-12s | %-10s | %-20s | %-20s |\n",
        narasumber.getNama(), narasumber.getJenisKelamin(), narasumber.getUsia(), narasumber.getEmail(),
        narasumber.getNomorTelepon(), narasumber.getLulusan(), narasumber.getJabatan(), narasumber.getPerusahaan()));
    }

    // Menambahkan garis penutup tabel
    sb.append("--------------------------------------------------------------------------------\n");

    // Menampilkan output
    System.out.println("Narasumber :");
    System.out.println(sb.toString());

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

    public static void hapusJenisLowonganFullTime(int lowosatu) {
        lowongan.remove(lowosatu);
    }

    public static void hapusJenisLowonganPartTime(int lowoempat) {
        lowongan.remove(lowoempat);
    }

    public static void hapusMateriNarasumber(int narasatu) {
        narasumber.remove(narasatu);
    }
}   