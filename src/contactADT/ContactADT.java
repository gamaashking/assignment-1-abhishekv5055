/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: Abhishek
 *   Date: 17-02-2020
 *   Time: 10:08 PM
 */


package contactADT;

public interface ContactADT<Person> {
    boolean add(Person data);

    void view();

    Person delete();

}
