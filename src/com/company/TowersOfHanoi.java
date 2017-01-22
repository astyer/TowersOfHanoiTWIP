package com.company;

public class TowersOfHanoi {

    public static int sNum = 1;

    public static void solve(int d, int startPeg, int endPeg, int middlePeg)
    {
        if(d == 1)
        {
            System.out.println(sNum++ + ": Move one disk from tower " + startPeg + " to " + endPeg);
        }

        else
        {
            solve(d - 1, startPeg, middlePeg, endPeg);
            solve(1, startPeg, endPeg, middlePeg);
            solve(d - 1, middlePeg, endPeg, startPeg);
        }
    }
}
