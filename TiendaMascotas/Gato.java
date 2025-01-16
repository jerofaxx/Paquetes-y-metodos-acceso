package TiendaMascotas;

public class Gato extends Mascota {
    protected double alturaSalto;
    protected double longitudSalto;

    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Altura de salto: " + alturaSalto + " m");
        System.out.println("Longitud de salto: " + longitudSalto + " m");
    }

    public static void sonido() {
        System.out.println("Los gatos maúllan y ronronean");
    }
}
