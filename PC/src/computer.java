public class computer {

    int price;
    String model;
    RAM RAM;
    HDD HDD;

    public computer(int price, String model){
        this.price=price;
        this.model=model;
        this.RAM=new RAM();
        this.HDD=new HDD();
    }

    public computer(int price, String model, RAM RAM, HDD HDD){
        this.price=price;
        this.model=model;
        this.RAM=RAM;
        this.HDD=HDD;
    }

    public void print(){
        System.out.println("Price: "+price);
        System.out.println("Model: "+model);
        RAM.print();
        HDD.print();
    }
}
