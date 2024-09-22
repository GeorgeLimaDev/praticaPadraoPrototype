public class Triangle extends Shape {
    private int base;
    private int altura;

    public Triangle(String cor, int base, int altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um triângulo de cor " + getCor() + ", base " + base + " e altura " + altura);
    }
}
