package model;

public class JenisPekerjaanFullTime extends JenisPekerjaan{

    public JenisPekerjaanFullTime(String namaPerusahaan, String alamatPerusahaan, String nomorTelp, String jamKerja,
            String gaji, String tipepekerjaan) {
        super(namaPerusahaan, alamatPerusahaan, nomorTelp, jamKerja, gaji, tipepekerjaan);
    }

    @Override
    public String toString() {
        return "Pekerjaan Full Time\n" + super.toString();
    }

    
}
    

