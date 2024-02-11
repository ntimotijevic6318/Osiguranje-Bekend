package rs.raf.demo.services;
import rs.raf.demo.entities.Osiguranik;
import rs.raf.demo.entities.PomocniOsiguranik;
import rs.raf.demo.repositories.osiguranik.OsiguranikRepo;


import javax.inject.Inject;
import javax.ws.rs.core.Response;
import java.util.List;

public class OsiguranikServis {

    public OsiguranikServis() {
        System.out.println(this);
    }

    @Inject
    private OsiguranikRepo osiguranikRepo;


    public Osiguranik dodajOsiguranika(Osiguranik osiguranik) {
    return  this.osiguranikRepo.dodajOsiguranika(osiguranik);
    }

    public List<Osiguranik> sviOsiguranici() {
    return this.osiguranikRepo.sviOsiguranici();
    }

    public PomocniOsiguranik dodajPomocnogOsiguranika(PomocniOsiguranik pomocniOsiguranik) {
     return this.osiguranikRepo.dodajPomocnogOsiguranika(pomocniOsiguranik);
    }

    public Osiguranik pronadjiOsiguranika(Integer id) {
    return this.osiguranikRepo.pronadjiOsiguranika(id);
    }

    public List<PomocniOsiguranik> sviPomocniOsiguranici(Integer id) {
    return this.osiguranikRepo.sviPomocniOsiguranici(id);
    }
}
