package com.example.chapter3.injection;

import org.springframework.beans.factory.BeanFactory;

public class BookwormOracle implements Oracle {
    private Encyclopedia encyclopedia;

    public void setEncyclopedia(Encyclopedia encyclopedia) {
        this.encyclopedia = encyclopedia;
    }

    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedias are waste of mmoney - use the Internet";
    }

}
