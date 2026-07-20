import java.util.Scanner;

public class HelloWorldExercises {

    // 1. Imprime un mensaje que diga tu nombre en lugar de Hola Mundo

    public static void main(String[] args) {
        //System.out.println("Hola soy José Flores");

    /* 2. Imprime dos lineas: "Hola" y luego "Mundo" con un solo println

    String Primero = "Hola"; //GUARDA EN TEXTO EN LA VARIABLE PRIMERO LAS PALABRAS "HOLA"
    String Segundo = " Mundo"; //GUARDA EN TEXTO EN LA VARIABLE SEGUNDO LAS PALABRAS " MUNDO"

    System.out.println(Primero + Segundo); //IMPRIME EN UNA SOLA LINEA AMBAS PALABRAS LLAMADAS POR LAS VARIABLES
     */

        // 3. Añade un comentario sobre que hace cada linea del pŕogramo

        // 4 Crea un comentario en varias lineas

        // 5. Imprime tu edad, tu color favorito y tu ciudad
/*
    Scanner teclado = new Scanner (System.in);

    System.out.println("¿Cual es tu nombre?");
    String nombre = teclado.nextLine();

    System.out.println("¿Cuantos años tienes?");
    int edad = teclado.nextInt();
    teclado.nextLine();

    System.out.println("¿Cual es tu color favorito?");
    String color = teclado.nextLine();

    System.out.println("¿Cual es tu ciudad?");
    String ciudad = teclado.nextLine();

    System.out.println("Tus datos son:\n" + "Nombre: " + nombre + "\nEdad: " + edad + " Años" + " \nColor Favorito: " + color + " \nCiudad: " + ciudad);
    teclado.close();
*/

        // 6. Explora los diferente System.xxx.println() más alla de "out".
/*
    System.out.println("Holaaa");
    System.err.println("HOLAAA");
    System.in.println("holaaa");
 */

        // 7. Utiliza varios println para imprimir una frase
/*
    System.out.println("Si puedes ");
    System.out.println("imaginarlo,");
    System.out.println("puedes programarlo");
    */

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando simbolos).LLAMAMOS LA CLASE DE LA CARA FELIZ
        //CaraFelizAscii.Terminal();

    // 9. Intenta ejecutar el programa sin el metodo main y observa el error. (Traducción: "Se esperaba un identificador / nombre de variable o método")
    // EL ERROR QUE SALE EN TERMINAL ES java: <identifier> expected
    /*
     * EXPLICACIÓN DEL ERROR:
     * * 1. Si dejamos instrucciones ejecutable (como System.out.println) sueltas
     * dentro de la clase sin un método que las envuelva, Java lanza el error de
     * compilación "java: <identifier> expected" porque las instrucciones solo
     * pueden vivir dentro de métodos.
     * * 2. El método "public static void main(String[] args)" es el ÚNICO punto de
     * entrada que busca la Máquina Virtual de Java (JVM) para saber por dónde
     * comenzar a ejecutar un programa. Sin él, Java no sabe qué código arrancar.
     */

        // 10.  Intenta cambiar el nombre del archivo a uno diferente del de la clase y compilalo
        /*
// 10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo

 * EXPLICACIÓN TÉCNICA:
 * Error: java: class HelloWorldExercises is public, should be declared in a file named HelloWorldExercises.java
 *
 * 1. REGLA DEL COMPILADOR (javac): Java exige que el nombre del archivo fuente (.java)
 * coincida exactamente con el nombre de la clase 'public' declarada en él.
 * 2. CARGA DE CLASES (ClassLoader): La JVM localiza los archivos de bytecode (.class)
 * en el sistema de archivos basándose estrictamente en el nombre de la clase pública.
 * 3. SOLUCIÓN: Si renombras el archivo a "Main.java", debes renombrar la clase a "public class Main".
 * Si prefieres mantener "public class HelloWorldExercises", el archivo DEBE llamarse "HelloWorldExercises.java".
 */

   }



}
// 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando simbolos).

class CaraFelizAscii {
    public static void Terminal() {
        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("             °°°°°°°°°°°°°°°°°");
        System.out.println("            °#################°");
        System.out.println("           °###  #########  ####°");
        System.out.println("          °####  #########  #####°");
        System.out.println("         °########################°");
        System.out.println("         °#######################°");
        System.out.println("         °#######################°");
        System.out.println("          °####  #########  ####°");
        System.out.println("           °#####         #####°");
        System.out.println("            °#################°");
        System.out.println("              °°°°°°°°°°°°°°°°");
    }
}
