package FilesChapt15.BufferWriter;

import util.FileUtils;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferWriterExample {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;
        String[] words = {"QWERTY", "ASDFG", "ZXCVB", "POIUY", "LKJHG", "MNBVC"};
        try{OutputStreamWriter writer =
                    new OutputStreamWriter(new FileOutputStream(FileUtils.APP_ASSET_LOCATION+"\\output.txt"));
            bufferedWriter = new BufferedWriter(writer);
            //the concept of flush is, you have a buffer(represents object that stores data, it has a default size
            //so at a particlar point, the flush pushes whatever has been writting into the file
            //regardlesss of the storage of the buffer
            //the whole point of buffering is you cant performi reading and writing at the same time, i.e. you can collect amd while you collect you are not pushing out
            //
//            bufferedWriter.write("Hello".toCharArray(), 0, 3);
            bufferedWriter.write(words[0]+ " " +words[3]+ " ");
            bufferedWriter.flush();
            bufferedWriter.write(words[1]);
            bufferedWriter.close();
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
