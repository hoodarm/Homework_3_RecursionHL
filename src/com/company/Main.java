package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(recursiveT(10));
        System.out.println(nonRecursiveT(10));
    }

    static int recursiveT(int n)
    {
        if (n==0 || n==1)
            return 1;
        return recursiveT(n-1) + (n-1)*recursiveT(n-2);
    }

    static int nonRecursiveT(int n)
    {
        int prev =1;
        int cur = 1;
        if (n==0 || n==1)
            return 1;
        for (int curN = 2; curN<=n; curN++)
        {
            int next =cur + (curN-1)*prev;
            prev = cur;
            cur = next;
        }
        return cur;
    }
}
