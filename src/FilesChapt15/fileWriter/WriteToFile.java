package FilesChapt15.fileWriter;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WriteToFile {
    public static void main(String[] args) throws Exception {
        String remoteAddress = "172.16.0.65";
        int remotePort = 1234;
        String remoteFilePath = "/path/to/remote/file.txt";
        Socket socket = new Socket(remoteAddress, remotePort);

        OutputStream outputStream = socket.getOutputStream();

        FileInputStream fileInputStream = new FileInputStream("/path/to/local/file.txt");

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = fileInputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        fileInputStream.close();
        outputStream.close();
        socket.close();
    }
    }
