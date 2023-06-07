package chaptSeventeen;

public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        //TODO The carMethod below is an anonymous class. It contains implementation
        CarMethod carMethod = new CarMethod() {
            @Override
            public void stop() {
                System.out.println("Stop");
            }

            @Override
            public void move() {
                System.out.println("move");
            }
        };
        toyota.move(carMethod);
        toyota.stop(carMethod);
        carMethod.stop();
        carMethod.move();
    }

}
