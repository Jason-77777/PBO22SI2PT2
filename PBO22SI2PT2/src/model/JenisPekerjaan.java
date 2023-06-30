package model;

public abstract class JenisPekerjaan {

    private String namaPerusahaan;
    private String alamatPerusahaan;
    private String nomorTelp;
    private String jamKerja;
    private String gaji;
    private String tipepekerjaan;
    private String tipePekerjaanFulllTime;
    private String tipePekerjaanPartTime;

    public JenisPekerjaan(String namaPerusahaan, String alamatPerusahaan, String nomorTelp, String jamKerja, String gaji, String tipepekerjaan, String tipePekerjaanFulllTime, String tipePekerjaanPartTime) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
        this.nomorTelp = nomorTelp;
        this.jamKerja = jamKerja;
        this.gaji = gaji;
        this.tipepekerjaan = tipepekerjaan;
        this.tipePekerjaanFulllTime = tipePekerjaanFulllTime;
        this.tipePekerjaanPartTime = tipePekerjaanPartTime;
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

    public String getTipepekerjaan() {
        return this.tipepekerjaan;
    }

    public void setTipepekerjaan(String tipepekerjaan) {
        this.tipepekerjaan = tipepekerjaan;
    }

    public String getTipePekerjaanFulllTime() {
        return this.tipePekerjaanFulllTime;
    }

    public void setTipePekerjaanFulllTime(String tipePekerjaanFulllTime) {
        this.tipePekerjaanFulllTime = tipePekerjaanFulllTime;
    }

    public String getTipePekerjaanPartTime() {
        return this.tipePekerjaanPartTime;
    }

    public void setTipePekerjaanPartTime(String tipePekerjaanPartTime) {
        this.tipePekerjaanPartTime = tipePekerjaanPartTime;
    }

    @Override
    public String toString() {
        return "{" +
            " namaPerusahaan='" + getNamaPerusahaan() + "'" +
            ", alamatPerusahaan='" + getAlamatPerusahaan() + "'" +
            ", nomorTelp='" + getNomorTelp() + "'" +
            ", jamKerja='" + getJamKerja() + "'" +
            ", gaji='" + getGaji() + "'" +
            ", tipepekerjaan='" + getTipepekerjaan() + "'" +
            ", tipePekerjaanFulllTime='" + getTipePekerjaanFulllTime() + "'" +
            ", tipePekerjaanPartTime='" + getTipePekerjaanPartTime() + "'" +
            "}";
    }
}