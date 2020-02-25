package com.kodilla.patterns.builder.bigmac;

public class Bun {
    public static final String WITHSESAME = "WITH SESAME";
    public static final String WITHOUTSESAME = "WITHOUT SESAME";
    final private String bun;

    public Bun(String bun) {
        if(bun.equals(WITHSESAME) || bun.equals(WITHOUTSESAME)) {
            this.bun = bun;
        } else {
            throw new IllegalStateException("You can choose bun: WITH SESAME or WITHOUT SESAME");
        }
    }

    public String getBun() {
        return bun;
    }
}
