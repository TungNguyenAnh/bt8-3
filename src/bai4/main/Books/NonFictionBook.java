package bai4.main.Books;

public class NonFictionBook extends Book {

    private String subject;

    public NonFictionBook(String title, String author, String publisher, String subject) {
        super(title, author, publisher);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getInformation() {
        return "Tiêu đề: " + getTitle() + "\n"
                + "Tác giả: " + getAuthor() + "\n"
                + "Nhà xuất bản: " + getPublisher() + "\n"
                + "Chủ đề: " + getSubject();
    }

    @Override
    public boolean search(String keyword) {
        return getTitle().contains(keyword) || getAuthor().contains(keyword) || getSubject().contains(keyword);
    }

}
