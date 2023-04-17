import java.sql.SQLOutput;

public class ApplicationLaunch {
    public static void main(String[] args) {
        Application person = new Application("Adam", 10.5,120);
        System.out.println(person.name);
        person.checkAgeAndHeight();
    }
}
