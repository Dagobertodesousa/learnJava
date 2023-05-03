package geometria;

abstract class quadrado {
    double base, altura, comprimento;

    double quadradoArea(){
        double areaQ = base * altura;
        return areaQ;
    }
    double quadradoPerimetro(){
        double perimetroQ = (base + altura) * 2;
        return perimetroQ;
    }
    double quadradoVolume(){
        double volumeQ = quadradoArea() * comprimento;
        return volumeQ;
    }
}
