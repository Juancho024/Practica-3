import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*
    Funcion: sumarElementosArreglos
    Complejidad Temporal: O(n)
    Complejidad Espacial: O(n)
    */
    public static int sumarElementosArreglos(int size,int[] a ){
        if(size == 0){
            // Caso base: Si el tamano es 0, la suma es 0
            return 0;
        } else {
            // Pasa recursivo: Suma el ultimo elemento y llama a la funcion con el tamano reducido
            return a[size-1] + sumarElementosArreglos(size-1,a);
        }
    }

    /*
    Funcion: sumariterativo
    Complejidad Temporal: O(n)
    Complejidad Espacial: O(1)
    */
    public static int sumariterativo(int a[]){
        int total = 0;
        // Inicializa la suma total en 0
        for(int i=0;i<a.length;i++){
            // Itera sobre el arreglo sumando cada elemento al total
            total += a[i];
        }
        return total;
    }

    /*
    Funcion: Mayor
    Complejidad Temporal: O(n)
    Complejidad Espacial: O(1)
    */
    public static int Mayor(int[] a,  int size){
        int mayor = 0;
        // Inicializa la variable mayor, asumiendo que los elementos son positivos
        for(int i = 0; i < size; i++){
            if(a[i] > mayor){
                // Actualiza mayor si el elemento actual es mas grande
                mayor = a[i];
            }
        }
        return mayor;
    }

    /*
    Funcion: Mayorrecursivo
    Complejidad Temporal: O(n)
    Complejidad Espacial: O(log n)
    */
    public static int Mayorrecursivo(int[] a,  int i, int j){
        if(i == j){
            // Caso base: Si solo queda un elemento, ese es el mayor
            return a[i];
        }

        int mid = (i+j)/2;
        // Divide el arreglo en dos mitades
        int left = Mayorrecursivo(a,i,mid);
        // Llama recursivamente a la mitad izquierda
        int right = Mayorrecursivo(a,mid+1,j);
        // Llama recursivamente a la mitad derecha

        return Math.max(left,right);
        // Combina: Devuelve el mayor entre los resultados de la izquierda y derecha
    }

    /*
    Funcion: invertir
    Complejidad Temporal: O(n)
    Complejidad Espacial: O(n)
    */
    public static String invertir(String s){
        StringBuilder sb = new StringBuilder();
        // Usa StringBuilder para construir eficientemente la cadena invertida
        for(int i = s.length() -1; i >= 0;i--){
            // Itera de atras hacia adelante y anade cada caracter
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    /*
    Funcion: invertirRecursivo
    Complejidad Temporal: O(n^2) o O(n) dependiendo de la implementacion de String.valueOf y concatenacion
    Complejidad Espacial: O(n)
    */
    public static String invertirRecursivo(String s,int i){
        if(i == 0){
            // Caso base: Si se llega al inicio de la cadena (indice 0)
            return String.valueOf(s.charAt(i));
        }
        else{
            // Pasa recursivo: Devuelve el caracter actual mas el resultado de la llamada con i-1
            return  (String.valueOf(s.charAt(i)) + invertirRecursivo(s,--i));
        }
    }

    public static void main(String[] args) {
        int tamanio = 0;
        int tamanio1=0;
        // Se mantienen los 3 Scanners como solicitaste
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        //1. Algoritmos de SUMA
        System.out.printf("Ingrese el tamano del Arreglo: ");
        tamanio1 = sc.nextInt();

        int[] numeros = new int[tamanio1];
        System.out.printf("Ingrese los numeros seperados por espacio: ");
        for(int i = 0; i < tamanio1; i++){
            numeros[i] = sc1.nextInt();
        }


        System.out.println("Arreglo: " + Arrays.toString(numeros));
        System.out.println("\n--- Pruebas de Suma ---");
        System.out.println("Suma Recursiva: " + sumarElementosArreglos(tamanio1,numeros));
        System.out.println("Suma Iterativa: " + sumariterativo(numeros));


        //2. Algoritmos de MAYOR

        System.out.printf("\nIngrese el tamano del Arreglo: ");
        tamanio = sc.nextInt();

        int[] aleatorio = new int[tamanio];
        for(int i = 0; i < tamanio; i++){
            aleatorio[i] = (int) (Math.random() * 700);
        }
        System.out.println("\n--- Arreglo de Prueba Generado ---\n" + Arrays.toString(aleatorio));

        System.out.println("\n--- Pruebas de Mayor ---");
        System.out.println("Mayor Iterativo: " + Mayor(aleatorio,tamanio));
        System.out.println("Mayor Recursivo (Divide y Venceras): " + Mayorrecursivo(aleatorio,0,tamanio - 1));


        //3. Algoritmos de INVERTIR Cadena-

        System.out.println("\n--- Pruebas de Inversion de Cadena ---");
        System.out.print("Ingresa la cadena: ");
        // Se usa un nuevo Scanner para esta lectura para asegurar que nextLine funcione
        String cadena = new Scanner(System.in).nextLine();

        // Version Iterativa
        String cadenaInvertidaIterativa = invertir(cadena);
        System.out.println("Original: " + cadena);
        System.out.println("Invertida Iterativa: " + cadenaInvertidaIterativa);

        // Version Recursiva
        String cadenaInvertidaRecursiva = invertirRecursivo(cadena,cadena.length()-1);
        System.out.println("Invertida Recursiva: " + cadenaInvertidaRecursiva);

        sc.close();
        sc1.close();
        sc2.close();
    }
}