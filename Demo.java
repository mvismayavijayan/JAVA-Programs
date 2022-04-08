class Product
{
int pcode;
String pname;
double price;
void display()
{
System.out.println("Pcode:"+pcode+"\tPname:"+pname+"\tPrice:"+price);
}
}
class Demo
{
public static void main(String args[])
{
Product pro1=new Product();
pro1.pcode=001;
pro1.pname="Shirt";
pro1.price=1000;
Product pro2=new Product();
pro2.pcode=002;
pro2.pname="Pant";
pro2.price=1500;
Product pro3=new Product();
pro3.pcode=003;
pro3.pname="tshirt";
pro3.price=500;
pro1.display();
pro2.display();
pro3.display();
if(pro1.price<pro2.price&&pro1.price<pro3.price)
{
System.out.println("The product with lowest price is:"+pro1.pname);
}
else if(pro2.price<pro1.price&&pro2.price<pro3.price)
{
System.out.println("The prodct with lowest price is:"+pro2.pname);
}
else
{
System.out.println("The product with lowest price is:"+pro3.pname);
}
}
}
