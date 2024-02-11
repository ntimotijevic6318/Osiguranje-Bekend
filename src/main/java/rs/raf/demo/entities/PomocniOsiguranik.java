package rs.raf.demo.entities;

import java.sql.Date;

public class PomocniOsiguranik {

    int id;

    int idNosiocaOsiguranja;
    String imePomocnogOsiguranika;

    String prezimePomocnogOsiguranika;

    Date datumRodjenjaPomocnogOsiguranika;

    public PomocniOsiguranik(){

    }

    public PomocniOsiguranik(int id, String imePomocnogOsiguranika, String prezimePomocnogOsiguranika, Date datumRodjenjaPomocnogOsiguranika) {
    this.id = id;
    this.imePomocnogOsiguranika = imePomocnogOsiguranika;
    this.prezimePomocnogOsiguranika = prezimePomocnogOsiguranika;
    this.datumRodjenjaPomocnogOsiguranika = datumRodjenjaPomocnogOsiguranika;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdNosiocaOsiguranja() {
        return idNosiocaOsiguranja;
    }

    public void setIdNosiocaOsiguranja(int idNosiocaOsiguranja) {
        this.idNosiocaOsiguranja = idNosiocaOsiguranja;
    }

    public String getImePomocnogOsiguranika() {
        return imePomocnogOsiguranika;
    }

    public void setImePomocnogOsiguranika(String imePomocnogOsiguranika) {
        this.imePomocnogOsiguranika = imePomocnogOsiguranika;
    }

    public String getPrezimePomocnogOsiguranika() {
        return prezimePomocnogOsiguranika;
    }

    public void setPrezimePomocnogOsiguranika(String prezimePomocnogOsiguranika) {
        this.prezimePomocnogOsiguranika = prezimePomocnogOsiguranika;
    }

    public Date getDatumRodjenjaPomocnogOsiguranika() {
        return datumRodjenjaPomocnogOsiguranika;
    }

    public void setDatumRodjenjaPomocnogOsiguranika(Date datumRodjenjaPomocnogOsiguranika) {
        this.datumRodjenjaPomocnogOsiguranika = datumRodjenjaPomocnogOsiguranika;
    }
}
