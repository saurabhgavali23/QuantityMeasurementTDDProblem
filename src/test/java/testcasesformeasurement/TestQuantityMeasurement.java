package testcasesformeasurement;

import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Feet;
import quantitymeasurement.Inch;
import quantitymeasurement.QuantityMeasurementException;

public class TestQuantityMeasurement {

    // Test Cases For Feet
    @Test
    public void whenGivenZeroFeet_shouldReturnEqualFeet() throws QuantityMeasurementException {
        Feet value1 = new Feet(0);
        Feet value2 = new Feet(0);
        Assert.assertEquals(value1, value2);
    }

    @Test
    public void whenGivenNullFeet_shouldReturnNull() {
        try {
            Feet value1 = new Feet(null);
            Feet value2 = new Feet(null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void whenGivenFeet_checkReferenceType_shouldReturnEqual() throws QuantityMeasurementException {
        Feet value1 = new Feet(0);
        Feet value2 = new Feet(2);
        Assert.assertTrue(value1 == value1);
        Assert.assertTrue(value2 == value2);
    }

    @Test
    public void whenGivenFeet_checkValue_shouldReturnEqual() throws QuantityMeasurementException {
        Feet value1 = new Feet(1);
        Feet value2 = new Feet(2);
        Assert.assertTrue(value1.equals(value1));
        Assert.assertTrue(value2.equals(value2));
    }

    // Test Cases For Inch
    @Test
    public void whenGivenNullInch_shouldReturnNull() {
        try {
            Inch value1 = new Inch(null);
            Inch value2 = new Inch(null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void whenGivenInch_checkReferenceType_shouldReturnEqual() throws QuantityMeasurementException {
        Inch value1 = new Inch(0);
        Inch value2 = new Inch(2);
        Assert.assertTrue(value1 == value1);
        Assert.assertTrue(value2 == value2);
    }

    @Test
    public void whenGivenInch_checkValue_shouldReturnEqual() throws QuantityMeasurementException {
        Inch value1 = new Inch(1);
        Inch value2 = new Inch(2);
        Assert.assertTrue(value1.equals(value1));
        Assert.assertTrue(value2.equals(value2));
    }
}
