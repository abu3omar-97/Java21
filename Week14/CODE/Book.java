package Week14;

import java.util.Date;
import java.util.Random;

public class Book<numberOfBooks> {
    // WHAT IT HAS?
    // Title
    //Author
    //Number of pages
    //Description
    //RATING
    //PricePerDay
    //Date of rent / Date of return

    String title;
    String author;
    String ISBN;
    int numberOfPages;
    int version;
    String description;
    double rating;
    double pricePerDay;
    Date rentDate;
    Date returnDate;
    static final double TAX = 0.02;
    int bookmark;

    static int numberOfBooks = 0;

    Book(String title, String ISBN, int numberOfPages){
        this.title = title;
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
        this.numberOfBooks++;
    }


    Book(){
        this.title = "NO TITLE";
        this.ISBN = "0000000000000";
        this.numberOfPages = 1;
        this.rating = 1;
        this.author = "NO AUTHOR";
    }

    // WHAT IT DOES?
    //calculatePrice(number of days)
    //returnInfo()
    //PreviewRandomPage()

    public double calculatePrice(){
        return this.pricePerDay * this.getNumberOfDaysRented(); // TODO: ADD TAX
    }

    public String returnInfo(){
        return "THIS BOOK'S TITLE IS " + this.title + "\nAND THE AUTHOR IS " + this.author + "\nNUMBER OF PAGES: " + numberOfPages;
    }

    public int getNumberOfDaysRented(){
        // this.returnDate - this.rentDate
        return 0;
    }

    public int getRandomPage(){
        Random rand = new Random();
        return rand.nextInt(this.numberOfPages) + 1;
    }

    // OVERLOADING
    public int[] getRandomPage(int numberOfRandomPages){
        Random rand = new Random();
        int[] randomPages = new int[numberOfRandomPages];
        for (int i = 0; i < randomPages.length; i++) {
            randomPages[i] = this.getRandomPage();
        }
        return randomPages;
    }


}
