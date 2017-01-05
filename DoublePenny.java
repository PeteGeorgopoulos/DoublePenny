import java.text.*;


public class DoublePenny {
    //the one and only method.
    //this will double a penny. or any int.
    //the method takes in how long you want to continue doubling.
    //the results  will be sectioned off into weeks for readability and ref.
    public void doubleIt(int days){
        //formated for Dollars
        DecimalFormat currency = new DecimalFormat("$#,###,###,###,##0.00");
        
        
        double total;
        
        //the infamous penny!
        total = .01;

        //looping through each day. on the start and every 7th a week msg prints.
        for(int x = 0; x<=days; x++){

            if(x==0){
                    //day one msg
                    System.out.println("===(WEEK 1)=====\n");
            }
            else if(x%7==0 && x!=0){
                    //prints daily result + week notification
                    System.out.println("Day "+ x +"    "  + currency.format(total) 
                    + "\n\n ===(WEEK " + (x/7 + 1) + ")=====\n");
                    //the doubling
                    total = total * 2;
            }
            else{
                    // prints daily result
                    System.out.println("Day "+ x +"    " + currency.format(total));
                    //the doubling!
                    total = total * 2;
            }
        }
    }
    
}
