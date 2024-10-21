public class Circulo extends figura {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    double calcularArea() {
        return Math.PI *(radio*radio) ;
    }

    double calcularPerimetro() {
        return 2*Math.PI* radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
