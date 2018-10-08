package com.jianglei.registrar;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import javax.annotation.PostConstruct;
import java.beans.PropertyEditor;
import java.util.Map;

/**
 * @author jianglei
 * @since 8/3/18
 */
public class MyRegistrar implements PropertyEditorRegistrar {

    private Map<Class, PropertyEditor> propertyEditors;

    @PostConstruct
    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        for (Map.Entry<Class, PropertyEditor> entry : propertyEditors.entrySet()) {
            registry.registerCustomEditor(entry.getKey(), entry.getValue());
        }
    }


    public Map<Class, PropertyEditor> getPropertyEditors() {
        return propertyEditors;
    }

    public void setPropertyEditors(Map<Class, PropertyEditor> propertyEditors) {
        this.propertyEditors = propertyEditors;
    }
}
