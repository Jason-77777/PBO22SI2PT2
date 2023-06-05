//Perusahaan adalah sebuah badan usaha yang tetap dan didirikan oleh manusia yang bertujuan mencari laba atau keuntungan

public class Perusahaan {
    private String nama_perusahaan;
    private String alamat_perusahaan;
    private String data_perusahaan;
    private String pekerja;
    private String investor;
    
    public Perusahaan() {
    }
    public Perusahaan(String nama_perusahaan, String alamat_perusahaan, String data_perusahaan, String pekerja, String investor){
        this.nama_perusahaan = nama_perusahaan;
        this.alamat_perusahaan = alamat_perusahaan;
        this.data_perusahaan = data_perusahaan ;
        this.pekerja = pekerja;
        this.investor = investor;
    }
    
    public String getNama_perusahaan() {
        return this.nama_perusahaan;
    }

    public void setNama_perusahaan(String nama_perusahaan) {
        this.nama_perusahaan = nama_perusahaan;
    }

    public String getAlamat_perusahaan() {
        return this.alamat_perusahaan;
    }

    public void setAlamat_perusahaan(String alamat_perusahaan) {

    
        this.alamat_perusahaan = alamat_perusahaan;
    }

    public String getData_perusahaan() {
        return this.data_perusahaan;
    }

    public void setData_perusahaan(String data_perusahaan) {
        this.data_perusahaan = data_perusahaan;
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
            " nama_perusahaan='" + getNama_perusahaan() + "'" +
            ", alamat_perusahaan='" + getAlamat_perusahaan() + "'" +
            ", data_perusahaan='" + getData_perusahaan() + "'" +
            ", pekerja='" + getPekerja() + "'" +
            ", investor='" + getInvestor() + "'" +
            "}";
    }
    
}
