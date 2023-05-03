package geometria;

abstract class lozango {
    double diagonalMaior, diagonalMenor, lado, comprimento;

    double lozangoArea(){
        double areaL = (diagonalMaior * diagonalMenor) / 2;
        return areaL;
    }
    double lozangoPerimetro(){
        double perimetroL = lado * 4;
        return perimetroL;
    }
    double lozangoVolume(){
        double perimetroV = lozangoArea() * comprimento;
        return perimetroV;
    }
}
