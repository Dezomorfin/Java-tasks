//Чтение символа с клавиатуры
class KbIn {
    public static void main(String args [])
    throws java.io.IOException {

        char ch;

        System.out.print("Click desired key and ENTER: ");

        ch = (char) System.in.read(); //Получить символ

        System.out.println("You click " + ch);
    }
}