package demo1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> PhoneList = new ArrayList<>();
        PhoneList.add("Nam" + " - " + "0376189345");
        PhoneList.add("Ha" + " - " + "0837545236");
        PhoneList.add("Long" + " - " + "0983357327");
        PhoneList.add("Trang" + " - " + "0248620123");
        System.out.println(PhoneList);
        PhoneNumber p = new PhoneNumber();
        System.out.println("Name: " + p.name);
        PhoneList.add(p.name);
        System.out.println("Phone: " + p.phone);
        PhoneList.add(p.phone);



    }
}
