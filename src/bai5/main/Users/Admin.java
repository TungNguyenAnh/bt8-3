package bai5.main.Users;

public class Admin extends User {

    public Admin(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Đăng nhập thành công với vai trò quản trị viên!");
    }

    @Override
    public void register() {
        System.out.println("Quản trị viên không thể tự đăng ký!");
    }

    @Override
    public void logout() {
        System.out.println("Quản trị viên đã đăng xuất!");
    }

}

