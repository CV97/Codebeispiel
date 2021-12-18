package Proxy;

// proxy
// Proxy Klasse mit gleichem Interface
public class ProxyImage implements Image{

    // Referenz auf echtes Objekt
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
