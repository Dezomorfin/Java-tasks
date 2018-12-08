class CastDemo {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x / y); // приведение тип double к типу int (потеря дроб)
        System.out.println("Целочисленный результат деления x на y: " + i);
        
        i = 100;
        b  = (byte) i; // а в этом случае потери информации нет
        System.out.println("Значение b: " + b);

        i = 257;
        b  = (byte) i; // на этот ра информайия теряется
                       // тип byte не может содержать 257
        System.out.println("Значение b: " + b);
        
        b = 88; // Представление символа X в коде ASCII
        ch = (char) b; // Явное приедение несовместимых типов
        System.out.println("ch: + ch");
    }
}