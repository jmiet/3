package zad3;

/**
 * Created by A on 2016-01-25.
 */
public class Client {

    String name;
    String surname;
    Long pesel;

    Client(Long p, String n, String s){
        this.name = n;
        this.pesel = p;
        this.surname = s;
    }



    @Override
    public String toString() {
        return (String.valueOf(pesel)+";"+name+";"+surname+";");
    }
}
