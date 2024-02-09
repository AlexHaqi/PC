import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name and volume RAM");
        String name=sc.nextLine();
        int volume=sc.nextInt();
        System.out.println("Enter name,type and volume HDD");
        String nameHdd=sc.nextLine();
        String type=sc.nextLine();
        int volumeHDD=sc.nextInt();
        RAM Ram = new RAM(name, volume);
        HDD Hdd = new HDD(nameHdd, volumeHDD, type);
        computer pc1 = new computer(1000, "asus");
        computer pc2 = new computer(1500, "hp", Ram, Hdd);
        pc1.print();
        pc2.print();
    }
}