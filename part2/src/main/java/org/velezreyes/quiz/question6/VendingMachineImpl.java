package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  private static VendingMachineImpl instance;

  private int insertedQuarters=0;

  private VendingMachineImpl(){

  }

  public static VendingMachine getInstance() {
    
    if(instance==null){
      instance=new VendingMachineImpl();
    }

    return instance;
  }

  @Override
  public void insertQuarter() {
    
    insertedQuarters++;
    
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {

     Cola cola=null;
     Tea tea=null;
    
    if(name.equals("ScottCola")){

      cola = new Cola(name, true);

      if(insertedQuarters<3){

        throw new NotEnoughMoneyException();

      }

      insertedQuarters=0;
      return cola;

    }
    else if(name.equals("KarenTea")){

      tea = new Tea(name, false);

      if(insertedQuarters<4){

        throw new NotEnoughMoneyException();

      }

      insertedQuarters=0;
      return tea;
    }
    else{

      throw new UnknownDrinkException();

    }

  }
}