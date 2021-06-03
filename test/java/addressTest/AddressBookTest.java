package addressTest;

import com.javaworkshop.AddressBookMain;
import com.javaworkshop.Contacts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {

    /**
     * Getting test case for Adding contacts
     * and returning True
     */
    @Test
    public void GivenContact_WhenReturn_ShouldPassTest() {
        AddressBookMain addressBook = new AddressBookMain();
        Contacts contact = new Contacts("sanket", "Bagde", "Mulund", "Mumbai", "Maharashtra", 4000080, 8174785, "sanketbdg@fgmil.com");
        Boolean result = addressBook.addContact(contact);
        Assertions.assertTrue(result);
    }
}
