package geometria;

class circulo {
    public double raio, largura;

    public double areaCirculo(){
        double areaC = Math.PI * this.raio * this.raio;
        return areaC;
    }
    public double circunferencia(){
        double circun = Math.PI * this.raio * 2;
        return circun;
    }
    public double volume(){
        double vol = this.areaCirculo() * this.largura;
        return vol;
    }
}
