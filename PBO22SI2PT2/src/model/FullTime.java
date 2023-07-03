package model;

public class FullTime extends JenisPekerjaan{

    public FullTime(String namaPerusahaan, String alamatPerusahaan, String nomorTelp, String jamKerja,
            String gaji, String tipepekerjaan) {
        super(namaPerusahaan, alamatPerusahaan, nomorTelp, jamKerja, gaji, tipepekerjaan);
    }

    @Override
    public String toString() {
        return "" + super.toString();
    }

    
}
    

