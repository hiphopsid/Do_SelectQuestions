import java.util.*;
import java.lang.*;
import java.util.regex.*;

class TransactionParty
{
    String seller;
    String buyer;

    public TransactionParty(String seller, String buyer) {
        this.seller = seller;
        this.buyer = buyer;
    }
}

class Receipt
{
    TransactionParty transactionParty;
    String productQR;

    public Receipt(TransactionParty transactionParty, String productQR) {
        this.transactionParty = transactionParty;
        this.productQR = productQR;
    }
}


class GenerateReceipt
{
    String regex="[a-zA-z -]";

    public  int verifyParty(Receipt r)
    {
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(r.transactionParty.buyer);
        Matcher m1=p.matcher(r.transactionParty.seller);

        boolean b1=m.matches();
        boolean b2=m1.matches();

        if(b1==true && b2==true )
            return 2;
        else if(b1==true || b2==true)
            return 1;
        else
            return 0;
    }

    public String calcGST(Receipt r)
    {
        return null;
    }
}
public class ValidatingUser{
    public static void main(String[] args){

    }
}