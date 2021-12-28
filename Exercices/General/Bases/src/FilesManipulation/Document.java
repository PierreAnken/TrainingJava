package FilesManipulation;

import java.io.PrintStream;

public class Document {


    public static void main(String[] args) {

        System.out.println("Print in console");

        String data = "This is a text inside the file.";
        try {
            PrintStream file_output = new PrintStream("D:\\Repos\\JavaTrainingStudent\\Exercices\\General\\Bases\\src\\FilesManipulation\\output.txt");

            file_output.println(data);
            file_output.append("I'm the second text");

            file_output.close();
        }
        catch(Exception e) {

            System.out.println("error!");
        }

    }

}
