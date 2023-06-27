// Class ini adalah untuk menampung semua data mengenai jenis pekerjaan

public abstract class JenisPekerjaan {

    private String namaPerusahaan;
    private String alamatPerusahaan;
    private String tipePekerjaanFullTime;
    private String tipePekerjaanPartTime;


    public JenisPekerjaan() {
    }


    public JenisPekerjaan(String namaPerusahaan, String alamatPerusahaan, String tipePekerjaanFullTime, String tipePekerjaanPartTime) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
        this.tipePekerjaanFullTime = tipePekerjaanFullTime;
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

    public String getTipePekerjaanFullTime() {
        return this.tipePekerjaanFullTime;
    }

    public void setTipePekerjaanFullTime(String tipePekerjaanFullTime) {
        this.tipePekerjaanFullTime = tipePekerjaanFullTime;
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
            ", tipePekerjaanFullTime='" + getTipePekerjaanFullTime() + "'" +
            ", tipePekerjaanPartTime='" + getTipePekerjaanPartTime() + "'" +
            "}";
    }


    
}