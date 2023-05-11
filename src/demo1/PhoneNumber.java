package demo1;

import java.util.Scanner;

public class PhoneNumber {
    String name;
     String phone;

    public PhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap name can them: ");
        name = sc.next();
        phone = sc.next();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
