package model;

public class JenisPekerjaanPartTime extends JenisPekerjaan{

    public JenisPekerjaanPartTime(String namaPerusahaan, String alamatPerusahaan, String nomorTelp, String jamKerja,
            String gaji, String tipepekerjaan) {
        super(namaPerusahaan, alamatPerusahaan, nomorTelp, jamKerja, gaji, tipepekerjaan);
    }

    @Override
    public String toString() {
        return "Pekerjaan Part Time" + super.toString();
    }

    
}
