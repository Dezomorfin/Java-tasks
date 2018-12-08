class Guess {
    public static void main(String args [])
    throws java.io.IOException {
        
        char ch, ignore, answer = 'S';

        do {
          System.out.println("Conceived character from the range A-Z.");
          System.out.print("Let's guess this: ");

          ch = (char) System.in.read(); // Получение симв с клавиатуры
          
          // Отбросить все остальные символы во входном буфере
          do {
              ignore = (char) System.in.read();
             } while (ignore != '\n');

        if(ch == answer) System.out.println("*** It's True! ***");

          else { 
            System.out.println("...Sorry, the desired character is ");
            // Вложенный оператор if
            if (ch < answer)
            System.out.println("near the end of the alphabet");
              else System.out.println("near the begin of the alphabet");
              System.out.println("try again\n");
            }
        }  while(answer != ch);
    }
}