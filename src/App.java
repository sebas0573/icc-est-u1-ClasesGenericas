public class App {
    public static void main(String[] args) {
        Par<String, Integer> persona = new Par<>("Luis", 35);
        System.out.println(persona);

        Par<Double, Double> coordenadas = new Par<>(15.5, 28.4);
        System.out.println("Latitud: " + coordenadas.getPrimero() + ", Longitud: " + coordenadas.getSegundo());
    }
}

