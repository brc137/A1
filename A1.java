import java.util.Scanner; // import the Scanner class to gain access to make our Scanner object

public class A1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in); // keyboard is now how we will prompt for input
    String userName;
    double income,taxable,retire,ftax,stax,ltax,ptax,takehome; // these are the variables you will need to set or calculate

    // name income 401k
    //calc taxable (income -retire)
    //calc 10% fedtax, 3.07% statetax, 1%localtax, 6.2% payroll tax
    //calc takehome (taxable - all the taxes)
    // Enter username and press Enter
    System.out.print("Enter your name income and 401k contribution on the same line separated by an empty space i.e. mike 12000 2500: ");

    userName = keyboard.next();
    income = keyboard.nextDouble();
    retire = keyboard.nextDouble();

    taxable = income - retire;
    ftax = taxable * 0.1;
    stax = taxable * 0.0307;
    ltax = taxable * 0.01;
    ptax = taxable * 0.062;
    takehome = taxable - ftax - stax - ltax - ptax;

    System.out.println("Taxpayer name is: "+userName);
    System.out.println("Their Income was: "+income);
    System.out.println("Their taxable income was: "+taxable);

    System.out.println("Their Federal tax is: "+ftax);
    System.out.println("Their State tax is: "+stax);
    System.out.println("Their Local tax is: "+ltax);
    System.out.println("Their Payroll tax is: "+ptax);
    System.out.println("Their takehome amount is: "+takehome);

  }
}
