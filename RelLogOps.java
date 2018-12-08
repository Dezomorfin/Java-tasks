//Демонстрация использования операций сравнения 
//и логических операций
class RelLogOps {
    public static void main(String ags[]) {
        int i;
        int j;
        boolean b1;
        boolean b2;
        i = 10;
        j = 11;

        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i > j) System.out.println("Can't do this");
        if (i >= j) System.out.println("Can't do this");
        if (i == j) System.out.println("Can't do this");
        if (i != j) System.out.println("i != j");

        b1 = true;
        b2 = false;
        if (b1 & b2) System.out.println("Can't do this");
        if (!(b1 & b2)) System.out.println("It is true");
        if (b1 | b2) System.out.println("It is true");
        if (b1 ^ b2) System.out.println("It is true");
    }
}