package org.udemy.practice.loop;

public class MissingNumbers {
	
	static int getMissingNo(int a[], int n)
    {
        int total = 1;
        for (int i = 2; i <= (n + 1); i++)
        {
            total += i;
            total -= a[i - 2];
        }
        return total;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = {10, 12, 14, 19, 21, 24};
        System.out.println(getMissingNo(arr, arr.length));
    }
	}

