package Oops.Encapsulation;

public class EncapAbs {
    String name;
    String author;
    double price;
    int qty;
    EncapAbs(String name,String author,double price,int qty){
        this.name   =name;
        this.author =author;
        this.price  =price;
        this.qty    =qty;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    
    public static void main(String[] args) {
        EncapAbs obj=new EncapAbs("x", "y", 0, 0);
        System.out.println("Book Name: " + obj.getName());
        System.out.println("Author: " + obj.getAuthor());
        System.out.println("Price: " + obj.getPrice());
        System.out.println("Quantity: " + obj.getQty());
    }
}
