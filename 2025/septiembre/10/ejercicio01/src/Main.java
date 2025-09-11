//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. Datos personales: Declara variables para almacenar el nombre y la edad de una persona.
        // Muestra un mensaje en pantalla con esos datos concatenados en una sola frase.

        String nameOfStudent = "Jose";
        int ageOfStudent = 22;

        System.out.println("Nombre de estudiante: " + nameOfStudent + " edad: " + ageOfStudent);

        // 2. Constante matemática: Declara una constante con el valor de π y una variable con el radio de un
        // círculo. Calcula y muestra el área del círculo.

        final double PI = 3.14159;
        int radioCirculo = 5;

        System.out.println( PI * Math.pow(radioCirculo, 2));

        // 3. Número positivo: Declara una variable entera con cualquier valor. Usa una estructura
        // condicional para comprobar si el número es positivo y muestra un mensaje en caso afirmativo.

        int isNumberPositive = 10;

        if (isNumberPositive > 0) {
            System.out.println("El numero es positivo!!!");
        }

        // 4. Número positivo o negativo: Declara una variable entera. Mediante un condicional if-else,
        // muestra si el número es positivo o negativo.

        int isNumberPositive2 = -10;

        if (isNumberPositive2 > 0) {
            System.out.println("El numero es positivo!!!");
        } else {
            System.out.println("El numero es negativo!!!");
        }


        // 5. Clasificación de notas: Declara una variable con una calificación numérica. Evalúa con if-else-if
        // si la nota corresponde a Sobresaliente (≥90), Aprobado (≥70 y <90) o Reprobado (<70).

        int qualification = 75;

        if (qualification >= 90) {
            System.out.println("Sobresaliente!!!");
        }
        else if (qualification >= 70) {
            System.out.println("Aprobado!!!");
        } else {
            System.out.println("Reprobado!!! :(");
        }

        // 6. Comparación de números: Declara dos variables enteras. Usa un condicional para determinar
        // cuál de los dos números es mayor y muestra el resultado.

        int num1 = 25;
        int num2 = 15;

        if (num1 > num2) {
            System.out.println("El primer numero es mayor");
        } else {
            System.out.println("El segundo numero es mayor");
        }

        // 7. Número par o impar: Declara una variable entera. Verifica si el número es par o impar y muestra
        // el mensaje correspondiente.

        int isNumberPar = 14;

        if (isNumberPar % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero no es par");
        }

        // 8. Mayoría de edad: Declara una variable para la edad de una persona. Mediante un condicional,
        // muestra si la persona es mayor o menor de edad (considerando 18 años como límite).

        int ageOfPerson = 17;

        if (ageOfPerson >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("No eres mayor de edad, a tu casaa!!");
        }

        //  9. Días de la semana: Declara una variable entera que represente un día de la semana (1 = lunes,
        // 2 = martes, 3 = miércoles, etc.). Utiliza un switch para mostrar el nombre del día correspondiente.

        int dayOfWeek = 4;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Hoy es Lunes");
                break;
            case 2:
                System.out.println("Hoy es Martes");
                break;
            case 3:
                System.out.println("Hoy es Miercoles");
                break;
            case 4:
                System.out.println("Hoy es Jueves");
                break;
            case 5:
                System.out.println("Hoy es Viernes");
                break;
            default:
                System.out.println("No elegiste un dia se la semana valido");
        }

        //  10. Aplicar descuento: Declara una variable con el precio de un producto y una variable booleana
        // que indique si tiene descuento. Si la variable booleana es verdadera, aplica un 10% de descuento
        // y muestra el precio final.


        int productPrice = 45;
        boolean hasDescount = true;

        if (hasDescount) {
            System.out.print("El producto tiene descuento, precio total: " + ((productPrice * 100) * 0.1));
        } else {
            System.out.print("El producto no tiene descuento, precio total: " + productPrice);
        }
    }
}