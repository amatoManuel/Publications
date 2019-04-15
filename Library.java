package Publications;

import java.util.Arrays;
import java.util.Scanner;

public class Library {

    public static void main(String[] args){
        int lengthLibrary = 10;
        Shelf[] library = new Shelf[lengthLibrary];
        Scanner input = new Scanner(System.in);
        int choice = 0, choice2 = 0;
        int lengthShelf = 0;
        String title,author;
        float price;
        int position;
        int counter = 0;
        do{
            System.out.println("--------Biblioteca--------");
            System.out.println("1-Crea biblioteca");
            System.out.println("2-Inserisci libro");
            System.out.println("3-Stampa biblioteca");
            System.out.println("4-Ricerca libro per autore");
            System.out.println("5-Stampa posti disponibili");
            System.out.println("0-Esci");
            choice = input.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Inserire dimensioni scaffale");
                    lengthShelf = input.nextInt();
                    for (int i = 0; i < lengthLibrary; i++)
                        library[i] = new Shelf(lengthShelf);
                    break;

                case 2:
                    System.out.println("In quale scaffale vuoi inserire il libro?");
                    for (int i = 0; i < lengthLibrary; i++) {
                        System.out.println((i + 1) + "-Scaffale");
                    }
                    choice2 = input.nextInt();
                    choice2--;
                    System.out.println("Inserisci titolo");
                    title = input.next();
                    System.out.println("Inserisci autore");
                    author = input.next();
                    System.out.println("Inserisci prezzo");
                    price = input.nextFloat();
                    System.out.println("Inserisci posizione nello scaffale");
                    position = input.nextInt();
                    position--;
                    Publication publication = new Publication(title, author, price);
                    library[choice2].setPublications(position, publication);

                    break;

                case 3:
                        System.out.println("Biblioteca={" + Arrays.toString(library) + "}");
                    break;
                case 4:
                    System.out.println("Inserisci autore");
                    author = input.next();
                    for (int i = 0; i < lengthLibrary; i++) {
                        for (int j = 0; j < lengthShelf; j++)
                            if (library[i].publications[j]!=null && author.equals(library[i].publications[j].author))
                                System.out.println((i + 1) + "-Scaffale: {\n\t"+(j+1)+"-Posizione: {\n\t\t"+library[i].publications[j]+"\t\n}\n}");
                    }
                    break;
                case 5:
                    for (int i = 0; i < lengthLibrary; i++) {
                        for (int j = 0; j < lengthShelf; j++)
                            if (library[i].publications[j]==null)
                                counter++;
                    }
                    System.out.println("Posti disponibili: "+counter);
                    break;
            }
        }while(choice!=0);
    }
}
