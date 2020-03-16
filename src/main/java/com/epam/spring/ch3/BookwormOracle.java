package com.epam.spring.ch3;

public class BookwormOracle implements Oracle {
    private GeometryBook elements;

    public void setGeometryBook(GeometryBook elements) {
        this.elements = elements;
    }

    @Override
    public String defendMeaningOfLine() {
        return "Keep in mind, that the Line is straight and not curved.";
    }
}
