//Perusahaan adalah sebuah badan usaha yang tetap dan didirikan oleh manusia yang bertujuan mencari laba atau keuntungan

public class Perusahaan {
    private String namaPerusahaan;
    private String alamatPerusahaan;
    private String pekerja;
    private String investor;
    
    public Perusahaan() {
    }
    
    public Perusahaan(String namaPerusahaan, String alamatPerusahaan, String pekerja, String investor){
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
        this.pekerja = pekerja;
        this.investor = investor;
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

    public String getPekerja() {
        return this.pekerja;
    }

    public void setPekerja(String pekerja) {
        this.pekerja = pekerja;
    }

    public String getInvestor() {
        return this.investor;
    }

    public void setInvestor(String investor) {
        this.investor = investor;
    }
    

    @Override
    public String toString() {
        return "{" +
            " nama_perusahaan='" + getNamaPerusahaan() + "'" +
            ", alamat_perusahaan='" + getAlamatPerusahaan() + "'" +
            ", pekerja='" + getPekerja() + "'" +
            ", investor='" + getInvestor() + "'" +
            "}";
    }
    
}
