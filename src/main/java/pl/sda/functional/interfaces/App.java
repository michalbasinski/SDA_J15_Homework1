package pl.sda.functional.interfaces;

class App {
    public static void main(String[] args) {

        //======Klasyczna klasa anonimowa========================
        MathOperation additionAnon = new MathOperation() {
            @Override
            public Double operation(Double a, Double b) {
                return a + b;
            }
        };

        //=========To samo jako lambda===========================
        MathOperation addition = (x,y) -> x + y;


        //==========Pozostałe operacje jako lambdy===============
        MathOperation subtraction = (x,y) -> x - y;

        MathOperation multiplication = (x,y) -> x * y;

        MathOperation division = (x,y) -> x / y;


    }
}
