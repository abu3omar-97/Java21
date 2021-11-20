package MicroSoft;

import Shapes.Square;

import java.util.Calendar;
import java.util.Date;

public class Excel {
    // WHAT IT HAS?
    public String fileName;
    public String fileType;
    public String author;
    public String language;
    public Date dateCreated;
    public Date dateModified;
    public String[] sheets; // TODO: CHANGE TO TYPE SHEET
    public int[] cells;

//    [2,4,2]
//    [4,4,2]
//    [1,2,5]

    public Excel(){
        // Book1.xlsx
        this.fileName = "Book";
        this.fileType = "xlsx";
        this.author = "UNKNOWN";
        this.language = "ENGLISH";
        long millis=System.currentTimeMillis();
        this.dateCreated =new Date(millis);
        this.dateModified = this.dateCreated;
        this.cells = new int[1000];
    }

    public Excel(int rows, int columns){
        // Book1.xlsx
        this.fileName = "Book"; // TODO: ADD A INDEX
        this.fileType = "xlsx";
        this.author = "UNKNOWN";
        long millis=System.currentTimeMillis();
        this.dateCreated =new Date(millis);
        this.dateModified = this.dateCreated;
        if(rows < 1 || columns < 1) {
            rows = 1;
            columns = 1;
            System.out.println("ERROR...");
        }
        this.cells = new int[rows];
    }

    // WHAT IT DOES?

    private void modify(){
        long millis=System.currentTimeMillis();
        this.dateModified = new Date(millis);
    }

    public void saveFile(){
        System.out.println("SAVING " + this.fileName + "." + this.fileType);
        modify();
    }


    public int sum(int row, int column){

        return 0;
    }

    public double avg(int row, int column){
        return 0;
    }

    public int count(int row, int column){
        return 0;
    }

    public int max(int row, int column){
        return 0;
    }

    public int min(int row, int column){
        return 0;
    }

    public void fillCells(int[] data){
        for (int i = 0; i < data.length ; i++) {
                this.cells[i] = data[i];
        }
    }
}
