public class Circle extends Shape {
    private int raio;

    public Circle(String cor, int raio) {
        super(cor);
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo de cor " + getCor() + " e raio " + raio);
    }
}
