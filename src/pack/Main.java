package pack;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Proiect cu masini\n");
        System.out.println("Cea mai smechera reprezentanta");
        Car c = new Car("Hyundai","Elantra",2017);
        c.print();

        Car c2 = new Car("Hyundai2","Elantra2",2018);
        c2.print();
    }
}
