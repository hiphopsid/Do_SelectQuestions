import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Mobile{
    // Write your code here..
    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();
    ArrayList<String> a=new ArrayList<>();
    public String addMobile(String company, String model)
    {


        if(!mobiles.containsKey(company))
        {
            a.add(model);

            mobiles.put(company,a);
        }

        if(!mobiles.containsKey(company))
        {
            a.add(model);
        }
        return "model successfully added";
    }

    public  ArrayList<String> getModels(String company)
    {
        if(mobiles.containsKey(company))
        {
            return  mobiles.get(company);
        }
        else if(!mobiles.containsKey(company))
        {
            return null;
        }

        return a;
    }

    public  String buyMobile(String company, String model)
    {
        if(mobiles.containsKey(company)) {
            mobiles.remove(company, a.contains(model));
            return "Item sold successfully";
        }
        else
        {
            return  "Item not available";
        }
    }

}

public class MobileShop {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Mobile obj = new Mobile();
        System.out.println(obj.addMobile("Oppo", "K3"));
        System.out.println(obj.getModels("Oppo"));
        System.out.println(obj.buyMobile("Oppo", "K3"));
    }
}