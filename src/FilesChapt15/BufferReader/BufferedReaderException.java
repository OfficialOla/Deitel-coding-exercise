package FilesChapt15.BufferReader;

import util.FileUtils;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderException {
    public static void main(String[] args) {
        //Reading from the console
        // the bufferedReader has two constructors, and both takes an input of type Reader.
        // Reader has FileReader, BufferedReader, and InputStreamReader
        //The InputStreamReader reads from the console.
        // The bufferredReader cannot be used cos it takes a Reader input itself and it would be a kind of a reocurring
// The BuffereReader is an object that writes data object into a file
        try(InputStreamReader reader = new InputStreamReader(System.in);
            //the inputDStreamReader raps inputstrream and return a reader
            //WRead from the console
            BufferedReader bufferedReader = new BufferedReader(reader);

            FileWriter fileWriter = new FileWriter(FileUtils.APP_ASSET_LOCATION+"\\text.txt")
        ){
            String input = bufferedReader.readLine();
            fileWriter.write(input);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
