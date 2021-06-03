package addressTest;

import com.javaworkshop.AddressBookMain;
import com.javaworkshop.Contacts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {

    @Test
    public void GivenContact_WhenReturn_ShouldPassTest() {
        AddressBookMain addressBook = new AddressBookMain();
        Contacts contact = new Contacts("sanket", "Bagde", "Mulund", "Mumbai", "Maharashtra", 4000080, 8174785, "sanketbdg@fgmil.com");
        boolean result = addressBook.addContact(contact);
        Assertions.assertTrue(result);
    }
}
