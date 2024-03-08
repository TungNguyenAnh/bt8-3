package bai4.main;

import bai4.main.Books.FictionBook;
import bai4.main.Books.NonFictionBook;
import bai4.main.Books.ScienceBook;

public class Main {

    public static void main(String[] args) {
        // Khởi tạo các đối tượng
        FictionBook fictionBook = new FictionBook("Harry Potter", "J.K. Rowling", "Bloomsbury", "Giả tưởng");
        NonFictionBook nonFictionBook = new NonFictionBook("123 con kien", "Mr Beast", "Penguin Random House", "Funny");
        ScienceBook scienceBook = new ScienceBook("Sach ly thuyet", "Nguyen Anh Tung", "Nhà xuất bản Đại học", "CNTT", "Đại học");

        // Lấy thông tin và tìm kiếm
        System.out.println(fictionBook.getInformation());
        System.out.println(fictionBook.search("Potter"));
        System.out.println();

        System.out.println(nonFictionBook.getInformation());
        System.out.println(nonFictionBook.search("Lịch sử"));
        System.out.println();

        System.out.println(scienceBook.getInformation());
        System.out.println(scienceBook.search("Vật lý"));
    }

}

