import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Instanciamos el escaner
        Scanner sc = new Scanner(System.in);

//      1 1. Contador simple (for): Ingresa un número N y muestra los números del 1 al N.
//        System.out.println("Ingresa un numero: ");
//        int number = sc.nextInt();
//        for(int i = 1; i <= number; i++) {
//            System.out.println("numero: " + i);
//        }

//      2 2. Cuenta regresiva (for): Ingresa un número N y muestra una cuenta atrás desde N hasta 1.

//        System.out.println("Ingresa un numero: ");
//        int number2 = sc.nextInt();
//
//        for(int i = number2; i > 0; i-- ){
//            System.out.println("numero: " + i);
//        }

//       3 3. Tabla de multiplicar (for): Ingresa un número y muestra su tabla de multiplicar del 1 al 10.

//        System.out.println("Ingresa el numero de la tabla de multiplicar: ");
//        int tableNumber = sc.nextInt();
//
//        for(int i = 0; i <= 10; i++){
//            System.out.println(tableNumber + " x " + i + " = " + tableNumber * i);
//        }

//        4 4. Sumatoria (for): Ingresa un número N y calcula la suma de los números del 1 al N.

//        System.out.println("Ingresa un numero para la acumulacion: ");
//        int number3 = sc.nextInt();
//
//        int acumulador = 0;
//
//        for(int i = 1; i <= number3; i++){
//            acumulador += i;
//        }
//
//        System.out.println("La acumnulacion final es: " + acumulador);

//        5 5. Números pares (while): Ingresa un número N y muestra los números pares desde 1 hasta N.

//        int currentValue = 1;
//
//        System.out.println("Ingresa un numero para ver los pares hasta el: ");
//        int endValue = sc.nextInt();
//
//        System.out.println("Numeros pares hasta " + endValue);
//        while (currentValue <= endValue) {
//            if(currentValue % 2 == 0) {
//                System.out.println("numero par: " + currentValue);
//            }
//            currentValue++;
//        }

//        6 6. Adivinar número (while): Ingresa un número secreto y deja que el usuario adivine hasta
//        acertar.

//          System.out.println("Adivina el numero secreto del 1 al 50. ¡¡comienza el juego!! ");
//          int secretNumber = 7;
//
//          boolean isRight = false;
//
//          while (!isRight) {
//              System.out.println("Ingresa un numero: ");
//              int userNumber = sc.nextInt();
//
//              int result = Math.abs(secretNumber - userNumber) ;
//
//              if(result >= 20) {
//                  System.out.println("Muyyyy friooooo");
//              } else if(result >= 15) {
//                  System.out.println("friooooo");
//              }
//              else if(result >= 10) {
//                  System.out.println("Caliente");
//              }
//              else if(result >= 5) {
//                  System.out.println("Calienteeeee");
//              } else if(result >= 1) {
//                  System.out.println("Uff por poco!!");
//              } else {
//                  System.out.println("Acertaste, felicidades!!. numero secreto: " + secretNumber);
//                  isRight = true;
//              }
//          }
//        7 7. Menú repetitivo (do-while): Muestra un menú simple con opciones hasta que el usuario elija
//        salir.

//          boolean exit = false;
//
//          do {
//              System.out.println("Ingresa un numero: ");
//              System.out.println("Menu");
//              System.out.println("1. Comprar");
//              System.out.println("2. Vender");
//              System.out.println("3. Alquilar");
//              System.out.println("0. Salir");
//
//              int userSelect = sc.nextInt();
//              if(userSelect == 0) {
//                  exit = true;
//              }
//
//
//          } while (!exit);

//        8 8. Suma hasta cero (do-while): Ingresa números y súmalos hasta que se ingrese un cero.

//         boolean isZero = false;
//         int count = 0;
//         do {
//             System.out.println("Ingresa un numero para sumar: ");
//             int userInputNumber = sc.nextInt();
//             if(userInputNumber == 0){
//                 System.out.println("Ingresaste un cero, programa terminado");
//                 isZero = true;
//             } else {
//                 System.out.println(count + " + " + userInputNumber + " = " + (count + userInputNumber));
//                 count += userInputNumber;
//             }
//         } while (!isZero);

//        9 9. Validar contraseña (while): Pide una contraseña hasta que el usuario escriba la correcta.

//          String correctPassword = "1234";
//
//          while (true) {
//              System.out.println("Ingresa tu constraseña");
//              String userInputPasssword = sc.nextLine();
//
//              if (correctPassword.equals(userInputPasssword)) {
//                  System.out.println("Constraseña correcta");
//                  break;
//              } else {
//                  System.out.println("Contraseña incorrecta. Vuelve a intentar");
//              }
//          }
//
//        10 10. Números impares (for): Ingresa un número N y muestra los impares desde 1 hasta N.

//        System.out.println("Ingresa un numero para ver los impares hasta el: ");
//        int userInputNumber = sc.nextInt();
//
//        for (int i = 1; i <= userInputNumber; i++) {
//            if(i % 2 != 0) {
//                System.out.println(i);
//            }
//        }


    }
}