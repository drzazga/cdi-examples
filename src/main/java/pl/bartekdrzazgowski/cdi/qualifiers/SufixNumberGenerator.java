package pl.bartekdrzazgowski.cdi.qualifiers;

import java.util.concurrent.ThreadLocalRandom;

class SufixNumberGenerator {

    String get() {
        return String.format("%5d", Math.abs(ThreadLocalRandom.current().nextLong()) % 1_000_000);
    }
}
