package TiendaMascotas;

public class Perro extends Mascota {
    protected double peso;
    protected boolean muerde;

    public Perro(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Peso: " + peso + " kg");
        System.out.println((muerde ? "Si" : "No") + " muerde");
    }

    public static void sonido() {
        System.out.println("Los perros ladran");
    }
}
