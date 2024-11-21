import modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    // Lista para almacenar las películas y series registradas
    private final List<Pelicula> contenidos = new ArrayList<>();

    public void muestraElMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        while (opcion != 4) {
            System.out.println("""
                    ¡Bienvenido/a Screenmatch!
                    1) Registrar nueva película.
                    2) Registrar nueva serie.
                    3) Calculadora de tiempo para maratonear.
                    
                    4) Salir
                    """);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1 -> registrarContenido(teclado, "película");
                case 2 -> registrarContenido(teclado, "serie");
                case 3 -> calcularTiempoDeMaraton();
                case 4 -> System.out.println("Saliendo del programa");
                default -> System.out.println("Opción no válida.");
            }
        }
    }

    private void registrarContenido(Scanner teclado, String tipo) {
        System.out.println("Ingrese el nombre de la " + tipo);
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el año de lanzamiento de la " + tipo);
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Ingrese la duración en minutos de la " + tipo);
        int duracionEnMinutos = teclado.nextInt();
        teclado.nextLine();

        Pelicula contenido = new Pelicula();
        contenido.setNombre(nombre);
        contenido.setFechaDeLanzamiento(fechaDeLanzamiento);
        contenido.setTiempoDeDuracionEnMinutos(duracionEnMinutos);

        // Añadir el contenido a la lista
        contenidos.add(contenido);

        System.out.println("Ficha técnica de la " + tipo + ":");
        contenido.muestraFichaTecnica();
       }

    private void calcularTiempoDeMaraton() {
        if (contenidos.isEmpty()) {
            System.out.println("No hay contenidos registrados para calcular el tiempo de maratón.");
            return;
        }

        int tiempoTotal = contenidos.stream()
                .mapToInt(Pelicula::getTiempoDeDuracionEnMinutos)
                .sum();

        int horas = tiempoTotal / 60;
        int minutos = tiempoTotal % 60;

        System.out.println("Tiempo total para maratonear todo el contenido registrado:");
        System.out.printf("%d horas y %d minutos.%n", horas, minutos);
    }
}

