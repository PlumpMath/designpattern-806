package pattern.builder.oodesign.ex1;

/**
 * Created by gauravs on 18/2/16.
 */
//This class abstracts the document object.
public class Document {
    int counter = 0;
    String data = "ccccc gaurav cc0ccc ";

    public char getNextToken() {
        while (counter < data.length())
            return data.charAt(counter++);
        return '0';
    }
}
