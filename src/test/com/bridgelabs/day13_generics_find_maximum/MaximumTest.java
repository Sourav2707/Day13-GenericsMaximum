package test.com.bridgelabs.day13_generics_find_maximum; 

import com.bridgelabs.day13_generics_find_maximum.Maximum;
import org.junit.Assert;
import org.junit.Test;
public class MaximumTest {
    //I'm goind to give 10, 20, 30
@Test
public void testFindMaximum() throws Exception {
    Maximum maximum = new Maximum();
    int value = maximum.findMaximum(20, 30, 10);
    int expected = 30;
    Assert.assertEquals(expected, value);
} 


} 
