public class RAM {

    String name;
    int volume;

    public RAM(){

    }

    public RAM(String name, int volume){
        this.name=name;
        this.volume=volume;
    }

    public void print(){
        System.out.println("RAM name: "+name+ " volume="+volume);
    }
}
