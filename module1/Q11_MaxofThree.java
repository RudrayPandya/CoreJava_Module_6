package com.module1;

class Q11_MaxofThree {

    // Method to find maximum
    static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        
        return max;
    }

    public static void main(String[] args) {
        int x = 10, y = 25, z = 15;

        int result = findMax(x, y, z);
        System.out.println("Maximum number is: " + result);
    }
}