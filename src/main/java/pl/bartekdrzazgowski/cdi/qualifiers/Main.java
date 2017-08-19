package pl.bartekdrzazgowski.cdi.qualifiers;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            LicenceService licenceService = container.select(LicenceService.class).get();
            LicencePlate licencePlate = licenceService.createLicencePlate();
            log.info("Licence plate no. " + licencePlate.getNumber());
        }
    }
    
}
