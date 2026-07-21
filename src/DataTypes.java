public class DataTypes {

    public static void main(String[] args) {
        //TIPOS DE DATOS PRIMITIVOS
        //int = ENTERO
        int myInt = 37;
        System.out.println(myInt);

        //double = DECIMALES
        double myDouble = 1.70;
        System.out.println(myDouble);

        //char = UN SOLO CARCTER SOLO LA "A" Y ETC se usa con COMILLA SIMPLES ''

        char myChar = 'a';
        System.out.println(myChar);

        //boolean =  DATOS QUE SOLO SON VERDADERO O FALSO =  TRUE, FALSE y se pueden ombinar para dar resaultados
        //de VERDADERO O FALSO

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        //OTROS DATOS PRIMITIVOS SON; float, long, byte

        //long = MAS LARGO QUE DOUBLE
        //float = MAS CORTO QUE DOUBLE

        float myFloat = '2';
        System.out.println(myFloat);

        long myLong = '2';
        System.out.println(myLong);

        byte myByte = '2';
        System.out.println(myByte);

        //String = ES UN DATO PRIMITIVO POR SER CADENA DE TEXTO PEROO ES MAS UNA CLASE OSEA UN OBJETO YA QUE SE USA MUCHO
        // EN CADENA DE TEXTOS

        String myString = "HOLA CADENA DE TEXTO";
        System.out.println(myString);

        //COMO PODRIAMOS SABER EL TIPO DE DATO EN COMPILACIÓN?
        //LA MEJOR FORMA DE SABER ES QUE SI TRABAJAMOS CON OBJETOS TENEMOS UNA CLASE Boolean esto es una clase, boolean ESTO ES UN DATO PRIMITIVO
        //COMO SABER EL TIPO DE DATOS DE UN STRING COMO ES UNA CLASE SI AL TNER UNA CLASE AL TENER UN OBJETOS PODEMOS TENER OPERACIONES EN EL COMO
        // GET CLASS Y GETSIMPLENAME

        System.out.println(myString.getClass().getSimpleName());

        //RESULTADO EN TERMINAL ES String esto se hace al tener una clase ESTO ES UNA COMPROBACIÓN EN TIEMPOS DE EJECUCIÓN


        }
}
