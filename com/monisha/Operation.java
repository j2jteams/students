package com.monisha;

class Operation
    {
        public int add ( int a, int b){
        return a+b;
    }

        public int add ( int a, int b, int c){
        return a+b+c;
    }

        public double add ( double a, double b){
        return a+b;

    }


public  static void main(String[] args)
{
    Operation opr=new Operation();
    System.out.println(opr.add(10,15));
    System.out.println(opr.add(13,14,23));
    System.out.println(opr.add(32.1,34.7));






}
}
