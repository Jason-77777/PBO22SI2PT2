public class Materi {

    private String idPekerja;
    private String topik;
    private String jenisLatihan;
    private Narasumber narasumber;
    private String arrayList;

    public Materi() {
    }


    public Materi(String idPekerja, String topik, String jenisLatihan, Narasumber narasumber, String pekerja) {
        this.idPekerja = idPekerja;
        this.topik = topik;
        this.jenisLatihan = jenisLatihan;
        this.narasumber = narasumber;
        this.arrayList = arrayList;
    }


    public String getIdPekerja() {
        return this.idPekerja;
    }

    public void setIdPekerja(String idPekerja) {
        this.idPekerja = idPekerja;
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

    public Narasumber getNarasumber() {
        return this.narasumber;
    }

    public void setNarasumber(Narasumber narasumber) {
        this.narasumber = narasumber;
    }

    public String getArrayList() {
        return this.arrayList;
    }

    public void setPekerja(String pekerja) {
        this.arrayList = arrayList;
    }


    @Override
    public String toString() {
        return "{" +
            " ID Pekerja = '" + getIdPekerja() + "'" +
            ", Topik = '" + getTopik() + "'" +
            ", Jenis latihan = '" + getJenisLatihan() + "'" +
            ", Narasumber = '" + getNarasumber() + "'" +
            ", Pekerja = '" + getArrayList() + "'" +
            "}";
    }

    
}


    
