public class SuperMarket
{
int price; 
int discount; 
public static void main(String[] args)
{
SuperMarket rice = new SuperMarket(); 
SuperMarket wheat = new SuperMarket(); 
SuperMarket dates = new SuperMarket(); 
rice.price = 60; 
rice.discount = 6; 
wheat.price = 50;
wheat.discount = 5; 
dates.price = 30; 
dates.discount = 4; 
System.out.println("verified"); 
rice.buy(); // Method Calling Statement
wheat.buy(); 
dates.buy(); 
}
public void buy()
{
System.out.println("I am buying for " + price); 
System.out.println(discount); 
}

}
