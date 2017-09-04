package pl.bartekdrzazgowski.cdi.producers;

import javax.enterprise.inject.Produces;

class NumberProducer {
    @Produces
    @MagicNumberEarth
    private long numberEarth = 42L;
    
    @Produces
    @MagicNumberMars
    private long numberMars = 687L;
}
