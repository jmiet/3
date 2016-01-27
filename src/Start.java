package zad3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by A on 2016-01-25.
 */
public class Start {


    public static void main(String[] args){
        Service service = new Service();
        Writer writer = new Writer();
        Reader reader = new Reader();
        HowTo howTo = reader.txtRead("properties.txt");
        String output = howTo.outputFileName;
        String errors = howTo.errorsFileName;
        int rows = howTo.rowsPerFile;
        HashMap<Long, Client> clMap;
        clMap = service.clientsmap;

       try{
            writer.writeCorrect(service.splitClientsCorrect(clMap), output, rows);
           writer.writeCorrect(service.splitClientsInCorrect(clMap), errors,rows);
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
