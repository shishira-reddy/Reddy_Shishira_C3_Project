public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
        public Item(String name, int price) {
            this.name = name;
            this.price = price;
        }

    public String getName() {
       public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return  name + ":"
                + price
                + "\n"
                ;
    }

    //public int getPrice(){return price;}
      @Override
       public String toString(){
           return  name + ":"
                   + price
                   + "\n"
                   ;
       }

    public int getPrice(){return price;}
}