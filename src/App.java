public class App {
    public static void main(String[] args) throws Exception {
        polimorfismo(new Triangulo (4,2, "triangulo"));
    }
    public static void polimorfismo (Figura miFigura){
        System.out.println("Tipo: " + miFigura.getTipo());
        System.out.println("Area:" + miFigura.area());
    }
}
