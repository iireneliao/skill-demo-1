import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SkillDemoTest {
    @Test
    public void testCombine() { //failing test
        assertEquals("kiwi love", SkillDemo.combine("kiwi", "love"));
    }
}
