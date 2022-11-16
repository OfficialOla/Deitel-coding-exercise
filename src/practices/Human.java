package practices;

//public class Human {
//    private int height;
//    private int shoeSize;
//    private String name;
//    private int age;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public void setHeight(int height){
//        this.height = height;
//    }
//    public void setShoeSize(int shoeSize){
//        this.shoeSize = shoeSize;
//    }
//    public int getAge() {
//        return age;
//    }
//    public String getName() {
//        return name;
//    }
//    public int getHeight() {
//        return height;
//    }
//    public int getShoeSize() {
//        return shoeSize;
//    }
//}
public class Human {
    private String name;
    private int age;

    public Human(String newName){
        this.name = newName;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public void printstud() {
        System.out.println("Student name:  " +name);
        System.out.println("Student age: " +age);
    }
    public static void main(String[] args) {
        Human student = new Human("OLA");
        student.setAge(12);
        student.printstud();
    }

}


