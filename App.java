import java.util.Scanner;
public class App{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        boolean bandera = true;
        while(bandera){
            mostrarMenu();
            int opcion = in.nextInt();
            in.nextLine();
            gestionarOpciones(opcion);
            if (opcion == 5) {
                bandera = false;
            }
        }
    }
    public static void mostrarMenu(){
        System.out.println("\nMenu de calculadora");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("\nIntroduce opcion");
        System.out.print(" >");
    }
    public static void gestionarOpciones(int opcion){
        switch(opcion){
            case 1:
                sumar();
            break;
            case 2:
                restar();
            break;
            case 3:
                multiplicar();
            break;
            case 4: 
                dividir();
            break;
            case 5:
                System.out.println("Saliendo...");
            break;
            default:
                System.out.println("Error");
            break;
        }
    }
    public static void sumar(){
        System.out.print("Ingresa numero 1: ");
        int num1 = in.nextInt();
        System.out.print("Ingresa numero 2: ");
        int num2 = in.nextInt();
        System.out.println("El resultado es: " +(num1 + num2));
    }
    public static void restar(){
        System.out.print("Ingresa numero 1: ");
        int num1 = in.nextInt();
        System.out.print("Ingresa numero 2: ");
        int num2 = in.nextInt();
        System.out.println("El resultado es: " +(num1 - num2));
    }
    public static void multiplicar(){
        System.out.print("Ingresa numero 1: ");
        int num1 = in.nextInt();
        System.out.print("Ingresa numero 2: ");
        int num2 = in.nextInt();
        System.out.println("El resultado es: " +(num1 * num2));
    }
    public static void dividir(){
        try{
            System.out.print("Ingresa numero 1: ");
            int num1 = in.nextInt();
            System.out.print("Ingresa numero 2: ");
            int num2 = in.nextInt();
            System.out.println("El resultado es: " +(num1 / num2));
        }catch(ArithmeticException ex){
            System.out.println("Error, no se puede dividir entre 0");
        }
        
    }
}