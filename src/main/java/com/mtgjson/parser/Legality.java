package com.mtgjson.parser;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Legality {

    @JsonProperty(required = true)
    private String format;

    @JsonProperty(required = true)
    private String legality;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLegality() {
        return legality;
    }

    public void setLegality(String legality) {
        this.legality = legality;
    }

    @Override
    public int hashCode() {
        return Objects.hash(format, legality);
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        Legality other = (Legality) obj;
        return Objects.equals(format, other.format) && Objects.equals(legality, other.legality);
    }

}
