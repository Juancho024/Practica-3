import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static int sumarElementosArreglos(int size,int[] a ){
        if(size == 0){
            return 0;
        } else {
            return a[size-1] + sumarElementosArreglos(size-1,a);
        }
    }

    public static int sumariterativo(int a[]){
        int total = 0;
        for(int i=0;i<a.length;i++){
            total += a[i];
        }
        return total;
    }

    public static int Mayor(int[] a,  int size){
        int mayor = 0;
        for(int i = 0; i < size; i++){
            if(a[i] > mayor){
                mayor = a[i];
            }
        }
        return mayor;
    }

    public static int Mayorrecursivo(int[] a,  int i, int j){
        if(i == j){return a[i];}

        int mid = (i+j)/2;
        int left = Mayorrecursivo(a,i,mid);
        int right = Mayorrecursivo(a,mid+1,j);

        return Math.max(left,right);
    }
    public static String invertir(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() -1; i >= 0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String invertirRecursivo(String s,int i){
        if(i == 0){
            return String.valueOf(s.charAt(i));
        }
        else{
            return  (String.valueOf(s.charAt(i)) + invertirRecursivo(s,--i));
        }
    }

    public static void main(String[] args) {
        int tamanio = 0;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.printf("Ingrese el tamano del Arreglo: ");
        tamanio = sc.nextInt();



        String cadena;

        System.out.print("Ingresa la cadena: ");
        cadena = sc2.nextLine();

        int[] aleatorio = new int[tamanio];

        for(int i = 0; i < tamanio; i++){
            aleatorio[i] = (int) (Math.random() * 700);
        }

        //


        System.out.print("Version Original: " + cadena);
        cadena = invertirRecursivo(cadena,cadena.length()-1);
        System.out.println("\nVersion invertida: " + cadena);
        System.out.println("\n" + Arrays.toString(aleatorio));
        System.out.println("Suma de Valores: " + sumarElementosArreglos(tamanio,aleatorio));
        System.out.println("Suma Iterativa: " + sumariterativo(aleatorio));
        System.out.println("Mayor: " + Mayor(aleatorio,tamanio));
        System.out.println("Mayor Recursivo: " + Mayorrecursivo(aleatorio,0,tamanio - 1));

    }
}
