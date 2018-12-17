package com.kodilla.good.patterns.challenges.basket;

public enum SizeClothShirt {
    SMALL ("S"), MEDIUM ("M"), LARGE ("L");

    private String oneLetterSize;

    SizeClothShirt(String oneLetterSize) {
        this.oneLetterSize = oneLetterSize;
    }

    public String getOneLetterSize() {
        return oneLetterSize;
    }
}
