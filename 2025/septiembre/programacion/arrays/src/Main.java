import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // --- SECCIÓN 1: DATOS INICIALES ---
        String[] nombres = {
                "Ruben Dario Anzola Sánchez",
                "David Arranz González",
                "Alexei Benitez Ortega",
                "Juan Gabriel Callejo Vidal",
                "Marcos Cordeiro Paz",
                "Noelia Costas Piñeiro",
                "Natasha da Silva Fernandes",
                "Izzan Fernández Lareu",
                "Candela Fernández Lombar",
                "José Argenis García Valderrama",
                "Lorena Goberna Milego",
                "Castor Gonzalez de Araujo",
                "Ángel Iglesias Martínez",
                "Rafael Mendoza Ferreira",
                "Carolina Míguez Baquero",
                "Yelena Pazos Gonzalez",
                "Santiago Pérez Carral",
                "Francisco Javier Rodríguez Suarez",
                "Gabriel Villar Fernández"
        };

        // --- SECCIÓN 2: MEZCLA ALEATORIA DEL ARRAY (FISHER-YATES SHUFFLE) ---

        // 1. Creamos una copia del array original para no modificarlo. Trabajaremos sobre la copia.
        String[] personasAleatorias = Arrays.copyOf(nombres, nombres.length);

        // 2. Creamos una instancia de Random para generar índices aleatorios.
        Random rand = new Random();

        // 3. Aplicamos el algoritmo de mezcla Fisher-Yates.
        // Recorremos el array desde el final hacia el principio.
        for (int i = personasAleatorias.length - 1; i > 0; i--) {
            // Elegimos un índice aleatorio 'j' entre 0 y el índice actual 'i'.
            int j = rand.nextInt(i + 1);

            // Intercambiamos el elemento en la posición 'i' con el de la posición aleatoria 'j'.
            String temp = personasAleatorias[i];
            personasAleatorias[i] = personasAleatorias[j];
            personasAleatorias[j] = temp;
        }

        // --- SECCIÓN 3: MOSTRAR PAREJAS Y GESTIONAR IMPARES ---

        Scanner scanner = new Scanner(System.in);
        System.out.println("Resultado de los emparejamientos aleatorios:");
        System.out.println("---------------------------------------------");

        // 4. Recorremos el array mezclado de dos en dos para formar las parejas.
        // El bucle se detiene antes de llegar al último elemento si el total es impar.
        for (int i = 0; i < personasAleatorias.length ; i+=2) {

            // Obtenemos a las dos personas de la pareja actual.
            String persona1 = personasAleatorias[i * 2];
            String persona2 = personasAleatorias[i * 2 + 1];

            // 5. Comprobamos si estamos en la última pareja Y si el número de personas es impar.
            // Si ambas condiciones son ciertas, formamos un trío.
            boolean esUltimaPareja = (i == (personasAleatorias.length / 2) - 1);
            boolean esImpar = (personasAleatorias.length % 2 != 0);

            if (esImpar && esUltimaPareja) {
                // Obtenemos a la persona que sobró (la última del array).
                String personaSobrante = personasAleatorias[personasAleatorias.length - 1];
                System.out.println("Grupo " + (i + 1) + ": " + persona1 + ", " + persona2 + " y " + personaSobrante);
                System.out.println("(Se ha formado un trío con el participante sobrante)");

            } else {
                // Si no, simplemente mostramos la pareja normal.
                System.out.println("Grupo " + (i + 1) + ": " + persona1 + " y " + persona2);
            }

            // 6. Pausamos para esperar el 'Enter' del usuario, excepto para el último grupo.
            if (!esUltimaPareja) {
                System.out.print("\nPresiona Enter para mostrar el siguiente grupo...");
                scanner.nextLine();
                System.out.println();
            }
        }

        System.out.println("---------------------------------------------");
        System.out.println("¡Todos los grupos han sido revelados!");
        scanner.close();
    }
}