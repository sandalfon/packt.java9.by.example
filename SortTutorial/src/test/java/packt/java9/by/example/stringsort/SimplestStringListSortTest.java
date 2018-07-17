package packt.java9.by.example.stringsort;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SimplestStringListSortTest {
    @Test
    public void canSortStrings() {
        ArrayList actualNames = new ArrayList(Arrays.asList(
                "Johnson", "Wilson",
                "Wilkinson", "Abraham", "Dagobert"
        ));
        Collections.sort(actualNames);
        Assert.assertEquals(new ArrayList<String>(Arrays.<String>asList(
                "Abraham", "Dagobert", "Johnson", "Wilkinson", "Wilson")),
                actualNames);
    }
}