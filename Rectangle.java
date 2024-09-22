public class Rectangle extends Shape {
    private int largura;
    private int altura;

    public Rectangle(String cor, int largura, int altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um retângulo de cor " + getCor() + ", largura " + largura + " e altura " + altura);
    }
}
