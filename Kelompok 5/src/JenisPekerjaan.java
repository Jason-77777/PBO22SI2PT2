// Class ini adalah untuk menampung semua data mengenai jenis pekerjaan

public abstract class JenisPekerjaan {

    private String idJenisPekerjaan;
    private String tipePekerjaan;
    private String tipePekerjaanFullTime;
    private String tipePekerjaanPartTime;

    public JenisPekerjaan() {
    }


    public JenisPekerjaan(String idJenisPekerjaan, String tipePekerjaan, String tipePekerjaanFullTime, String tipePekerjaanPartTime) {
        this.idJenisPekerjaan = idJenisPekerjaan;
        this.tipePekerjaan = tipePekerjaan;
        this.tipePekerjaanFullTime = tipePekerjaanFullTime;
        this.tipePekerjaanPartTime = tipePekerjaanPartTime;
    }


    public String getIdJenisPekerjaan() {
        return this.idJenisPekerjaan;
    }

    public void setIdJenisPekerjaan(String idJenisPekerjaan) {
        this.idJenisPekerjaan = idJenisPekerjaan;
    }

    public String getTipePekerjaan() {
        return this.tipePekerjaan;
    }

    public void setTipePekerjaan(String tipePekerjaan) {
        this.tipePekerjaan = tipePekerjaan;
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
            " ID Jenis Pekerjaan = '" + getIdJenisPekerjaan() + "'" +
            ", Tipe pekerjaan = '" + getTipePekerjaan() + "'" +
            ", Tipe pekerjaan Full Time = '" + getTipePekerjaanFullTime() + "'" +
            ", Tipe pekerjaan Part Time = '" + getTipePekerjaanPartTime() + "'" +
            "}";
    }

    
}