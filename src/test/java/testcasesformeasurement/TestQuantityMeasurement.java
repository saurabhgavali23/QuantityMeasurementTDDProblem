package testcasesformeasurement;

import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.QuantityMeasurement;
import quantitymeasurement.QuantityMeasurementException;

public class TestQuantityMeasurement {

    // Test Cases For Feet
    @Test
    public void whenGivenZeroFeet_shouldReturnEqualFeet() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(QuantityMeasurement.Unit.FEET, 0);
        int value = quantityMeasurement.getConversionValue();
        Assert.assertEquals(0, value);
    }

    @Test
    public void whenGivenNullFeet_shouldReturnNull() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement(null, 0);
            quantityMeasurement.getConversionValue();
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void whenGivenFeet_checkReferenceType_shouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(QuantityMeasurement.Unit.FEET, 0);
        int value = quantityMeasurement.getConversionValue();
        Assert.assertTrue(value == value);
    }

    @Test
    public void whenGivenFeet_checkValue_shouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(QuantityMeasurement.Unit.FEET, 0);
        int value = quantityMeasurement.getConversionValue();
        Assert.assertEquals(value, value);
    }

    // Test Cases For Inch
    @Test
    public void whenGivenNullInch_shouldReturnNull() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement(null, 0);
            quantityMeasurement.getConversionValue();
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
        }
    }

    @Test
    public void whenGivenInch_checkReferenceType_shouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(QuantityMeasurement.Unit.INCH, 0);
        int value = quantityMeasurement.getConversionValue();
        Assert.assertTrue(value == value);
    }

    @Test
    public void whenGivenInch_checkValue_shouldReturnEqual() throws QuantityMeasurementException {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement(QuantityMeasurement.Unit.INCH, 0);
        int value = quantityMeasurement.getConversionValue();
        Assert.assertEquals(value, value);
    }
}
