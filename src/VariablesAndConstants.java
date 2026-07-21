public class VariablesAndConstants {

    public static void main(String[] args) {
        //VARIABLES
        /*

        //String = texto
        String name = "José";
        System.out.println(name);

        //opcion 1
        String name2 = "Flores";
        System.out.println(name2);



        //opcion 2
        name = "Flores";
        System.out.println(name);
        //int = numero entero

        //cambio de variable
        name = "20";
        System.out.println(name);

        //name = 20; -> esto es error en el tipo de datos String A int y viceversa

        int age = 20;
        System.out.println(age);

         */


        //CONSTANTES (NO CAMBIAN)

        //variables NORMAL SE PUEDE CAMBIAR
        //String email = "estudiante.universitario@gmail.com";
        //System.out.println(email);

        //PARA HACERLO CONSTANTE AGREGAMOS LA PALABRA FINAL A LA VARIABLE DEL TIPO STRING PARA HACERLA UNA VARIABLE CONSTANTE

        //La clase se solo en MAYUSCULA para decir que esto es constante osea no puedo modificarla
        final String EMAIL = "estudiante.universitario@gmail.com";
        //email = "estudiante.universitario@gmail.com"; NO FUNCIONA YA QUE ES CONSTANTE OSEA NO PUEDE CAMBIAR
        System.out.println(EMAIL);

        //PODEMOS USAR la palabra var PALABRA RESERVADA QUE SI IDENTIFICA QUE EL TXT0 QUE
        // ESTA ENTRE COMILLAS SABE QUE ES UN STRING SIN NECESIDAD DE PONERLO NOSOTRO MISMOS
        var email = "estudiante.universitario@gmail.com";
        System.out.println(email);

        //PODEMOS USAR la palabra var PALABRA RESERVADA QUE SI IDENTIFICA QUE EL TXT0 QUE
        // ESTA NO ESTA COMILLAS SABE QUE ES UN INT (ENTERO) SIN NECESIDAD DE PONERLO NOSOTRO MISMOS
        var year = 2026;
        System.out.println(year);

    }
}
