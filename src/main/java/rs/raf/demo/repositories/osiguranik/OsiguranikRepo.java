package rs.raf.demo.repositories.osiguranik;

import rs.raf.demo.entities.Osiguranik;
import rs.raf.demo.entities.PomocniOsiguranik;

import javax.ws.rs.core.Response;
import java.util.List;

public interface OsiguranikRepo {
    public Osiguranik dodajOsiguranika(Osiguranik post);

    public List<Osiguranik> sviOsiguranici();

    public PomocniOsiguranik dodajPomocnogOsiguranika(PomocniOsiguranik pomocniOsiguranik);

   public Osiguranik pronadjiOsiguranika(Integer id);

   public  List<PomocniOsiguranik> sviPomocniOsiguranici(Integer id);
}
