// Простая справочная система
class Help {
    public static void main(String args []) 
    throws java.io.IOException {
        char choice;
          
        System.out.println("Help:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println("Select: ");

        choice = (char) System.in.read();
        
        System.out.println("\n");

        switch (choice) {
          case '1':
            System.out.println("Statement if:\n");
            System.out.println("if (condition) statement;");
            System.out.println("else statement;");
            break;
          case '2':
          System.out.println("Statement switch: \n");
          System.out.println("switch (expression) {");
          System.out.println(" case const:");
          System.out.println(" statement sequence");
          System.out.println(" break;");
          System.out.println(" // ...");
        System.out.println("}");
          break;
        default:
          System.out.print("Error 404");
        }
    }
}