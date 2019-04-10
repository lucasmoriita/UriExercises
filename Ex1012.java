import java.io.BufferedReader;
import java.util.Scanner;

import java.io.InputStreamReader;
import java.io.IOException;

public class Ex1012 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); 
        String[] numeros = input.split(" ");

        double values[] = new double[3];
        for (int i = 0; i < 3; i++) {
            values[i] = Double.parseDouble(numeros[i]);
        }

        double PI = 3.14159;
        double A = values[0];
        double B = values[1];
        double C = values[2];

        double areaTriangulo = A * C / 2;
        double areaCirculo = PI * Math.pow(C, 2);
        double areaTrapezio = (A + B) * C / 2;
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
    }
}
