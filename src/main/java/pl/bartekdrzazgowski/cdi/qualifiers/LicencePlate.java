package pl.bartekdrzazgowski.cdi.qualifiers;

class LicencePlate {

    private String number;

    public LicencePlate(String number) {
        this.number = number;
    }
    
    public String getNumber() {
        return number;
    }
}
