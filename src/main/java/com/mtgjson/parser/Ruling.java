package com.mtgjson.parser;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class Ruling {

    @JsonProperty(required = true)
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;

    @JsonProperty(required = true)
    private String text;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, text);
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        Ruling other = (Ruling) obj;
        return Objects.equals(date, other.date) && Objects.equals(text, other.text);
    }

}
