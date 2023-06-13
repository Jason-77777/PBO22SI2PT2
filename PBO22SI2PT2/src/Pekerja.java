//Pekerja adalah sebuah badan usaha yang melibatkan hubungan antara atasan dengan pekerja/karyawan.
// isinya adalah data yang menyangkut pekerja seperti data diri, alamat, dll

public class Pekerja {
    private String namaId;
    private String biodata;
    private String nomorHandphone;
    private String alamat;

    public Pekerja (){

    }


    public Pekerja(String namaId, String biodata, String nomorHandphone, String alamat) {
        this.namaId = namaId;
        this.biodata = biodata;
        this.nomorHandphone = nomorHandphone;
        this.alamat = alamat;
    }

    public String getNamaId() {
        return this.namaId;
    }

    public void setNamaId(String namaId) {
        this.namaId = namaId;
    }

    public String getBiodata() {
        return this.biodata;
    }

    public void setBiodata(String biodata) {
        this.biodata = biodata;
    }

    public String getNomorHandphone() {
        return this.nomorHandphone;
    }

    public void setNomorHandphone(String nomorHandphone) {
        this.nomorHandphone = nomorHandphone;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


    @Override
    public String toString() {
        return "{" +
            " nama_Id='" + getNamaId() + "'" +
            ", biodata='" + getBiodata() + "'" +
            ", nomor_handphone='" + getNomorHandphone() + "'" +
            ", alamat='" + getAlamat() + "'" +
            "}";
    }

}
