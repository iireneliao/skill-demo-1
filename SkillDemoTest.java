import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SkillDemoTest {
    @Test
    public void testCombine() {
        assertEquals("kiwilove", SkillDemo.combine("kiwi", "love"));
    }
}
