#include <iostream>
#include <stdio.h>
#include <math.h>

using namespace std;

const double PI = 3.14159;

double triangulo(double base, double altura) {
    return base * altura / 2;
}

double circulo(double raio) {
    return PI * pow(raio, 2);
}

double trapezio(double baseMaior, double baseMenor, double altura) {
    return (baseMaior + baseMenor) * altura / 2;
}

double quadrado(double lado) {
    return pow(lado, 2);
}

double retangulo(double ladoMaior, double ladoMenor) {
    return ladoMaior * ladoMenor;
}

int main()
{
    double A, B, C;
    

    cin >> A >> B >> C;
    
    double TRIANGULO = triangulo(A, C);
    double CIRCULO = circulo(C);
    double TRAPEZIO = trapezio(A, B, C);
    double QUADRADO = quadrado(B);
    double RETANGULO = retangulo(A, B);

    printf ("TRIANGULO: %.3f\n", TRIANGULO);
    printf ("CIRCULO: %.3f\n", CIRCULO);
    printf ("TRAPEZIO: %.3f\n", TRAPEZIO);
    printf ("QUADRADO: %.3f\n", QUADRADO);
    printf ("RETANGULO: %.3f\n", RETANGULO);
    
}