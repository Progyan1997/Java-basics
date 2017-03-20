/*
   Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

    To achieve encapsulation in Java -

        * Declare the variables of a class as private.

        * Provide public setter and getter methods to modify and view the variables values.
*/

class Encapsulation{
    int x;
    private int z;
    
    void setZ(int _Z){
        z = _Z;
    }
    int getSum(){
        return x + z;
    }
}

class Main{
    public static void main(String args[]){
        Encapsulation ecap = new Encapsulation();
        ecap.setZ(5);
        ecap.x = 6;
        System.out.println(ecap.getSum());
    }
}