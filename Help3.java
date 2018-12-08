class Help3 {
    public static void main(String args [])
        throws java.io.IOException {
            char choice;
            char ignore;
        for(;;) {
            do {
                System.out.println("Help:");
                System.out.println(" 1. if");
                System.out.println(" 2. switch");
                System.out.println(" 3. for");
                System.out.println(" 4. while");
                System.out.println(" 5. do-while");
                System.out.println(" 6. break");
                System.out.println(" 7. continue\n");
                System.out.println("Select: (q - exit): ");
                
                choice = (char) System.in.read(); // Получение симв с клавиатуры

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
              } while ( choice < '1' | choice > '7' & choice != 'q');
    
              if(choice == 'q') break;
              
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
                case '3':
                  System.out.println("Statement for:\n");
                  System.out.println("for (initialization; condition; iteration)");
                  System.out.println(" statement;");
                  break;
                case '4':
                  System.out.println("Statement while:\n");
                  System.out.println("while (condition) statement;");
                  break;
                case '5':
                  System.out.println("Statement do-while:\n");
                  System.out.println("do {");
                  System.out.println(" statement;");
                  System.out.println("} while (condition);");
                  break;
                case '6':
                  System.out.println("Statement break:\n");
                  System.out.println("break; or break label;");
                  break;
                case '7':
                System.out.println("Statement continue:\n");
                System.out.println("continue; or continue label;");
                break;
            }
            System.out.println();
        }
    }
}