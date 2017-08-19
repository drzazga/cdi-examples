package pl.bartekdrzazgowski.cdi.qualifiers;

import javax.inject.Inject;

public class LicenceService {

    @Inject
    private LicencePlateNumberGenerator numberGenerator; 
    
    LicencePlate createLicencePlate() {
        return new LicencePlate(numberGenerator.generate());
    }
}
