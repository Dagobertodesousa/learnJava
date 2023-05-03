package geometria;

abstract class triangulo {
    double lado1, lado2, lado3, base, altura, comprimento;

    double trianguloArea(){
        double areaT = base * altura;
        return areaT;
    }
    double trianguloPerimetro(){
        double perimetroT = lado1 + lado2 + lado3;
        return perimetroT;
    }
    double trianguloVolume(){
        double volumeT = trianguloArea() * comprimento;
        return volumeT;
    }
}
