public class SquarePrint {
    public static void main(String[] args){
        for(int i = 1 ; i<= 4 ; i++){
            for(int j = 1 ; j<= 10; j++){
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }

        
        int sum =  sum(6);
        System.out.println(sum);

        int result = sum(5, 10);
        System.out.println(result);
        
    }
    
    //This is recursive method
    public static int sum(int k) {
        if (k > 1) {
          return k * sum(k - 1);
        } else {
          return 1;
        }
      }
    
      
    public static int sum(int start, int end) {
      if (end > start) {
        return end + sum(start, end - 1);
      } else {
        return end;
      }
    }


}


