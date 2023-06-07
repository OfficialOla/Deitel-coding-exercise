package OOP;

public class TextConversion {
    private Input input;
    public  TextConversion( Input input){
        this.input = input;
    }
    public void showInputInUpperCase(){
        String inputText = input.fetch();
        String upperCaseText = inputText.toUpperCase();
        System.out.println(upperCaseText);
    }
}
