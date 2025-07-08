package practice.src.designPatterns.creationalDesignPatterns.Strategy;

public class Application {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Pune","Nashik","Car");

    }
}
