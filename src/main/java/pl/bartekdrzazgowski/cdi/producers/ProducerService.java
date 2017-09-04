package pl.bartekdrzazgowski.cdi.producers;

import javax.inject.Inject;

class ProducerService {
    @Inject
    @MagicNumberEarth
    private long earth;
    
    @Inject
    @MagicNumberMars
    private long mars;
    
    Long createMagicNumberForEarth() {
        return earth;
    }
    
    Long createMagicNumberForMars() {
        return mars;
    }
}
