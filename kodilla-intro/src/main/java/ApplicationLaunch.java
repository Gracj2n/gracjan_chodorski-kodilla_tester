import java.sql.SQLOutput;

public class ApplicationLaunch {
    public static void main(String[] args) {
        Application person = new Application("", 40.5,178);
        System.out.println(person.name);
        person.checkAgeAndHeight();
    }
}
