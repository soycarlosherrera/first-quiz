package org.velezreyes.quiz.question6;

public class Tea implements Drink{

    private String name;
    private boolean isFizzy;

    public Tea(String name, boolean isFizzy) {
        
        this.name=name;
        this.isFizzy=isFizzy;
        
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public boolean isFizzy() {
        // TODO Auto-generated method stub
        return isFizzy;
    }
    
}