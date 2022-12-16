import org.example.builder.User;
import org.example.strategy.Client;
import org.example.strategy.Gender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ClientTest {
    private Client client;
    @BeforeEach
    public void init() {
        client = new Client("Sofiia", Gender.FEMALE, 18);
    }
    @Test
    public void testAge(){
        Assertions.assertEquals(18, client.getAge());
    }
    @Test
    public void testName(){
        Assertions.assertEquals("Sofiia", client.getName());
    }
   @Test
    public void testGender(){
        Assertions.assertEquals(Gender.FEMALE, client.getSex());
   }
   @Test
    public void testId(){
        Assertions.assertEquals(2, client.getId());
   }
}
