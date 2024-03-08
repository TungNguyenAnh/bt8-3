package bai4.main.Books;

public class FictionBook extends Book {

    private String genre;

    public FictionBook(String title, String author, String publisher, String genre) {
        super(title, author, publisher);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getInformation() {
        return "Tiêu đề: " + getTitle() + "\n"
                + "Tác giả: " + getAuthor() + "\n"
                + "Nhà xuất bản: " + getPublisher() + "\n"
                + "Thể loại: " + getGenre();
    }

    @Override
    public boolean search(String keyword) {
        return getTitle().contains(keyword) || getAuthor().contains(keyword) || getGenre().contains(keyword);
    }

}

