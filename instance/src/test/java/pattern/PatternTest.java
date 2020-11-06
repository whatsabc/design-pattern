package pattern;

import Builder.User;
import org.junit.Test;

/**
 * @author Jianshu
 * @since 20201106
 */
public class PatternTest {
    @Test
    public void builder(){
        User user=new User.UserBuilder("c","js").age(21).build();
        System.out.println(user.toString());
    }
}
