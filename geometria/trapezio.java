package geometria;

abstract class trapezio {
    double lado1b, lado1a, lado2b, lado2a, comprimento;

    double trapezioArea(){
        double areaT = lado1a * lado1b;
        return areaT;
    }
    double trapezioPerimetro(){
        double perimetroT = lado1a + lado2b + lado2a + lado1b;
        return perimetroT;
    }
    double trapezioVolume(){
        double volumeT = trapezioArea() * comprimento;
        return volumeT;
    }
}
