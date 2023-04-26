class Fibonacciexampleb {
    static int a = 0, b = 1, c = 0;

    static void printFibonacci(int count) {
        if (count > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(" " + c);
            printFibonacci(count - 1);
        }
    }

    public staticvoid main(String[] args) {
        int count = 10;
        System.out.println(a + " " + b);// print 0 and 1 as starters
        printFibonacci(count - 2);
    }
}