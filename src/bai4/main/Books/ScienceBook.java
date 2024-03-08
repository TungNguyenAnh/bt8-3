package bai4.main.Books;

public class ScienceBook extends NonFictionBook {

    private String level;

    public ScienceBook(String title, String author, String publisher, String subject, String level) {
        super(title, author, publisher, subject);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String getInformation() {
        return super.getInformation() + "\n"
                + "Cấp độ: " + getLevel();
    }

    @Override
    public boolean search(String keyword) {
        return super.search(keyword) || getLevel().contains(keyword);
    }

}
