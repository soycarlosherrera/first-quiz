package org.velezreyes.quiz.question6;

public class Cola implements Drink{

    private String name;
    private boolean isFizzy;

    public Cola(String name, boolean isFizzy) {
        
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
