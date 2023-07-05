// Class ini adalah untuk menampung semua data mengenai jenis pekerjaan

public abstract class JenisPekerjaan {

    private String idJenisPekerjaan;
    private String tipepekerjann;
    private String tipePekerjaanFullTime;
    private String tipePekerjaanPartTime;

    public JenisPekerjaan() {
    }


    public JenisPekerjaan(String tipepekerjann, String tipePekerjaanFullTime, String tipePekerjaanPartTime) {
        this.tipepekerjann = tipepekerjann;
        this.tipePekerjaanFullTime = tipePekerjaanFullTime;
        this.tipePekerjaanPartTime = tipePekerjaanPartTime;
    }


    public String getTipepekerjann() {
        return this.tipepekerjann;
    }

    public void setTipepekerjann(String tipepekerjann) {
        this.tipepekerjann = tipepekerjann;
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
            "Tipe Pekerjann = '" + getTipepekerjann() + "'" +
            ", Pekerjaan Full Time = '" + getTipePekerjaanFullTime() + "'" +
            ", Pekerjaan Part Time = '" + getTipePekerjaanPartTime() + "'" +
            "}";
    }
    


    
}