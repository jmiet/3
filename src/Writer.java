package zad3;

import java.io.FileWriter;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by A on 2016-01-27.
 */
public class Writer {

    public void writeCorrect(HashMap<Long,Client> map, String s, int count) throws IOException{

        FileWriter fileCorrect;

        try{
             {
                String outputName = s;
                fileCorrect = new FileWriter(outputName);
                for (Map.Entry<Long, Client> entry : map.entrySet()) {

                        Client tmp = entry.getValue();
                        String line = tmp.toString();
                        fileCorrect.write(line+"\n");


                }
                fileCorrect.close();
            }

        }
        catch(IOException e){
            e.printStackTrace();
        }





    }
}
