package practices;

public class Rat extends Animal{


    public static void main(String[] args) {
       Rat rat = new Rat();
       Animal rat2 = new Rat();
       rat.shout();
       rat.move();
       rat2.move();
    }
    public void shout(){
        System.out.println("I am shouting");
    }
//    public void move(){
//        System.out.println("I am moving like a rat");
//   }

}
