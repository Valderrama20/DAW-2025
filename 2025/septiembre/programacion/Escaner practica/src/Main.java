import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // nota: Para obtener la entrada del usuario, podemos utilizar la utilidad
        // Scanner, tenemos que crear una instancia y utilizar el metodo ".nextInt()" o ".nextLine()"
        Scanner sc = new Scanner(System.in);

        // 1. Sensor de temperatura: Ingresa una temperatura en °C. Si es < 0 muestra 'Hace frío', si es >
        // 30 muestra 'Hace calor', si no 'Clima templado'.

        System.out.println("Ingresa un temperatura en grados centigrados: ");
        int nowTemperature = sc.nextInt();
        // utilizamos otro nextLine pera evitar que el siguiente tome un espacio en blanco
        sc.nextLine();
        if(nowTemperature < 0) {
            System.out.println("Hace frio");
        } else if (nowTemperature > 30) {
            System.out.println("Hace calor");
        } else {
            System.out.println("Clima templado");
        }

        // 2. Detector de color favorito: Ingresa un color. Si es 'rojo', 'azul' o 'verde', muestra 'Es un color
        // primario', si no, 'Otro color'.

        System.out.println("Ingresa tu color favorito: ");
        String favoriteColor = sc.nextLine();

        if (favoriteColor.equals("rojo") || favoriteColor.equals("azul") || favoriteColor.equals("verde") ) {
            System.out.println("Es un color primario");
        }else {
            System.out.println("Otro color");
        }

        // 3. Radar de velocidad: Ingresa la velocidad de un coche. Si es mayor a 120 km/h muestra
        //  'Multa', si es menor o igual 'Velocidad correcta'.

        System.out.println("Ingresa la velocidad del auto");
        int carSpeed = sc.nextInt();

        if(carSpeed <= 120) {
            System.out.println("Velocidad correcta");
        } else {
            System.out.println("Multa");
        }

        // 4. Clasificador de animales: Ingresa un animal. Si es 'perro' o 'gato' muestra 'Doméstico'. Si es
        // 'tigre' o 'león' muestra 'Salvaje'. Otro caso: 'No clasificado'.

        System.out.println("ingresa un animal: ");
        sc.nextLine(); // para limpiar el imput
        String animal = sc.nextLine();

        if(animal.equals("perro") ||animal.equals("gato")) {
            System.out.println("Domestico");
        } else if (animal.equals("tigre") || animal.equals("león")) {
            System.out.println("Salvaje");
        } else {
            System.out.println("No clasificado");
        }

        // 5. Entrada a un concierto: Ingresa la edad. Si es menor de 12 no puede entrar, si está entre 12
        // y 17 necesita adulto, si es 18 o más puede entrar solo.

        

        // 6. Semáforo: Ingresa un color ('rojo', 'amarillo', 'verde'). Muestra: 'Detente', 'Precaución' o
        // 'Avanza'.


        // 7. Juego de adivinanza: Ingresa un número secreto y luego una suposición. Indica si acertó, si
        // el número secreto es mayor o menor.


        // 8. Comparador de palabras: Ingresa dos palabras. Si son iguales, muestra 'Coinciden'. Si no,
        // 'No coinciden'.


        // 9. Sistema de votación: Ingresa 3 votos (String: 'A', 'B' o 'C'). Muestra quién ganó o si hay
        // empate.


       // 10. Calculadora básica: Ingresa dos números y una operación (+, -, *, /). Muestra el resultado
       // según la operación.
    }
}