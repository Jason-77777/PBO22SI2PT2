//Perusahaan adalah sebuah badan usaha yang tetap dan didirikan oleh manusia yang bertujuan mencari laba atau keuntungan

public class Perusahaan {
    private String namaperusahaan;
    private String alamatperusahaan;
    private String dataperusahaan;
    private String pekerja;
    private String investor;
    

    public String getNamaperusahaan() {
        return this.namaperusahaan;
    }

    public void setNamaperusahaan(String namaperusahaan) {
        this.namaperusahaan = namaperusahaan;
    }

    public String getAlamatperusahaan() {
        return this.alamatperusahaan;
    }

    public void setAlamatperusahaan(String alamatperusahaan) {
        this.alamatperusahaan = alamatperusahaan;
    }

    public String getDataperusahaan() {
        return this.dataperusahaan;
    }

    public void setDataperusahaan(String dataperusahaan) {
        this.dataperusahaan = dataperusahaan;
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
    
}
