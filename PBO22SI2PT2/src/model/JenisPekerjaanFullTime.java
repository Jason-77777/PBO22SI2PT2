package model;

public class JenisPekerjaanFullTime extends JenisPekerjaan{

    public JenisPekerjaanFullTime(String namaPerusahaan, String alamatPerusahaan, String nomorTelp, String jamKerja,
            String gaji, String tipepekerjaan, String tipePekerjaanFulllTime, String tipePekerjaanPartTime) {
        super(namaPerusahaan, alamatPerusahaan, nomorTelp, jamKerja, gaji, tipepekerjaan, tipePekerjaanFulllTime,
                tipePekerjaanPartTime);
    }

    @Override
    public String toString() {
        return "Pekerjaan Full Time\n" + super.toString();
    }

    
}
    

