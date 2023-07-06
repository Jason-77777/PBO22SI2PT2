package model;

public abstract class JenisPekerjaan {

    private String idJenisPekerjaan;
    private String tipePekerjaanFullTime;
    private String tipePekerjaanPartTime;


    public JenisPekerjaan(String namaPerusahaan, String alamatPerusahaan, String nomorTelp, String jamKerja, String gaji, String tipePekerjaan) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
        this.nomorTelp = nomorTelp;
        this.jamKerja = jamKerja;
        this.gaji = gaji;
        this.tipePekerjaan = tipePekerjaan;
    }



    public String getNamaPerusahaan() {
        return this.namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getAlamatPerusahaan() {
        return this.alamatPerusahaan;
    }

    public void setAlamatPerusahaan(String alamatPerusahaan) {
        this.alamatPerusahaan = alamatPerusahaan;
    }

    public String getNomorTelp() {
        return this.nomorTelp;
    }

    public void setNomorTelp(String nomorTelp) {
        this.nomorTelp = nomorTelp;
    }

    public String getJamKerja() {
        return this.jamKerja;
    }

    public void setJamKerja(String jamKerja) {
        this.jamKerja = jamKerja;
    }

    public String getGaji() {
        return this.gaji;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

    public String getTipePekerjaan() {
        return this.tipePekerjaan;
    }

    public void setTipePekerjaan(String tipePekerjaan) {
        this.tipePekerjaan = tipePekerjaan;
    }


    
    @Override
    public String toString() {
        return "{" +
            "Nama perusahaan = '" + getNamaPerusahaan() + "'" +
            ", Alamat = '" + getAlamatPerusahaan() + "'" +
            ", No.Telp = '" + getNomorTelp() + "'" +
            ", Jam kerja = '" + getJamKerja() + "'" +
            ", Gaji = '" + getGaji() + "'" +
            ", Tipe = '" + getTipePekerjaan() + "'" +
            "}";
    }
    
}