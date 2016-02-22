package pattern.builder.oodesign.ex1;

/**
 * Created by gauravs on 18/2/16.
 */
public class Client {
    void createASCIIText(Document doc)
    {
        ASCIIConverter asciiBuilder = new ASCIIConverter();
        RTFReader rtfReader = new RTFReader(asciiBuilder);
        rtfReader.parseRTF(doc);
        ASCIIText asciiText = asciiBuilder.getResult();
        System.out.println(asciiText);
    }

    public static void main(String args[])
    {
        Client client=new Client();
        Document doc = new Document();
        client.createASCIIText(doc);
        System.out.println("This is an example of Builder pattern");
    }
}
