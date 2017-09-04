package pl.bartekdrzazgowski.cdi.producers;

import java.util.concurrent.ThreadLocalRandom;

import javax.inject.Inject;

import org.slf4j.Logger;

public class NumberPrinter {

    @Inject
    Logger log;
    
    void printRandomNumber() {
        log.info("Random number: {}", ThreadLocalRandom.current().nextInt());
    }
}
