package Publications;

import java.util.Arrays;

public class Shelf {
    Publication[] publications;

    public Shelf(int n){
        this.publications = new Publication[n];
    }

    public String getPublications(int position) {
        try{
            if (this.publications[position] == null)
                return null;
            else
                return this.publications[position].title;
        }catch (Exception  e){
            return  "Errore! Posizione non trovata!";
        }
    }

    public void setPublications(int position, Publication publication) {
        try{
            this.publications[position]= new Publication(publication.title,publication.author,publication.price);
        }catch (Exception  e){
            System.out.println("Errore! Posizione non trovata!");
        }
    }

    public void emptyPositionShelf(int position){
        this.publications[position] = null;
    }

    public int searchPublication(String title){
        for(int i=0; i<publications.length; i++){
            if(this.publications[i].title.equals(title))
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "\n\tScaffale{" +
                "Pubblicazioni=" + Arrays.toString(publications) +
                '}';
    }
}
