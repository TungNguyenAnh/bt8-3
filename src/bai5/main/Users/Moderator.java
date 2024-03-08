package bai5.main.Users;

public class Moderator extends User {

    public Moderator(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Đăng nhập thành công với vai trò người kiểm duyệt!");
    }

    @Override
    public void register() {
        System.out.println("Người kiểm duyệt không thể tự đăng ký!");
    }

    @Override
    public void logout() {
        System.out.println("Người kiểm duyệt đã đăng xuất!");
    }

}

