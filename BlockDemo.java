class BlockDemo {
    public static void main(String ags[]) {
        double i;
        double j;
        double d;

        i = 5;
        j = 10;

        //Тело оператора if - целый блок кода
        if(i != 0) {
            System.out.println("i не равно нулю");
            d = j / i;
            System.out.println("j / i = "  + d);
        }
    }
}