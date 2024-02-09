public class HDD {

    String name;
    int volume;
    String type;

    public HDD(){

    }

    public HDD(String name, int volume, String type){
        this.name=name;
        this.volume=volume;
        this.type=type;
    }

    public void print(){
        System.out.println("HDD name: "+name+ " volume="+volume+" type- "+type);
    }

    @Override
    public String toString() {
        return "hdd{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}
