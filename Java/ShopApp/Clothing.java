public class Clothing implements Comparable<Clothing>{
    String description;
    private double price;
    String size;
    public final static int minP=10;
    public final static double tax=0.2;

    public Clothing(String des, double pri, String siz){
        this.description=des;
        this.price=pri;
        this.size=siz;
    }

    public void setPrice(double newPrice){
        price=(newPrice>minP) ? newPrice:minP;
    }
    
    public void setDescription(String newDescription){
        description=newDescription;
    }
    
    public void setSize(String newSize){
        size=newSize;
    }
    
    public double getPrice(){
        return price+price*tax;
    }

    @Override
    public String toString(){
        return description+", "+price+", "+size;
    }

    @Override
    public int compareTo(Clothing c){
        return this.description.compareTo(c.description);
    }

}

