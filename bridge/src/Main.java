public class Main {
  //Asigurarea independenței interfețelor și a implementărilor
  //Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently.
    public static void main(String[] args){
        Shape redCirnle = new Circle(100,100,10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCirnle.draw();
        greenCircle.draw();

    }
}
