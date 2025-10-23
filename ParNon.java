import java.util.Scanner;


class ParNon { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        int n;            
        String resultado; 
        
        System.out.print("Ingrese un número entero (N): ");
        n = sc.nextInt(); // Asignamos el valor a 'n'
        System.out.println("El número ingresado fue: " + n);
        if (n % 2 == 0) {
            resultado = "PAR"; 
        } else {
            resultado = "NON (Impar)";
        }
        System.out.println("El número es: " + resultado);

        sc.close(); // Cerramos el scanner
    }
}