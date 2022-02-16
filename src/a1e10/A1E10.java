import java.util.Scanner;

public class A1E10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //definir variables
        double Base;
        double Altura;
        double Area;
        double Perimetro;

        //pediir los datos
        System.out.print("Ingrese la altura del rectangulo: ");
        Altura = scanner.nextDouble();
        System.out.print("Ingrese la base del rectangulo: ");
        Base = scanner.nextDouble();

        //hacer las operaciones
        Area = Base * Altura;
        Perimetro = (2 * Base) + (2 * Altura);

        System.out.println("El rectangulo tiene un area de: " + Area);
        System.out.println("El rectangulo tiene un perimetro de: " + Perimetro);

    }

}
