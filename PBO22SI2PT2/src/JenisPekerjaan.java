// Class ini adalah untuk menampung semua data mengenai jenis pekerjaan

public class JenisPekerjaan {

    private String namaPerusahaan;
    private String alamatPerusahaan;
    private String JenisPekerjaanFulllTime;
    private String JenisPekerjaanPartTime;

    public JenisPekerjaan() {
    }


    public JenisPekerjaan(String namaPerusahaan, String alamatPerusahaan, String JenisPekerjaanFulllTime, String JenisPekerjaanPartTime) {
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
        this.JenisPekerjaanFulllTime = JenisPekerjaanFulllTime;
        this.JenisPekerjaanPartTime = JenisPekerjaanPartTime;
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

    public String getJenisPekerjaanFulllTime() {
        return this.JenisPekerjaanFulllTime;
    }

    public void setJenisPekerjaanFulllTime(String JenisPekerjaanFulllTime) {
        this.JenisPekerjaanFulllTime = JenisPekerjaanFulllTime;
    }

    public String getJenisPekerjaanPartTime() {
        return this.JenisPekerjaanPartTime;
    }

    public void setJenisPekerjaanPartTime(String JenisPekerjaanPartTime) {
        this.JenisPekerjaanPartTime = JenisPekerjaanPartTime;
    }
    
    @Override
    public String toString() {
        return "{" +
            " namaPerusahaan='" + getNamaPerusahaan() + "'" +
            ", alamatPerusahaan='" + getAlamatPerusahaan() + "'" +
            ", JenisPekerjaanFulllTime='" + getJenisPekerjaanFulllTime() + "'" +
            ", JenisPekerjaanPartTime='" + getJenisPekerjaanPartTime() + "'" +
            "}";
    }
    

}