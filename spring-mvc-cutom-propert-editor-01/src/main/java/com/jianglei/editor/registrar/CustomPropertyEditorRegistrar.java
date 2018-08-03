package com.jianglei.editor.registrar;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import java.beans.PropertyEditor;
import java.util.Map;

/**
 * @author jianglei
 * @since 8/3/18
 */
public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {

    private Map<Class<?>, PropertyEditor> editors;

    public Map<Class<?>, PropertyEditor> getEditors() {
        return editors;
    }

    public void setEditors(Map<Class<?>, PropertyEditor> editors) {
        this.editors = editors;
    }

    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        for (Map.Entry<Class<?>, PropertyEditor> entry : editors.entrySet()) {
            registry.registerCustomEditor(entry.getKey(), entry.getValue());
        }
    }
}
