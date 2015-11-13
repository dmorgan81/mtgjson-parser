package com.mtgjson.parser;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Set {

    @JsonProperty(required = true)
    private String name;

    @JsonProperty(required = true)
    private String code;

    private String gathererCode;

    private String oldCode;

    private String magicCardsInfoCode;

    private java.util.Set<String> magicRaritiesCodes;

    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date releaseDate;

    @JsonProperty(required = true)
    private String border;

    @JsonProperty(required = true)
    private String type;

    private String block;

    private boolean onlineOnly;

    private List<Object> booster;

    private java.util.Set<Card> cards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGathererCode() {
        return gathererCode;
    }

    public void setGathererCode(String gathererCode) {
        this.gathererCode = gathererCode;
    }

    public String getOldCode() {
        return oldCode;
    }

    public void setOldCode(String oldCode) {
        this.oldCode = oldCode;
    }

    public String getMagicCardsInfoCode() {
        return magicCardsInfoCode;
    }

    public void setMagicCardsInfoCode(String magicCardsInfoCode) {
        this.magicCardsInfoCode = magicCardsInfoCode;
    }

    public java.util.Set<String> getMagicRaritiesCodes() {
        return magicRaritiesCodes;
    }

    public void setMagicRaritiesCodes(java.util.Set<String> magicRaritiesCodes) {
        this.magicRaritiesCodes = magicRaritiesCodes;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public boolean isOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(boolean onlineOnly) {
        this.onlineOnly = onlineOnly;
    }

    public List<Object> getBooster() {
        return booster;
    }

    public void setBooster(List<Object> booster) {
        this.booster = booster;
    }

    public java.util.Set<Card> getCards() {
        return cards;
    }

    public void setCards(java.util.Set<Card> cards) {
        this.cards = cards;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        Set other = (Set) obj;
        return Objects.equals(name, other.name);
    }

}
