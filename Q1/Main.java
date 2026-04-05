package Q1;
public class Main {
    public static void main(String[] args) {
        SeaAnimal[] animals = new SeaAnimal[3];
        animals[0] = new SeaTurtle("Turtle");
        animals[1] = new Octopus("Octopus");
        animals[2] = new Fish("Fish");
        for (SeaAnimal animal : animals) {
            animal.move();
        }
    }
}
