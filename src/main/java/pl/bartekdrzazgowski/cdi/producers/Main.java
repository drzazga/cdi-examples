package pl.bartekdrzazgowski.cdi.producers;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
        try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
            ProducerService producerService = container.select(ProducerService.class).get();
            log.info("Magic number for Earth {}", producerService.createMagicNumberForEarth());
            log.info("Magic number for Mars {}", producerService.createMagicNumberForMars());
            
            NumberPrinter numberPrinter = container.select(NumberPrinter.class).get();
            numberPrinter.printRandomNumber();
        }
    }
}
