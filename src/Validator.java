package zad3;

import java.util.HashMap;

/**
 * Created by A on 2016-01-26.
 */
public class Validator {

    public Boolean validate(Client cl){
        Long p = cl.pesel;
        Long cntrl = p%10;
        p-=cntrl;
        p/=10;
        Long j = p%10;
        p-=j;
        p/=10;
        Long i = p%10;
        p-=i;
        p/=10;
        Long h = p%10;
        p-=h;
        p/=10;
        Long g = p%10;
        p-=g;
        p/=10;
        Long f = p%10;
        p-=f;
        p/=10;
        Long e = p%10;
        p-=e;
        p/=10;
        Long d = p%10;
        p-=d;
        p/=10;
        Long c = p%10;
        p-=c;
        p/=10;
        Long b = p%10;
        p-=b;
        p/=10;
        Long a = p%10;

        Long check = (1*a + 3*b + 7*c + 9*d + 1*e + 3*f + 7*g + 9*h + 1*i + 3*j)%10;
        if (check.equals(0)&& check.equals(cntrl)) {
            System.out.println("OK");
            return true;
        }
        else if (check.equals(10-cntrl)) {
            System.out.println("OK");
            return true;
        }
        else {
            System.out.println("not OK");
            return false;}


        }


}

