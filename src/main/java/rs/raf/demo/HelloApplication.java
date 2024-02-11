package rs.raf.demo;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import rs.raf.demo.repositories.osiguranik.MySqlOsiguranikRepo;
import rs.raf.demo.repositories.osiguranik.OsiguranikRepo;
import rs.raf.demo.resources.OsiguranikResurs;
import rs.raf.demo.services.OsiguranikServis;


import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class HelloApplication extends ResourceConfig {

    public HelloApplication() {
        // Ukljucujemo validaciju
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);

        // Definisemo implementacije u dependency container-u
        AbstractBinder binder = new AbstractBinder() {
            @Override
            protected void configure() {
                this.bind(MySqlOsiguranikRepo.class).to(OsiguranikRepo.class).in(Singleton.class);
                this.bindAsContract(OsiguranikServis.class);

            }
        };
        register(binder);

        // Ucitavamo resurse
        packages("rs.raf.demo.resources");

    }
}



