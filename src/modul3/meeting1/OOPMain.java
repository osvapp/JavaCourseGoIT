package modul3.meeting1;

public class OOPMain {
    public static void main(String[] args) {

        Car fiatDoblo = new Car(2007, "Fiat Doblo", "Alex" );
        Car fiatPanda = new Car(2010, "Fiat Panda", "Alex and Iurii", 170, 5, 1987.99);

        fiatDoblo.printOwnerName();
        fiatPanda.printYear();
        fiatDoblo.printYear();
    }

}
