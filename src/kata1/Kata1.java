
package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person ("Sara",new Date(95,9,31) );
        System.out.println(person.getName() + " tiene " + person.getAge());
    }

}
