package Q1;
public class Fish extends SeaAnimal {
    public Fish(String name){
        super(name);
    }
    
    public void move(){
        System.out.println("Fish swims by moving its tail.");
    }
}