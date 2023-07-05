public class Materi {

    private String idPekerja;
    private String topik;
    private String jenisLatihan;
    private Narasumber narasumber;
    private String pekerja;

    public Materi() {
    }


    public Materi(String topik, String jenisLatihan, String narasumber) {
        this.topik = topik;
        this.jenisLatihan = jenisLatihan;
        this.narasumber = narasumber;
    }


    public String getTopik() {
        return this.topik;
    }

    public void setTopik(String topik) {
        this.topik = topik;
    }

    public String getJenisLatihan() {
        return this.jenisLatihan;
    }

    public void setJenisLatihan(String jenisLatihan) {
        this.jenisLatihan = jenisLatihan;
    }

    public String getNarasumber() {
        return this.narasumber;
    }

    public void setNarasumber(String narasumber) {
        this.narasumber = narasumber;
    }


    @Override
    public String toString() {
        return "{" +
            "Topik = '" + getTopik() + "'" +
            ", Jenis latihan = '" + getJenisLatihan() + "'" +
            ", Narasumber = '" + getNarasumber() + "'" +
            "}";
    }

    
}


    
