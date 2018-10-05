
package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1995,10,31);
        
        Person person = new Person ("Sara", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }

}
