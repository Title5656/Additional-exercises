package Q1;
abstract class SeaAnimal {
    String name;
    public SeaAnimal(String name){
        this.name = name;
    }
    public abstract void move();
}