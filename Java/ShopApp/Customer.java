public class Customer {
    String name;
    int measurement; 
    String size;
    private Clothing[] items;

    public Customer(String nombre, int medida){
        this.name = nombre;
        this.setSize(medida);
    }

    public void addItems(Clothing[] listaProductos){
        items=listaProductos;
    }

    public Clothing[] getItems(){
        return items;
    }

    public double getTotalClothingCost(){
        double total=0;
        for (Clothing i:items){
            if (size.equals(i.size)){
                total=total+(i.getPrice());
            }
        }
        return total;
    }    

    public void boughtItems(){
        for (Clothing i:items){
            if (getSize().equals(i.size)){
                System.out.println("Item comprado "+i.description);
            }
        } 
    }

    public void setSize(int newSize){
        switch (newSize) {
            case 1: case 2: case 3:
            setSize("S");
            break;
            case 4: case 5: case 6:
            setSize("M");
            break;
            case 7: case 8: case 9:
            setSize("L");
            break;
            default:
            setSize("XL");
        }
    }

    void setSize(String newSize){
        size=newSize;
    }

    String getSize(){
        return size;
    }
}
