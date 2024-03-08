package bai5.main;

import bai5.main.Users.Admin;
import bai5.main.Users.Customer;
import bai5.main.Users.Moderator;

public class Main {

    public static void main(String[] args) {
        // Khởi tạo các đối tượng
        Admin admin = new Admin("admin", "admin@gmail.com", "123456");
        Customer customer = new Customer("customer", "customer@gmail.com", "123456");
        Moderator moderator = new Moderator("moderator", "moderator@gmail.com", "123456");

        // Đăng nhập
        admin.login();
        customer.login();
        moderator.login();

        System.out.println();

        // Đăng ký
        customer.register();

        System.out.println();

        // Đăng xuất
        admin.logout();
        customer.logout();
        moderator.logout();
    }

}

