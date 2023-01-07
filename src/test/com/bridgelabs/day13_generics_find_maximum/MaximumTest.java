package test.com.bridgelabs.day13_generics_find_maximum; 

import com.bridgelabs.day13_generics_find_maximum.Maximum;
import org.junit.Assert;
import org.junit.Test;
public class MaximumTest {
    //I'm goind to give 10, 20, 30
@Test
public void testFindMaximum() throws Exception {
    Maximum maximum = new Maximum();
    int value1 = maximum.findMaximum(10, 20, 30);
    double value2 = maximum.findMaximum(1.123f, 1.213f, 1.321f);
    int expected1 = 30;
    float expected2 = 1.321f;
    Assert.assertEquals(expected1, value1);
    Assert.assertEquals(expected2, value2, 0.0f);
}
}