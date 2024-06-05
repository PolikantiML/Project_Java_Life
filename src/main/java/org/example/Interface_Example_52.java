package org.example;


interface Test_Interface {
    public void display();
}
class Interface_Example_52 implements Test_Interface{
    public static void main(String[] args) {
        Interface_Example_52 obj = new Interface_Example_52();
        obj.display();
    }

    @Override
    public void display() {
        System.out.println("Implemented display meathod ..");
    }
}