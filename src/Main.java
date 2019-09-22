public class Main {
    public static void main(String[] args) {

        //generate list of 1st 20 fibonacci numbers using non-recursive method
        getFibonacciNonRecursive();

        //generate list of 1st 20 fibonacci numbers using recursive method
        int fib1 = 1;
        int fib2 = 1;
        int counterFib = 2;
        System.out.print(fib1 + ", " + fib2 + ", ");
        getFibonacciRecursive(fib1, fib2, counterFib);
        System.out.println("\b\b\n");

        //display steps to reach 1 in the Collatz conjecture using a recursive method
        //number 167 used as an example
        System.out.println("Collatz Conjecture Number 67:");
        int n = 67;
        getCollatzRecursive(n);

        //generate list of how many steps are needed to reach 1 in the Collatz conjecture using a recursive method
        //this shows for numbers 2-200
        System.out.println("Collatz Conjecture Numbers 1-100:");
        for (int i = 1; i < 101; i++){
            int counter = 0;
            int n1 = i;
            getCollatzRecursive(i, n1, counter);
        }
    }

    public static void getFibonacciNonRecursive(){
        int[] fibonacci = new int[20];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for(int i = 2; i < 20; i++){
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }
        System.out.println("The first 20 numbers in the Fibonacci sequence are: ");
        for(int i = 0; i < 20; i++){
            System.out.print(fibonacci[i] + ", ");
        }
        System.out.println("\b\b\n");
    }

    public static void getFibonacciRecursive(int fib1, int fib2, int counterFib){

        int fib3 = fib1 + fib2;
        System.out.print(fib3 + ", ");
        fib1 = fib2;
        fib2 = fib3;
        counterFib += 1;
        if(counterFib < 20){
            getFibonacciRecursive(fib1, fib2, counterFib);
        }
    }

    public static void getCollatzRecursive(int n){
        if(n%2 == 0){
            n = n / 2;
        }else{
            n = 3 * n + 1;
        }
        if(n == 1){
            System.out.println("We reached 1!\n");
        }else{
            System.out.println("interim result: " + n);
            getCollatzRecursive(n);
        }
    }
    public static void getCollatzRecursive(int i, int n1, int counter){
        if(n1%2 == 0){
            n1 = n1 / 2;
        }else{
            n1 = 3 * n1 + 1;
        }
        if(n1 == 1){
            counter += 1;
            System.out.println(i + " - We reached a result of 1 in " + counter + " steps.");
        }else{
            counter += 1;
            getCollatzRecursive(i, n1, counter);
        }
    }
}
