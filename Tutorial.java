class Tutorial {
    public static void main(String ags[]) {
    
        int x = 1;
        int total = 0;
        
        while(x <= 100) {
            if(x % 2 == 0) {
                total += x;
            if(total < 100){
                break;
                }

            }
        x++;
        }
        System.out.println("The total is " + total);
    }
}