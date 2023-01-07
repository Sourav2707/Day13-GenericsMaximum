package test.com.bridgelabs.day13_generics_find_maximum;

import com.bridgelabs.day13_generics_find_maximum.Maximum;
import org.junit.Assert;
import org.junit.Test;
public class MaximumTest<T extends Comparable> //as per uc we have extended comparable so that compareTo method will work
{
    //I'm goind to give 10, 20, 30
@Test
public void testFindMaximum() throws Exception {
    Integer[] array1 = {10, 20, 30, 40, 50};
    Float[] array2 = {1.123f, 1.213f, 1.321f, 1.432f, 1.342f};
    String[] array3 = {"cba", "bac", "abc", "dbc", "dcb"};
    Maximum maximum1 = new Maximum(array1);
    int value1 = (int) maximum1.findMaximum();
    Maximum maximum2 = new Maximum(array2);
    float value2 = (float) maximum2.findMaximum();
    Maximum maximum3 = new Maximum(array3);
    String value3 = (String) maximum3.findMaximum();
    int expected1 = 50;
    float expected2 = 1.432f;
    String expected3 = "dcb";
    Assert.assertEquals(expected1, value1);
    Assert.assertEquals(expected2, value2, 0.0f);
    Assert.assertEquals(expected3, value3);
}
}