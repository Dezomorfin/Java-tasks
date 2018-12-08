// Вывод квадратных корней чисел от 1 до 99
// вместе с ошибкой округления

class SqrRoot {
    public static void main(String args []) {
        
        double num;
        double sroot;
        double rerr;

        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("sqrt " + num + " = " + sroot);

            // вычислить ошибку округления
            rerr = num - (sroot * sroot);
            System.out.println("Error: " + rerr);
            System.out.println();
        }
    }
}