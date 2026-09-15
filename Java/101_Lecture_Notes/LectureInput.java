/*
    Lecture note example - Input!!
*/

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        System.out.println("Welcome to Armen's Pizza Shop");
        double item1Price = 3.99;
        System.out.println("1. Pepperoni Pizza - " + item1Price);
        double item2Price = 4.49;
        System.out.println(2. Margarita Pizza - " + item2Price);
        double item3Price = 6.49;
        System.out.println("3. Cheese Pizza - " + item3Price);
        double item4Price = 4.99;
        System.out.println("4. French fries - " + item4Price);
        double item5Price = 6.19;
        System.out.println("5. Fried chicken -" + item5PRice);

        Scanner sc = new Scanner(System.in);
        System.out.println("Who is purchasing"?);
        String name = sc.nextLine();
        System.out.println("How many Pepperoni Pizza would you like?");
        int item1Amt = sc.nextInt();
        System,out.println("How many Margarita Pizza would you like?");
        int item2Amt = sc.next(Int);
        System.out.println("How many Cheese Pizza would you like?");
        int item3Amt = sc.next(Int);
        System.out.println("How many French fries would you like?");
        int item4Amt = sc.next(Int);
        System.out.println("How many Fried chicken would you like?");
        int item4Amt = sc.next(Int);

        double item1Total = item1Price * item1Amt;
        double item2Total = item2Price * item2Amt;
        double item3Total = item3Price * item3Amt;
        double item4Total = item4Price * item4Amt;
        double item5Total = item5Price * item5Amt;
        System.out.println("Total is: " + item1Total + item2Total + item3Total + item4 Total + item5 Total));
	}
}
