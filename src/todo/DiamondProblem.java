package todo;

public class DiamondProblem implements MyInterface1 , MyInterface2{

    //The diamond problem is avoided by overriding the  default method. This is mandatory if you extends more than two interface with default
    // note: if the method name  is different i.e say display1() in MyInterface1 and display2() in  MyInterface2 then you dont need to override
    //display() method
    @Override
    public void display() {
        MyInterface1.super.display();
    }
}
