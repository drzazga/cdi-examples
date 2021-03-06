package pl.bartekdrzazgowski.cdi.qualifiers;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
class LicencePlateNumberGdansk implements LicencePlateNumberGenerator {

    @Inject
    private SufixNumberGenerator sufix;
    
    public String generate() {
        return "GD " + sufix.get();
    }
}
