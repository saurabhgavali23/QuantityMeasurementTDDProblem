package testcasesformeasurement;

import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.QuantityMeasurement;

public class TestQuantityMeasurement {

    @Test
    public void whenGivenZeroFeet_shouldReturnEqualFeet() {
        QuantityMeasurement quantityMeasurement=new QuantityMeasurement();
        int feet = quantityMeasurement.getFeetValue(0);
        Assert.assertEquals(0,feet);
    }
}
