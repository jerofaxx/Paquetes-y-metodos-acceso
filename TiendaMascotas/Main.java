package TiendaMascotas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bienvenido a TiendaMascotas ===");
        System.out.println("¿Qué tipo de mascota deseas registrar?");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.print("Selecciona una opción (1-2): ");
        int tipoMascota = scanner.nextInt();
        scanner.nextLine();

        if (tipoMascota == 1) {
            System.out.println("¿Qué tipo de perro es?");
            System.out.println("1. Pequeño");
            System.out.println("2. Mediano");
            System.out.println("3. Grande");
            System.out.print("Selecciona una opción (1-3): ");
            int tipoPerro = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingresa el nombre del perro: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa la edad del perro: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingresa el color del perro: ");
            String color = scanner.nextLine();

            System.out.print("Ingresa el peso del perro (kg): ");
            double peso = scanner.nextDouble();

            System.out.print("¿El perro muerde? (true/false): ");
            boolean muerde = scanner.nextBoolean();

            Perro perro;
            if (tipoPerro == 1) {
                perro = new PerroPequeno(nombre, edad, color, peso, muerde);
            } else if (tipoPerro == 2) {
                perro = new PerroMediano(nombre, edad, color, peso, muerde);
            } else {
                perro = new PerroGrande(nombre, edad, color, peso, muerde);
            }

            System.out.println("\n=== Información del Perro ===");
            perro.imprimirInformacion();
            Perro.sonido();

        } else if (tipoMascota == 2) { 
            System.out.println("¿Qué tipo de gato es?");
            System.out.println("1. Sin pelo");
            System.out.println("2. De pelo largo");
            System.out.println("3. De pelo corto");
            System.out.print("Selecciona una opción (1-3): ");
            int tipoGato = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingresa el nombre del gato: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa la edad del gato: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingresa el color del gato: ");
            String color = scanner.nextLine();

            System.out.print("Ingresa la altura de salto del gato (m): ");
            double alturaSalto = scanner.nextDouble();

            System.out.print("Ingresa la longitud de salto del gato (m): ");
            double longitudSalto = scanner.nextDouble();

            Gato gato;
            if (tipoGato == 1) {
                gato = new GatoSinPelo(nombre, edad, color, alturaSalto, longitudSalto);
            } else if (tipoGato == 2) {
                gato = new GatoPeloLargo(nombre, edad, color, alturaSalto, longitudSalto);
            } else {
                gato = new GatoPeloCorto(nombre, edad, color, alturaSalto, longitudSalto);
            }

            System.out.println("\n=== Información del Gato ===");
            gato.imprimirInformacion();
            Gato.sonido();

        } else {
            System.out.println("Opción no válida. Por favor, reinicia el programa.");
        }

        scanner.close();
    }
}
