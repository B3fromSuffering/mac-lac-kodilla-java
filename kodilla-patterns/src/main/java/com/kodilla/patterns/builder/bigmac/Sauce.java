package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    public static final String STANDARD = "STANDARD";
    public static final String ISLANDS = "1000 ISLANDS";
    public static final String BARBECUE = "BARBECUE";
    final private String sauce;

    public Sauce(String sauce) {
        if(sauce.equals(STANDARD) || sauce.equals(ISLANDS) || sauce.equals(BARBECUE)) {
            this.sauce = sauce;
        } else {
            throw new IllegalStateException("You can choose: standard, 1000 islands, barbecue");
        }
    }

    public String getSauce() {
        return sauce;
    }
}
