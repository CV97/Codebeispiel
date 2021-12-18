package Proxy;

// ProxyImage erstellen, um ein Objekt von RealImage // zu ertellen, sobald es benötigt wird
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // Bild wird von Festplatte geladen
        image.display();
        System.out.println("");

        // Bild wird nicht mehr von Festplatte geladen
        image.display();
    }
}