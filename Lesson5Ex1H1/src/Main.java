import java.io.*;

public class Main {
    public static void main(String[] args) {
        File in = new File ("C:\\Users\\dimal\\Desktop\\Java OOP (All cource).pdf");
        File out = new File ("copy_book.pdf");
        try {
            FileOperationsServise.copyFale(in,out);
            System.out.println("Done");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
