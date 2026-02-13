package Junit;

import org.junit.Test;
import org.junit.Assert;

public class addTest {

    @Test
    public void test1forAdd() {
        add add_var = new add();
        Assert.assertEquals(7, add_var.addnum(4, 3));
        Assert.assertEquals(8, add_var.addnum(4, 4));
    }
}
