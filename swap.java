class swap{
    public static void main(String[] args) {
        int a= 5;
        int b = 10;

        System.out.println("without swap a is= "+a+" b is ="+b);

        a =a+b;
        b =a-b;
        a =a-b;

        System.out.println("After swaping a= "+a+ " B is after swaping= "+b);
    }


}