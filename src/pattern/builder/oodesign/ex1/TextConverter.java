package pattern.builder.oodesign.ex1;


//Abstract Builder
public abstract class TextConverter {
    abstract void convertCharacter(char c);
    abstract void convertParagraph();
}

//Concrete Builder
class ASCIIConverter extends TextConverter
{

    ASCIIText textObj = new ASCIIText();
    @Override
    void convertCharacter(char c) {
        char asciiChar =new Character(c).charValue();
        textObj.append(asciiChar);

    }

    @Override
    void convertParagraph() {

    }

    ASCIIText getResult()
    {
        return textObj;
    }
}