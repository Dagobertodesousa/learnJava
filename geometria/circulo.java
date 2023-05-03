package geometria;

abstract class circulo {
    double raio, largura;

    double areaCirculo(){
        double areaC = Math.PI * raio * raio;
        return areaC;
    }
    double circunferencia(){
        double circun = Math.PI * raio * 2;
        return circun;
    }
    double volume(){
        double vol = areaCirculo() * largura;
        return vol;
    }
}
