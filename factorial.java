public class factorial {
    public static void main(String[] args) {
        int input =10;

        System.out.println(factorial(input));
    }

    public static long factorial(long n){
        if(n==1){
            return 1;
        }
        else{
            return(n*factorial(n-1));
        }
    }
    
}
