package com.company;

public class TowersOfHanoi {

    public TowersOfHanoi()
    {

    }

    public static void solve(int d, int startPeg, int endPeg, int middlePeg)
    {
        if(d == 1)
        {
            System.out.println("1: Move one disk from tower " + (startPeg + 1) + " to " + (endPeg + 1));
        }

        else
        {
            solve(d - 1, startPeg, middlePeg, endPeg);
            solve(1, startPeg, endPeg, middlePeg);
            solve(d - 1, middlePeg, endPeg, startPeg);
        }
    }
}
