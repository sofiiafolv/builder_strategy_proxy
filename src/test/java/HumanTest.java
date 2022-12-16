import org.example.builder.Gender;
import org.example.builder.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class HumanTest {
    private User user;
    @BeforeEach
    public void init() {
        user = User.builder().name("Sofiia").age(18).gender(Gender.FEMALE).build();
    }
    @Test
    public void testAge(){
        Assertions.assertEquals(18, user.getAge());
    }
    @Test
    public void testName(){
        Assertions.assertEquals("Sofiia", user.getName());
    }
    @Test
    public void testOccupations(){
        Assertions.assertEquals(new ArrayList(),  user.getOccupations());
    }
}
