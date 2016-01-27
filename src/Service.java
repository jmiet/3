package zad3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by A on 2016-01-27.
 */
public class Service {

    Clients clients;
    Reader reader;
    ArrayList<String> list;
    HashMap<Long, Client> clientsmap;
    Validator val;
    Boolean correct;

    Service(){
        clients = new Clients();
        reader = new Reader();
        list = reader.csvRead(reader.txtRead("properties.txt"));

        clientsmap= clients.toClient(list);
        val = new Validator();



    }

    public HashMap<Long, Client> splitClientsCorrect(HashMap<Long,Client> clientsmap) {
        HashMap<Long, Client> correctClients = new HashMap<>();
        for (Map.Entry<Long, Client> entry : clientsmap.entrySet()) {
            correct = val.validate(entry.getValue());
            if (correct)
                correctClients.put((entry.getKey()), entry.getValue());
        }
        return correctClients;
    }
    public HashMap<Long, Client> splitClientsInCorrect(HashMap<Long,Client> clientsmap) {
        HashMap<Long, Client> incorrectClients = new HashMap<>();
        for (Map.Entry<Long, Client> entry : clientsmap.entrySet()) {
            correct = val.validate(entry.getValue());
            if (!correct)
                incorrectClients.put((entry.getKey()), entry.getValue());
        }
        return incorrectClients;
    }

}
