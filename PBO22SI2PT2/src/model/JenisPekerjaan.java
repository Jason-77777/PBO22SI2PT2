package model;

public abstract class JenisPekerjaan {

    private String namaPerusahaan;
    private String alamatPerusahaan;
    private String tipePekerjaanFulllTime;
    private String tipePekerjaanPartTime;


    public JenisPekerjaan(String namaPerusahaan, String alamatPerusahaan, String tipePekerjaanFulllTime, String tipePekerjaanPartTime) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
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
            ", tipePekerjaanFulllTime='" + getTipePekerjaanFulllTime() + "'" +
            ", tipePekerjaanPartTime='" + getTipePekerjaanPartTime() + "'" +
            "}";
    }


}