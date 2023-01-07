package test.com.bridgelabs.day13_generics_find_maximum;

import com.bridgelabs.day13_generics_find_maximum.Maximum;
import org.junit.Assert;
import org.junit.Test;
public class MaximumTest<T extends Comparable> //as per uc we have extended comparable so that compareTo method will work
{
    //I'm goind to give 10, 20, 30
@Test
public void testFindMaximum() throws Exception {
    Maximum maximum1 = new Maximum(10, 20, 30);
    int value1 = (int) maximum1.findMaximum(); //type casting as we are getting object return from comparable
    Maximum maximum2 = new Maximum(1.123f, 1.213f, 1.321f);
    float value2 = (float) maximum2.findMaximum();
    Maximum maximum3 = new Maximum("cba", "bac", "abc");
    String value3 = (String) maximum3.findMaximum();
    int expected1 = 30;
    float expected2 = 1.321f;
    String expected3 = "cba";
    Assert.assertEquals(expected1, value1);
    Assert.assertEquals(expected2, value2, 0.0f);
    Assert.assertEquals(expected3, value3);
}
}