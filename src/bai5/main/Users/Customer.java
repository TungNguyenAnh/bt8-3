package bai5.main.Users;

public class Customer extends User {

    public Customer(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Đăng nhập thành công với vai trò khách hàng!");
    }

    @Override
    public void register() {
        System.out.println("Đăng ký tài khoản khách hàng thành công!");
    }

    @Override
    public void logout() {
        System.out.println("Khách hàng đã đăng xuất!");
    }

}
