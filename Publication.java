package Publications;

public class Publication {

    public String title;
    public String author;
    public int numberOfPages;
    public float price;

    public Publication(String title, String author, float price){
        this.title = title;
        this.author = author;
        this.price = price;
        setNumberPages();
    }

    public void setNumberPages(){
        this.numberOfPages = (int) (this.price*10);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
        setNumberPages();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberPages() {
        return numberOfPages;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pubblicazione{" +
                "Titolo='" + title + '\'' +
                ", Autore='" + author + '\'' +
                ", Numero pagine=" + numberOfPages +
                ", Prezzo=" + price +
                '}';
    }
}
