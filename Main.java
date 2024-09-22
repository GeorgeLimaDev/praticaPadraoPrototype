public class Main {
    public static void main(String[] args) {
        try {
            Rectangle retanguloOriginal = new Rectangle("Azul", 4, 6);
            Rectangle retanguloClone = (Rectangle) retanguloOriginal.clone();
            retanguloClone.setCor("Vermelho");

            Circle circuloOriginal = new Circle("Verde", 5);
            Circle circuloClone = (Circle) circuloOriginal.clone();
            circuloClone.setCor("Amarelo");

            Triangle trianguloOriginal = new Triangle("Roxo", 3, 5);
            Triangle trianguloClone = (Triangle) trianguloOriginal.clone();
            trianguloClone.setCor("Laranja");

            System.out.println("Objetos Originais:");
            retanguloOriginal.desenhar();
            circuloOriginal.desenhar();
            trianguloOriginal.desenhar();

            System.out.println("\nObjetos Clonados:");
            retanguloClone.desenhar();
            circuloClone.desenhar();
            trianguloClone.desenhar();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
