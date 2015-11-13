package com.mtgjson.parser;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ForeignName {

    @JsonProperty(required = true)
    private String language;

    @JsonProperty(required = true)
    private String name;

    @JsonProperty(required = true)
    private Integer multiverseid;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMultiverseid() {
        return multiverseid;
    }

    public void setMultiverseid(Integer multiverseid) {
        this.multiverseid = multiverseid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, name, multiverseid);
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        ForeignName other = (ForeignName) obj;
        return Objects.equals(language, other.language) && Objects.equals(name, other.name)
                && Objects.equals(multiverseid, other.multiverseid);
    }

}
