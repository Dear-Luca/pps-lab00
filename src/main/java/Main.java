import model.Person;
import utils.Logger;

public class Main {
    public static void main(final String[] args){
        Person person = new Person("Luca", 22);
        Logger.logPrintString("Hello " + person);
    }
}
