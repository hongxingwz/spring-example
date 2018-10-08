package com.jianglei.editor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author jianglei
 * @since 8/3/18
 */
public class DateEditor extends PropertyEditorSupport {

    private String dateFormat;

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Override
    public String getAsText() {
        return new SimpleDateFormat(dateFormat).format(getValue());
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        try {
            setValue(new SimpleDateFormat(text).parse(text));
        } catch (ParseException e) {
            setValue(null);
        }

    }
}
