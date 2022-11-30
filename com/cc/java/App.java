package com.cc.java;

public class App {
    public static void main(String[] args) {

      MA_Prod ma1 = new MA_Prod("Mustermann", "Max", 1965, "ID001" , "production", "worker",2010);
      MA_Acc ma2 = new MA_Acc("Popow", "Oleg", 1974, "ID002" , "accounting", "accountant",2012);
      MA_Adv ma3 = new MA_Adv("Martinelli", "Silvia", 1985, "ID003" , "advertising", "consultant", 2018);
      
      
      output("------- MA 1 --------------");	
      pollMA(ma1);

      output("------- MA 2 --------------");	
      pollMA(ma2);

      output("------- MA 3 --------------");	
      pollMA(ma3);
      
      output("------- Misc --------------");	

      output("Geburtsjahr: " + ma1.getBirthYear());				
      ma2.setFamilyName("Nossow");
      output(ma2.getFamilyName());
      
    }
  
    // Polymorphie .... MA_Advertising --> MA 
    public static void pollMA(MA ma) {
      output(ma.startsWork());
      output(ma.hasLunch());
      output(ma.doYourWork()); 
      output(ma.getEmployedTime());
      output(ma.getPersonalData());
    }

    private static void output(String outStr) {
        System.out.println(outStr);
    }
}
