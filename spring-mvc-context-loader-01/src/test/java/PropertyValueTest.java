import org.junit.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;

import java.util.List;

/**
 * @author jianglei
 * @since 7/27/18
 */
public class PropertyValueTest {

    @Test
    public void test01() {
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.add("a", "a");
        propertyValues.add("a", "aa");

        List<PropertyValue> list = propertyValues.getPropertyValueList();
        for (PropertyValue propertyValue : list) {
            String name = propertyValue.getName();
            System.out.println(name + propertyValue.getValue());
        }
    }
}
