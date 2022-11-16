import javax.swing.JOptionPane;
public class Animal {
public static void main(String[] arg) {
String name = JOptionPane.showInputDialog("What is your name?");
JOptionPane.showMessageDialog(null, "Hello " + name);
JOptionPane.showMessageDialog(null, "How are you doing today");
}

}