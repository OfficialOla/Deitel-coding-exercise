import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WritingToFile1 {
    private Socket socket = null;
    private ServerSocket serverSocket = null;
    private DataInputStream dataInputStream = null;


    public WritingToFile1(int portNumber) throws IOException {
       serverSocket = new ServerSocket(portNumber);
        System.out.println("Server on");
        socket = serverSocket.accept();
        System.out.println("Request accepted");
        dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        String line = "";
       while (!line.equals("Over")){
           line = dataInputStream.readUTF();
           System.out.println(line);
           socket.close();
           dataInputStream.close();
       }
    }



    public static void main(String[] args) throws IOException {
        WritingToFile1 writingToFile1 = new WritingToFile1(5000);
    }
}
