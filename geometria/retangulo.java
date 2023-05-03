package geometria;

abstract class retangulo {
    double base1, altura1, base2, altura2, comprimento;

    double retanguloArea(){
        double areaR = base1 * altura1;
        return areaR;
    }
    double retanguloPerimetro(){
        double perimetroR = base1 + altura1 + base2 + altura2;
        return perimetroR;
    }
    double retanguloVolume(){
        double volumeR = retanguloArea() * comprimento;
        return volumeR;
    }
}
