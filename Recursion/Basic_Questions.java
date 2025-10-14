//   Factorial


public class Factorial {
  public static void main(String[] args) {
	  int ans = fact(5);
	  System.out.println(ans);
  }
  
  public static int fact(int n) {
      if(n <= 1) {
    	  return 1;
      }
      return n * fact(n - 1);
  }
}

===============================================================================================================================================================================================

//n-- and --n concept


public class DecIncOperators {
  public static void main(String args[]) {
	  print(5);
  }
  
  public static void print(int n) {
	  if(n == 0) {
		  return;
	  }
	  System.out.println(n);
	  
	  // print(n--); // error as we first pass value to function and then increment
	  print(--n);
  }
}

==============================================================================================================================================================================================

//Fibonacci


public class fibRecursion {
  public static void main(String args[]) {
	  System.out.println(fibo(5));
  }
  
  public static int fibo(int n) {
	  if(n < 2) {
		  return n;
	  }
	  return fibo(n - 1) + fibo(n - 2);
  }
}

==============================================================================================================================================================================================

// print 5 4 3 2 1


public class Program1 {
    public static void main(String args[]) {
    	print(5);
    }
    
    public static void print(int n) {
    	if(n == 0) {
    		return;
    	}
    	System.out.println(n);
    	print(n - 1);
    	
    }
}


==============================================================================================================================================================================================
// sum of Digits


public class sumDigit {

	public static void main(String[] args) {
       int ans = sum(1342);
       System.out.println(ans);

	}
	
	public static int sum(int n) {
		if(n == 0) {
			return 0;
		}
		
		return (n % 10) + sum(n / 10);
	}

}



==============================================================================================================================================================================================

//sum of n numbers


public class sumOfN {
  public static void main(String args[]) {
	  int sum = sum(5);
	  System.out.println(sum);
  }
  
  public static int sum(int n) {
	  if(n == 1) {
		  return 1;
	  }
	  
	  return n + sum(n - 1);
  }
}


==============================================================================================================================================================================================

import java.util.ArrayList;

public class findAll {
	public static void main(String[] args) {
		   int[] arr = {1,34,54,32,76,76,12,56,76,55,76,76};
		   int target = 76;
		   findIndex(arr , target , 0);
		   System.out.println(list);

		}
		
	    static ArrayList<Integer> list = new ArrayList();
		public static void findIndex(int[] arr , int target , int index) {
			if(index == arr.length - 1) {
				return;
			}
			if(arr[index] == target) {
				list.add(index);
			}
			
			findIndex(arr , target , index + 1);
		}

}


==============================================================================================================================================================================================


public class findElement {

	public static void main(String[] args) {
		 int[] arr = {2,4,34,54,56,76,54,57};
		 int target = 76;
		 boolean ans = find(arr,target,0);
		 System.out.println(ans);

	}
	
	public static boolean find(int[] arr , int target , int index) {
		if(index == arr.length - 1) {
			return false;
		}
		
		return arr[index] == target || find(arr , target , index + 1);
	}

}


==============================================================================================================================================================================================


public class findIndex {

	public static void main(String[] args) {
	   int[] arr = {1,34,54,32,12,56,76,55};
	   int target = 76;
	   int ans = findIndex(arr , target , 0);
	   System.out.println(ans);

	}
	
	public static int findIndex(int[] arr , int target , int index) {
		if(index == arr.length - 1) {
			return -1;
		}
		if(arr[index] == target) {
			return index;
		}else {
			return findIndex(arr , target , index + 1);
		}
	}

}


==============================================================================================================================================================================================
import java.util.ArrayList;

public class returnList {
	public static void main(String[] args) {
		   int[] arr = {1,34,54,32,76,76,12,56,76,55,76,76};
		   int target = 76;
		   System.out.println(findIndex(arr,target,0,new ArrayList()));

		}
		
	  
		public static ArrayList<Integer> findIndex(int[] arr , int target , int index, ArrayList<Integer> list) {
			if(index == arr.length - 1) {
				return list;
			}
			if(arr[index] == target) {
				list.add(index);
			}
			
			return findIndex(arr , target , index + 1,list);
    }
}         


==============================================================================================================================================================================================


public class sortedArray {
   public static void main(String args[]) {
	   int[] arr = {11,12,13,44,15,16,17,18,19};
	   boolean ans = sorted(arr , 0);
	   System.out.println(ans);
   }
   
   
   public static boolean sorted(int[] arr , int index) {
	   if(index == arr.length -1) {
		   return true;
	   }
	   
	   return arr[index] < arr[index + 1] && sorted(arr , index + 1);
   }
}


==============================================================================================================================================================================================
