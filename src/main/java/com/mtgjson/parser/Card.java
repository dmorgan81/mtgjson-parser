package com.mtgjson.parser;

import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Card {

    @JsonProperty(required = true)
    private String id;

    @JsonProperty(required = true)
    private String layout;

    @JsonProperty(required = true)
    private String name;

    private Set<String> names;

    private String manaCost;

    private double cmc;

    private Set<String> colors;

    @JsonProperty(required = true)
    private String type;

    private Set<String> supertypes;

    private Set<String> subtypes;

    @JsonProperty(required = true)
    private Set<String> types;

    private String rarity;

    private String text;

    private String flavor;

    private String artist;

    private String number;

    private String power;

    private String toughness;

    private Integer loyalty;

    private Integer multiverseid;

    private Set<Integer> variations;

    private String imageName;

    private String watermark;

    private String border;

    private boolean timeshifted;

    private Integer hand;

    private Integer life;

    private boolean reserved;

    private String releaseDate;

    private boolean starter;

    // Extras Only Fields

    private Set<Ruling> rulings;

    private Set<ForeignName> foreignNames;

    private Set<String> printings;

    private String originalText;

    private String originalType;

    private Set<Legality> legalities;

    private String source;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public double getCmc() {
        return cmc;
    }

    public void setCmc(double cmc) {
        this.cmc = cmc;
    }

    public Set<String> getColors() {
        return colors;
    }

    public void setColors(Set<String> colors) {
        this.colors = colors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<String> getSupertypes() {
        return supertypes;
    }

    public void setSupertypes(Set<String> supertypes) {
        this.supertypes = supertypes;
    }

    public Set<String> getSubtypes() {
        return subtypes;
    }

    public void setSubtypes(Set<String> subtypes) {
        this.subtypes = subtypes;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public Integer getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(Integer loyalty) {
        this.loyalty = loyalty;
    }

    public Integer getMultiverseid() {
        return multiverseid;
    }

    public void setMultiverseid(Integer multiverseid) {
        this.multiverseid = multiverseid;
    }

    public Set<Integer> getVariations() {
        return variations;
    }

    public void setVariations(Set<Integer> variations) {
        this.variations = variations;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public boolean isTimeshifted() {
        return timeshifted;
    }

    public void setTimeshifted(boolean timeshifted) {
        this.timeshifted = timeshifted;
    }

    public Integer getHand() {
        return hand;
    }

    public void setHand(Integer hand) {
        this.hand = hand;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isStarter() {
        return starter;
    }

    public void setStarter(boolean starter) {
        this.starter = starter;
    }

    public Set<Ruling> getRulings() {
        return rulings;
    }

    public void setRulings(Set<Ruling> rulings) {
        this.rulings = rulings;
    }

    public Set<ForeignName> getForeignNames() {
        return foreignNames;
    }

    public void setForeignNames(Set<ForeignName> foreignNames) {
        this.foreignNames = foreignNames;
    }

    public Set<String> getPrintings() {
        return printings;
    }

    public void setPrintings(Set<String> printings) {
        this.printings = printings;
    }

    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }

    public String getOriginalType() {
        return originalType;
    }

    public void setOriginalType(String originalType) {
        this.originalType = originalType;
    }

    public Set<Legality> getLegalities() {
        return legalities;
    }

    public void setLegalities(Set<Legality> legalities) {
        this.legalities = legalities;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        Card other = (Card) obj;
        return Objects.equals(id, other.id);
    }

}
