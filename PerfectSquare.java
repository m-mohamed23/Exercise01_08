public class PerfectSquare {
	
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(1));
		System.out.println(isPerfectSquare(4));
		System.out.println(isPerfectSquare(Integer.MAX_VALUE/100));
		System.out.println(isPerfectSquare(255));
		
	}
	
	public static boolean isPerfectSquare(int num) {
        for(int i = 1; i < num; i++) {
          // This should a double "=" for comparison operator
          // The curly braces were also missing so I added them to identify the scope for each of the conditionals.
        	if(i*i == num) {
            return true;
          } 
        	else if (i*i > num) {
            return false;
          }
        }
      // Since this function returns a boolean, "false" should be the default value.
      return false;
    }
}
