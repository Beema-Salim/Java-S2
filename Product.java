import java.util.Objects; 
public class Product
{
String pname,pcode; int price;
public String getPname()
{
return pname;
}
public Product()
{

}
public Product(String pname, String pcode, int price)
{
this.pname=pname; this.pcode=pcode; this.price=price;
}
public void setPname(String pname)
{
this.pname=pname;
}
public String getPcode()
{
return pcode;
}
public void setPcode(String pcode)
{
this.pcode=pcode;
}
public int getPrice()
{
return price;
}
public void setPrice(int price)
{
this.price=price;
}
public void display()
{
System.out.println("pcode:" + this.pcode); 
System.out.println("pname:" + this.pname);
 System.out.println("price:" + this.price);
}
}


Exp1.java
public class Exp1
{
public static void main(String[] args)
{
System.out.println("Beema Salim"); 
System.out.println("23MCA024");
 System.out.println("13/02/24"); 
System.out.println("1. Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of the class and find the product having the lowest price.\n");
Product p1=new Product();
p1.pcode="Car123"; 
p1.pname="Maruti";
p1.price=50000;
System.out.println(".................Displaying p1.	");
p1.display();

Product p2=new Product("BMW","Car456",100000); System.out.println("...............Displaying p2.	");
p2.display();

Product p3=new Product("Jaguar","Car789",80000); System.out.println("...............Displaying p3.	");
p3.display();

  Product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price
              <p2.price?p1:p2);
System.out.println("\n.....Displaying product with lowest price	");
p.display();
}
}
