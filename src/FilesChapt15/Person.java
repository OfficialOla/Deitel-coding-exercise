package FilesChapt15;

public class Person implements Human{
    private String name;

    private Person(){};

    public static Human get(){
        var p =new Person();
        p.name = "Ola";
        return p;
    }

    @Override
    public void walking() {
        System.out.println("walking like a person");
    }
}
