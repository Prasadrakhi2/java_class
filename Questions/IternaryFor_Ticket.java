import java.util.*;
public class IternaryFor_Ticket{

    //to get the starting point
    public static String toGet(HashMap<String, String> ticket){
        HashMap<String , String> revTicket = new HashMap<>();

        //store the reverse order value in the revTicket map i.e from-to , to-from
        for(String key: ticket.keySet()){
            revTicket.put(ticket.get(key),key);
        }

        //find the start
        for(String key: ticket.keySet()){
            if(!revTicket.containsKey(key)){
                return key;
            }
        }

        return null;
    }

    public static void main(String args[]){
        HashMap<String, String> ticket = new HashMap<>();
        ticket.put("Chennai", "Banglore");
        ticket.put("Mumbai", "Delhi");
        ticket.put("Goa","Chennai");
        ticket.put("Delhi","Goa");

        String start = toGet(ticket);
        System.out.print(start);

        for(String key: ticket.keySet()){
            System.out.print("->" + ticket.get(start));
            start = ticket.get(start);
        }

        System.out.println();
        
    }
}