import java.sql.SQLOutput;

public class ApplicationLaunch {
    public static void main(String[] args) {                                     //metoda main
        Application person = new Application("Adam", 10.5,120); //obiekt person
        System.out.println(person.name);
        person.checkAgeAndHeight();             //wywołanie metody checAgeAndHeight z klasy Application
    }
}
