//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Ejercicio 1
        showInitializeMessage();

        // Ejercicio 2
        showCalibrationMessage();

        // Ejercicio 3
        showNameDeveloper();

        // Ejercicio 4
        showWelcomeMessage("Robot 1");

        // Ejercicio 5
        System.out.println("Resultado de suma de sensores: " + calculateSensors(24, 10));

        // Ejercicio 6
        isSafeSpeed(80);

        // Ejercicio 7
        executeMove(2);

        // Ejercicio 9
        System.out.println("Valor minimo: " + minValue(10, 20, 1));
    }

//    1. Crea una función que muestre por pantalla 'Robot inicializado'. Llama a la función desde el main.

    public static void showInitializeMessage(){
        System.out.println("Robot inicializado");
    }

//    2. Crea una función que imprima el mensaje 'Sensores calibrados correctamente'. Llama a la
//    función.

     public static void showCalibrationMessage(){
         System.out.println("Sensores calibrados correctamente");
     }

//    3. Crea una función que muestre un mensaje con tu nombre como si fueras el programador del
//    robot.

     public static void showNameDeveloper(){
         System.out.println("Programadaor del robot: Jose");
     }

//    4. Crea una función que reciba el nombre de un robot como parámetro y muestre un mensaje de
//    bienvenida.

      public static void showWelcomeMessage(String robotName) {
          System.out.println("Bienvenido " + robotName);
      }

//    5. Crea una función que reciba dos números y devuelva la suma como si fueran datos de sensores.

      public static int calculateSensors(int sensor1, int sensor2) {
        return sensor1 + sensor2;
      }

//    6. Crea una función que reciba la velocidad de un motor y muestre si es segura (<100) o peligrosa
//    (>=100).

      public static void isSafeSpeed(int speed) {
        if(speed < 100) {
            System.out.println("La velocidad es segura, velocidad actual: " + speed);
        } else {
            System.out.println("La velocidad no es segura, velocidad actual: " + speed);
        }
      }

//    7. Crea una función que reciba un número N y en un bucle muestre 'Movimiento ejecutado' N
//    veces.

      public static void executeMove(int numberMovements) {
        int executedMove = 0;
        while (executedMove < numberMovements) {
            System.out.println("Movimiento ejecutado");
            executedMove++;
        }
      }

//    8. Crea una función que reciba una temperatura y muestre si el robot debe enfriarse (>40 grados) o
//    seguir funcionando.

//    9. Crea una función que reciba tres lecturas de un sensor de distancia y devuelva la más pequeña
//    (mínima).

      public static int minValue(int value1, int value2, int value3 ) {
        int min1 = Math.min(value1, value2);
        return Math.min(min1, value3);
      }

//    10. Crea una función que reciba un número N y, usando un bucle, simule que el robot da N pasos,
//    mostrando cada paso.
}