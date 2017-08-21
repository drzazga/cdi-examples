package pl.bartekdrzazgowski.cdi.qualifiers;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
@Gdynia
class LicencePlateNumberGdynia implements LicencePlateNumberGenerator {

    @Inject
    private SufixNumberGenerator sufix;
    
    @Override
    public String generate() {
        return "GA "+ sufix.get();
    }
}
