package pl.bartekdrzazgowski.cdi.qualifiers;

import java.util.concurrent.ThreadLocalRandom;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LicencePlateNumberGdansk implements LicencePlateNumberGenerator {

    public String generate() {
        return "GD " + String.format("%5d", Math.abs(ThreadLocalRandom.current().nextLong()) % 1_000_000);
    }
}
