//class materi adalah class untuk menyimpan data materi yang diperlukan oleh pekerja untuk belajar.
//isinya biasa menyangkut tentang pertemuan materi, isi materi, jenis materi, kuriikulum mateeri



public class Materi {
    private String pertemuan;
    private String kurikulum;
    private String jenis;
    private String latihan;

    //konstruktor all field
    public Materi(String pertemuan, String kurikulum, String jenis, String latihan) {
        this.pertemuan = pertemuan;
        this.kurikulum = kurikulum;
        this.jenis = jenis;
        this.latihan = latihan;
    }

    //konstruktur empty
    public Materi (){

    }
    
    public String getPertemuan() {
        return this.pertemuan;
    }

    public void setPertemuan(String pertemuan) {
        this.pertemuan = pertemuan;
    }

    public String getKurikulum() {
        return this.kurikulum;
    }

    public void setKurikulum(String kurikulum) {
        this.kurikulum = kurikulum;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getLatihan() {
        return this.latihan;
    }

    public void setLatihan(String latihan) {
        this.latihan = latihan;
    }


    //metode to string
    @Override
    public String toString() {
        return "{" +
            " pertemuan='" + getPertemuan() + "'" +
            ", kurikulum='" + getKurikulum() + "'" +
            ", jenis='" + getJenis() + "'" +
            ", latihan='" + getLatihan() + "'" +
            "}";
    }
}


    
