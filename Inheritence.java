package com.avensys.javainheritence;

class Plane{
    void takeOff() {
      System.out.println("The plane is Takeoff");
    }
    void fly() {
        System.out.println("The plane is flying");
    }
    void land() {
        System.out.println("The plane is landed");
    }

}
class cargoPlane extends Plane {
    void fly() {
        System.out.println("The plane is flying in low speed");
    }
}
class passengerplane extends Plane {
    void fly() {
        System.out.println("The plane is flying in medium speed");
    }

}
class FighterPlane extends Plane {
    void fly() {
        System.out.println("The plane is flying in high speed");
    }
}

public class Inheritence {

	 public static void main (String args[]) {
	        cargoPlane cp = new cargoPlane();
	        passengerplane pp= new passengerplane();
	        FighterPlane fp = new FighterPlane();
	        cp.fly();
	        pp.fly();
	        fp.fly();
//	        System.out.println(cp);
//	        System.out.println(pp);
//	        System.out.println(fp);
	        
	    }
}
