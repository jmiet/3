package zad3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by A on 2016-01-25.
 */
public class Reader {

    public HowTo txtRead(String s) {
        HowTo instruction;

        try {
            FileReader fileReader = new FileReader(s);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String line = bufferReader.readLine();
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter("=");
            scanner.next();
            String filename = scanner.next();
            line = bufferReader.readLine();
            Scanner scanner2 = new Scanner(line);
            scanner2.useDelimiter("=");
            scanner2.next();
            String output = scanner2.next();
            line = bufferReader.readLine();
            Scanner scanner3 = new Scanner(line);
            scanner3.useDelimiter("=");
            scanner3.next();
            String errors = scanner3.next();
            line = bufferReader.readLine();
            Scanner scanner4 = new Scanner(line);
            scanner4.useDelimiter("=");
            scanner4.next();
            int rows = scanner4.nextInt();
            instruction = new HowTo(filename,output,errors,rows);

        }
        catch (FileNotFoundException e) {
            instruction = new HowTo(null,null,null,0);
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
            instruction = new HowTo(null,null,null,0);
        }

        return instruction;
    }

    public ArrayList<String> csvRead(HowTo instr) {
        String s = instr.fileName;
        if (s.equals(null)) return null;
        String linia;
        ArrayList<String> all = new ArrayList<String>();
        try {
            FileReader fileReader = new FileReader(s);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            while((linia = bufferReader.readLine()) != null){
                all.add(linia);
            }

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return all;
    }
}
