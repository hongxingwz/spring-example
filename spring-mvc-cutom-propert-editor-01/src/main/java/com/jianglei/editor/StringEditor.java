package com.jianglei.editor;

import java.beans.PropertyEditorSupport;

/**
 * @author jianglei
 * @since 8/3/18
 */
public class StringEditor extends PropertyEditorSupport {

    public StringEditor() {
        super();
        System.out.println("我被初始化了");
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(text + "|||");
    }
}
