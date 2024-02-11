package rs.raf.demo.resources;

import rs.raf.demo.entities.Osiguranik;
import rs.raf.demo.entities.PomocniOsiguranik;
import rs.raf.demo.services.OsiguranikServis;


import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/osiguranik")
public class OsiguranikResurs {

    @Inject
    private OsiguranikServis osiguranikServis;


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Osiguranik create(@Valid Osiguranik osiguranik) {
        return this.osiguranikServis.dodajOsiguranika(osiguranik);
    }

    @GET
    @Path("/osiguranici")
    @Produces(MediaType.APPLICATION_JSON)
    public Response all() {
        return Response.ok(this.osiguranikServis.sviOsiguranici()).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Osiguranik pronadjiOsiguranika(@PathParam("id") Integer id){
      return this.osiguranikServis.pronadjiOsiguranika(id);
    }

    @POST
    @Path("/pomocni")
    @Produces(MediaType.APPLICATION_JSON)
    public PomocniOsiguranik create(@Valid PomocniOsiguranik pomocniOsiguranik) {
        return this.osiguranikServis.dodajPomocnogOsiguranika(pomocniOsiguranik);
    }


    @GET
    @Path("/pomocni/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response vratiPomocneOsiguranike(@PathParam("id") Integer id) {
        return Response.ok(this.osiguranikServis.sviPomocniOsiguranici(id)).build();
    }



}
