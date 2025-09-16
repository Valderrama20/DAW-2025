//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        // 1. Declara una variable saldo y otra booleana que indique si la persona está habilitada para
        // realizar la transacción. Muestra 'Puede hacerla' si tiene saldo y además está habilitada

        double balance = 100.0;
        boolean isEnabled = true;

        if(isEnabled && balance > 0) {
          System.out.println("Puede hacer la transferencia, saldo: " + balance + ", habilitado: " + isEnabled);
        }

        // 2. Aprobación con condiciones: Declara una variable con la nota y otra booleana que indique si
        // asistió a clases. Muestra 'Aprobado' solo si la nota es mayor o igual a 60 y asistió a clases.

        int studentNote = 70;
        boolean isAssisted = true;

        if(isAssisted && studentNote >= 60) {
            System.out.println("El alumno aprobo y asistio a clases, nota: " + studentNote);
        }

        //  3. Rango válido: Declara una variable entera. Verifica si está entre 50 y 100 inclusive. Muestra
        // 'Dentro del rango' o 'Fuera del rango'.

        int range = 160;

        if(range >= 50 && range <= 100) {
            System.out.println("Varible dentro de rango, valor: " + range);
        } else {
            System.out.println("Varible fuera de rango, valor: " + range);
        }

        // 4. Usuario y contraseña: Declara dos variables String, una para usuario y otra para contraseña. Si
        // usuario es 'admin' y contraseña es '1234', muestra 'Acceso permitido', en caso contrario 'Acceso
        //  denegado'.

        String user = "Jose";
        String password = "1234";

        // nota: En java utilizamos el metodo "equals()" para comparar strings
        if(user.equals("Jose") && password.equals("12345")) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }

        // 5. Compra con descuento adicional: Declara una variable con el precio y otra booleana que indique
        //  si tiene tarjeta de cliente. Si el precio es mayor a 200 aplica un 15% de descuento, si además tiene
        // tarjeta aplica un 5% extra.

        int price = 210;
        boolean hasClientCard = true;
        double finalPrice = 200.0;

        if (price > 200) {
            finalPrice = finalPrice * 0.75;
        }

        if (hasClientCard) {
            finalPrice = finalPrice * 0.95;
        }

        System.out.println("Precio final con descuento: " + finalPrice);


        // 6. Categoría de edad: Declara una variable con la edad de una persona. Si es menor de 12
        // muestra 'Niño', si está entre 12 y 17 'Adolescente', entre 18 y 64 'Adulto', y 65 o más 'Adulto
        // mayor'.

        int personAge = 70;

        if(personAge < 12){
            System.out.println("Niño");
        } else if ( personAge >= 12 && personAge <= 17) {
            System.out.println("Adolescente");
        }
        else if ( personAge >= 18 && personAge <= 64) {
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }

        // 7. Validar número par y múltiplo de 5: Declara un número entero. Verifica si es par y además
        // múltiplo de 5. Muestra el mensaje correspondiente.

        int number = 21;

        if(number % 2 == 0 && number % 5 == 0) {
            System.out.println("El numero es par y multiplo de 5, numero: " + number);
        } else {
            System.out.println("El numero no es par o multiplo de 5, numero: " + number);
        }

        // 8. Contraseña segura: Declara una variable String con una contraseña. Si la longitud es mayor o
        // igual a 8 y contiene el carácter '@' muestra 'Contraseña segura', en caso contrario 'Contraseña
        // insegura'.

        String password2 = "1234567@";

        // nota: para saber el largo de un string, podemos utilizar el metodo ".length()"
        // nota: para saber si el string contiene un elemento, podemos utilizar ".contains()"

        if (password2.length() >= 8 && password2.contains("@")) {
            System.out.println("Constraseña segura");
        } else {
            System.out.println("Constraseña insegura");
        }

        // 9. Evaluar dos números: Declara dos números enteros. Si ambos son positivos muestra 'Ambos
        // positivos', si ambos son negativos 'Ambos negativos', en otro caso 'Son diferentes'.

        int num1 = -20;
        int num2 = -20;

        if(num1 > -1 && num2 > -1) {
            System.out.println("Ambos positivos");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("Ambos negativos");
        } else {
            System.out.println("Son diferentes");
        }
        System.out.println("num1: " + num1 + " num2: " + num2);

        //  10. Operador ternario: Declara una variable entera con una edad. Usa el operador ternario para
        // guardar en una variable String 'Mayor de edad' o 'Menor de edad' según corresponda, y muéstralo.

        int age = 15;

        String message = age >= 18 ? "Mayor de edad" : "Menor de edad";

        System.out.println(message);



    }
}