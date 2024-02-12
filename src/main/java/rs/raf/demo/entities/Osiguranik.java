package rs.raf.demo.entities;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Date;

public class Osiguranik {

    private Integer id;

    @NotNull(message = "Title field is required")
    @NotEmpty(message = "Title field is required")
    private String imeOsiguranika;

    @NotNull(message = "Title field is required")
    @NotEmpty(message = "Title field is required")
    private String prezimeOsiguranika;


    private Date datumRodjenjaOsiguranika;

    @NotNull(message = "Title field is required")
    @NotEmpty(message = "Title field is required")
    private String brojPasosaOsiguranika;


    private String telefonOsiguranika;

    @NotNull(message = "Title field is required")
    @NotEmpty(message = "Title field is required")
    private String imejlOsiguranika;


    private Date datumPutovanjaOsiguranikaOd;


    private Date datumPutovanjaOsiguranikaDo;

    @NotNull(message = "Title field is required")
    @NotEmpty(message = "Title field is required")
    private String nacinPutovanjaOsiguranika;

    @NotNull(message = "Title field is required")
    @NotEmpty(message = "Title field is required")
    private String razlikaUDanima;

    private Date datumUnosaPolise;

    public Osiguranik(){

    }

    public Osiguranik(int id, String imeOsiguranika, String prezimeOsiguranika, Date datumRodjenjaOsiguranika, String brojPasosaOsiguranika, String telefonOsiguranika, String imejlOsiguranika, Date datumPutovanjaOsiguranikaOd, Date datumPutovanjaOsiguranikaDo, String nacinPutovanjaOsiguranika , String razlikaUDanima , Date datumUnosaPolise) {
     this.id= id;
     this.imeOsiguranika = imeOsiguranika;
     this.prezimeOsiguranika = prezimeOsiguranika;
     this.datumRodjenjaOsiguranika = datumRodjenjaOsiguranika;
     this.brojPasosaOsiguranika = brojPasosaOsiguranika;
     this.telefonOsiguranika = telefonOsiguranika;
     this.imejlOsiguranika = imejlOsiguranika;
     this.datumPutovanjaOsiguranikaOd = datumPutovanjaOsiguranikaOd;
     this.datumPutovanjaOsiguranikaDo = datumPutovanjaOsiguranikaDo;
     this.nacinPutovanjaOsiguranika = nacinPutovanjaOsiguranika;
     this.razlikaUDanima = razlikaUDanima;
     this.datumUnosaPolise = datumUnosaPolise;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImeOsiguranika(){
        return imeOsiguranika;
    }

    public void setImeOsiguranika(String imeOsiguranika){
        this.imeOsiguranika = imeOsiguranika;
    }

    public String getPrezimeOsiguranika(){
        return this.prezimeOsiguranika;
    }

    public void setPrezimeOsiguranika(String prezimeOsiguranika){
     this.prezimeOsiguranika = prezimeOsiguranika;
    }

    public java.sql.Date getDatumRodjenjaOsiguranika(){
        return  this.datumRodjenjaOsiguranika;
    }

    public void setDatumRodjenjaOsiguranika(Date datumRodjenjaOsiguranika){
        this.datumRodjenjaOsiguranika = datumRodjenjaOsiguranika;
    }

    public String getBrojPasosaOsiguranika(){
        return this.brojPasosaOsiguranika;
    }

    public void setBrojPasosaOsiguranika(String brojPasosaOsiguranika){
        this.brojPasosaOsiguranika = brojPasosaOsiguranika;
    }

    public String getTelefonOsiguranika(){
        return  this.telefonOsiguranika;
    }

    public void setTelefonOsiguranika(String telefonOsiguranika){
        this.telefonOsiguranika = telefonOsiguranika;
    }

    public String getImejlOsiguranika(){
        return this.imejlOsiguranika;
    }

    public  void setImejlOsiguranika(String imejlOsiguranika){
        this.imejlOsiguranika = imejlOsiguranika;
    }

    public java.sql.Date  getDatumPutovanjaOsiguranikaOd(){
        return  this.datumPutovanjaOsiguranikaOd;
    }

    public void setDatumPutovanjaOsiguranikaOd(Date datumPutovanjaOsiguranikaOd){
        this.datumPutovanjaOsiguranikaOd=  datumPutovanjaOsiguranikaOd;
    }

    public java.sql.Date getDatumPutovanjaOsiguranikaDo(){
        return  this.datumPutovanjaOsiguranikaDo;
    }

    public void setDatumPutovanjaOsiguranikaDo(Date datumPutovanjaOsiguranikaDo){
        this.datumPutovanjaOsiguranikaDo =  datumPutovanjaOsiguranikaDo;
    }

    public String getNacinPutovanjaOsiguranika(){
        return this.nacinPutovanjaOsiguranika;
    }

    public void setNacinPutovanjaOsiguranika(String nacinPutovanjaOsiguranika){
    this.nacinPutovanjaOsiguranika = nacinPutovanjaOsiguranika;
    }

    public String getRazlikaUDanima() {
        return razlikaUDanima;
    }

    public void setRazlikaUDanima(String razlikaUDanima) {
        this.razlikaUDanima = razlikaUDanima;
    }

    public void setDatumUnosaPolise(Date datumUnosaPolise) {
        this.datumUnosaPolise = datumUnosaPolise;
    }

    public Date getDatumUnosaPolise() {
        return datumUnosaPolise;
    }
}
