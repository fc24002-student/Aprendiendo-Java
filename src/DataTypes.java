public class DataTypes {

    static void main(String[] args) {
        //TIPOS DE DATOS PRIMITIVOS
        //int = ENTERO
        int myInt = 37;
        System.out.println(myInt);

        //double = DECIMALES CON ALTA PRECISIÓN
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

        //OTROS DATOS PRIMITIVOS SON; float, long, short, byte

        //long = ES PARA NUMEROS ENTEROS SIN DECIMALES MUY GRANDES
        //float = MAS CORTO QUE DOUBLE TIENE MENOS DECIMALES QUE DOUBLE Y TIENE MENOS PRECISIÓN

        /*
        float (Decimal de precisión simple)
Tamaño en RAM: 4 bytes (32 bits).

Precisión: De 6 a 7 dígitos decimales.

¿Para qué sirve?: Para números decimales donde no necesitas tanta precisión matemática o científica (por ejemplo,
gráficos 3D, coordenadas de videojuegos, porcentajes básicos).

Sintaxis especial: Por defecto, cualquier número con decimal en Java es tratado como double. Para indicarle a Java que
sea float, debes ponerle una f o F al final.

Ejemplo correcto: float precio = 19.99f;
         */

        float myFloat = 2.5f;
        System.out.println(myFloat);

        /*
        long (Entero muy grande)
Tamaño en RAM: 8 bytes (64 bits).

Rango: De -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.

¿Para qué sirve?: Para valores enteros que sobrepasan el límite de un int (~2,000 millones). Por ejemplo: fechas en
milisegundos (System.currentTimeMillis()), identificadores únicos mundiales (UUID/IDs de base de datos grandes) o
distancias astronómicas.

Sintaxis especial: Debes ponerle una L al final del número para que Java sepa que es de tipo long.

Ejemplo correcto: long poblacionMundial = 8000000000L;
         */

        long myLong = 20000000000L;
        System.out.println(myLong);

        /*
        //byte = ES UN ENTERO MUY PEQUEÑO EN RAM 1 byte (SON 8 bits)
        byte (Entero muy pequeño)
Tamaño en RAM: 1 byte (8 bits).

Rango: De -128 a 127.

¿Para qué sirve?: Se usa cuando necesitas ahorrar memoria al máximo y procesas miles o millones de datos pequeños
(por ejemplo, en transmisión de datos por red, procesamiento de imágenes o manipulación de archivos binarios).

Ejemplo correcto: byte edad = 2
         */

        byte myByte = 2;
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
