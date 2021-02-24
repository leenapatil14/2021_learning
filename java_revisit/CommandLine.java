import java.util.Scanner;
class CommandLine {
    public static void main(String [] args) {
        while (true) {
            //display list of operations
            System.out.println("add subtract multiply divide alphabetize \n Enter operation: ");
            //get input from user
            Scanner ip = new Scanner(System.in);
            //convert the string inout to lower case
            String operation = ip.nextLine().toLowerCase();
            //start comparision
            try {
                //add two integers
                if (operation.equals("add")) {
                    System.out.println("Enter two integers");
                    int n1 = ip.nextInt();
                    int n2 = ip.nextInt();
                    System.out.println("Answer: " + (n1 + n2));
                    break;
                }
                //subtract two integers
                else if (operation.equals("subtract")) {
                    System.out.println("Enter two integers");
                    int n1 = ip.nextInt();
                    int n2 = ip.nextInt();
                    System.out.println("Answer: " + (n1 - n2));
                    break;
                }
                //multiply two doubles
                else if (operation.equals("multiply")) {
                    System.out.println("Enter two doubles");
                    double n1 = ip.nextDouble();
                    double n2 = ip.nextDouble();
                    System.out.printf("Answer: %,.2f \n" , (n1 * n2));
                    break;
                }
                //divide two doubles while handling divide by zero error
                else if (operation.equals("divide")) {
                    System.out.println("Enter two doubles");
                    double n1 = ip.nextDouble();
                    double n2 = ip.nextDouble();
                    if (n2 != 0.0) {
                        System.out.printf(" Answer: %,.2f \n", (n1/n2));
                        break;
                    }
                    else {
                        System.out.println("Oops! enter a number >0 for valid operations");
                    }
                }
                //compare two string lexographically
                else if (operation.equals("alphabetize")) {
                    System.out.println("Enter two words: ");
                    String w1 = ip.next();
                    String w2 = ip.next();
                    String str = "";
                    if (w1.compareTo(w2) > 0) {
                        str += (w2 + " comes before " + w1);
                    }
                    else if (w1.compareTo(w2) == 0) {
                        str += ("Chicken or Egg");
                    }
                    else {
                        str += (w1 + " comes before " + w2);
                    }
                    System.out.println(str);
                    break;
                }
                //handle any errors and prompt user to re-enter
                else {
                    System.out.println("Please Enter a valid operation!");
                }
            }
            catch (Exception e) {
                System.out.println("Please enter a valid input");
            }
        }

    }
}
