public class BegginerExercises {

//EJERCICIOS VARIABLES Y CONSTANTES

    public static void main(String[] args) {
        Ejercicio1.Terminal1();
        Ejercicio2.Terminal2();
        Ejercicio3.Terminal3();
        Ejercicio4.Terminal4();
        Ejercicio5.Terminal5();
        Ejercicio6.Terminal6();
        Ejercicio7.Terminal7();
        Ejercicio8.Terminal8();
        Ejercicio9.Terminal9();
        Ejercicio10.Terminal10();

    }
}

// 1. Declara una varables de tipo String y asignale tu nombre.

class Ejercicio1 {
    public static void Terminal1() {
        String name = "Flores";
        System.out.println(name);
    }
}

// 2. Crea una vaiabe de tipo int y asignale tu edad.

class Ejercicio2 {
    public static void Terminal2() {
        int age = 20;
        System.out.println(age);
    }
}

// 3.  Declara una variable double con tu altura en metros.

class Ejercicio3 {
    public static void Terminal3() {
        double altura = 1.71;
        System.out.println(altura);

    }
}

// 4. Declara una variable de tipo boolean si te gusta programar

class Ejercicio4 {
    public static void Terminal4() {
        boolean siMeguta = true;
        System.out.println("Te gusta Programar? " + siMeguta);
    }
}

// 5. Declara una constante con tu email.

class Ejercicio5 {
    public static void Terminal5() {
        final String email = "universitario.123@gmail.com";
        System.out.println(email);
    }
}

// 6. Crea una variable de tiṕo char y guárdale tu inicial.

class Ejercicio6 {
    public static void Terminal6() {
        char inicialName = 'J';
        System.out.println(inicialName);
    }
}

// 7. Declara una variable de tipo String con tu localidad y a continuación cambia su valor y vuelve a imprimirla

class Ejercicio7 {
    public static void Terminal7() {
        String localidad = "Localidad1";
        localidad = "LOCALIDAD2";
        System.out.println(localidad);
    }
}

// 8. Crea una variable int llamada a, otra b, e imnprime la suma de ambas.

class Ejercicio8 {
    public static void Terminal8() {
        int a = 3;
        int b = 2;
        System.out.println("Valor a: " + a);
        System.out.println("Valor b: " + b);
        int suma = a + b;
        System.out.println("La suma de a + b es: " + suma);
    }
}

// 9. Imprime el tipo de dos variables creadas anteriormente.

class Ejercicio9 {
    public static void Terminal9() {

        String localidad = "Localidad1";
        System.out.println(localidad.getClass().getSimpleName());

        Double altura = 1.71;
        System.out.println(altura.getClass().getSimpleName());

    }
}

// 10. Intenta declarar una variable sin inicializarla y luego asignale un valor antes de imprimirla.

class Ejercicio10 {
    public static void Terminal10() {

        int metros; //VARIABLE INICIALIZADA SIN VALOR

        metros = 30; //LE ASIGNAMOS VALOR A LA VARIABLE = 30

        System.out.println(metros + " m"); //IMPRIMIMOS LA VARIABLE YA CON DATO

        /*
        SI TRATAMOS DE IMPRIMIR UNA VARIABLE SIN INICIALIZARLA NO COMPILA
        java: cannot find symbol
        symbol:   variable metros
        location: class Ejercicio10

        SI IMPRIMIMOS LA VARIABLE SIN VALOR SOLO INICIALIZADA PASA ESTO:
        java: variable metros might not have been initialized
        (Traducción: "La variable metros podría no haber sido inicializada")

         * NOTA TÉCNICA:
         En Java, las variables locales DEBEN tener un valor asignado antes de ser
         leídas o impresas. Si intentamos usarlas sin inicializarlas previamente,
         el compilador dará el error: "variable might not have been initialized".
         */
    }
}
