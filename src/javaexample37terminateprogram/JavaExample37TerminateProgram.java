package javaexample37terminateprogram;

public class JavaExample37TerminateProgram {

    public static void main(String[] args) {

        double number;
        
        while (true) {
            
            number = Math.random();
            
            if (number > 0.5 && number < 0.7) {
                System.exit(0);
            }
            
            System.out.println("The random number is: "+number);
        }
    }

}
