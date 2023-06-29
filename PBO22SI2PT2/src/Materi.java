public class Materi {

    private String topik;
    private String jenisLatihan;
    private String narasumber;

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
            " topik='" + getTopik() + "'" +
            ", jenisLatihan='" + getJenisLatihan() + "'" +
            ", narasumber='" + getNarasumber() + "'" +
            "}";
    }

    
}


    
