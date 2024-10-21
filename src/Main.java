import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        List<rectangulo> lstrectangulos=new ArrayList<>();
        List<Triangulo> lstTriangulos=new ArrayList<>();
        List<Circulo> lstCirculos=new ArrayList<>();
        int opcion;

        do {
            System.out.println("Menú de Calcular Area y Perimetro Figuras");
            System.out.println("1. Rectángulo");
            System.out.println("2. Triángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
           opcion= lectura.nextInt();

            switch (opcion) {
                case 1:
                    rectangulo rec1= new rectangulo();
                    System.out.print("Ingrese la base del rectángulo: ");
                    rec1.setBase(lectura.nextDouble());
                    System.out.print("Ingrese la altura del rectángulo: ");
                    rec1.setAltura(lectura.nextDouble());
                    lstrectangulos.add(rec1);

                    System.out.println("Área del Rectángulo: " + rec1.calcularArea());
                    System.out.println("Perímetro del Rectángulo: " + rec1.calcularPerimetro());
                    break;

                case 2:
                    Triangulo Tri1=new Triangulo();
                    System.out.print("Ingrese la base del triángulo: ");
                    Tri1.setBase(lectura.nextDouble());
                    System.out.print("Ingrese la altura del triángulo: ");
                    Tri1.setAltura(lectura.nextDouble());
                    System.out.print("Ingrese el lado 1 del triángulo: ");
                    Tri1.setAltura(lectura.nextDouble());
                    System.out.print("Ingrese el lado 2 del triángulo: ");
                    Tri1.setLado2(lectura.nextDouble());
                    System.out.print("Ingrese el lado 3 del triángulo: ");
                   Tri1.setLado3(lectura.nextDouble());
                   lstTriangulos.add(Tri1);
                    System.out.println("Área del Triángulo: " + Tri1.calcularArea());
                    System.out.println("Perímetro del Triángulo: " + Tri1.calcularPerimetro());
                    break;

                case 3:
                    Circulo Cir1= new Circulo();
                    System.out.print("Ingrese el radio del círculo: ");
                    Cir1.setRadio(lectura.nextDouble());

                    lstCirculos.add(Cir1);
                    System.out.println("Área del Círculo: " + Cir1.calcularArea());
                    System.out.println("Perímetro del Círculo: " + Cir1.calcularPerimetro());
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

            System.out.println();
        } while (opcion != 4);

        lectura.close();
    }
}
