package zad3;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by A on 2016-01-25.
 */
public class Clients {
    HashMap<Long, Client> map = new HashMap();

    public HashMap<Long, Client> toClient(ArrayList<String> all){
        for (String s : all){
            String source = s;
            Scanner scan = new Scanner(source);
            scan.useDelimiter(";");
            Long pesel = scan.nextLong();
            String name = scan.next();
            String surname = scan.next();
            map.put(pesel, new Client(pesel, name, surname));
    }
        return map;
    }

    public void generate() {
        try{
            PrintWriter writer = new PrintWriter("test.csv");
            Random rand = new Random();
            for (int k = 0; k < 2400; k++) {

                for (int i = 0; i < 11; i++) {
                    Integer tmp = rand.nextInt(10);
                    writer.print(tmp);
                }
                writer.print(";");
                for (int i = 0; i < 2; i++) {
                    char[] chars = "ABCDEFGHIJKLMNOPRSTUWXYZ".toCharArray();
                    StringBuilder nam = new StringBuilder();
                    for (int j = 0; j < 10; j++) {
                        char c = chars[rand.nextInt(chars.length)];
                        nam.append(c);
                    }
                    String na = nam.toString();
                    writer.print(na);
                    if ((i%2) == 0) writer.print(";");
                }
                writer.print("\n");
            }
            writer.close();


        }
        catch (FileNotFoundException e){
            System.out.println("Blad");
        }




}}
