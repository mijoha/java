package com.github.mijoha.calcengine;

public class Main {

    public static void main(String[] args) {
        double val1=100.0d;
        double val2= 0.0d;
        double result;
        char opcode='d';

        double[] val3 = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] val4 = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] operCode = {'d','a','s','m','g'};
        double[] results = new double[val3.length];


        if(opcode == 'a')
            result = val1 + val2;
        else if (opcode == 's')
            result = val1 - val2;
        else if (opcode == 'd')
            result = val2!=0 ? val1 / val2 : 0.0d;
        else if (opcode == 'm')
            result = val1 * val2;
        else {
            System.out.println("error");
            result = 0.0d;
        }
        System.out.println(result);

        for(int i = 0 ; i < operCode.length ; i++){
            switch (operCode[i]) {
                case 'd':
                    results[i] = val4[i] != 0 ? val3[i] / val4[i]:0;
                    break;
                case 'a':
                    results[i] = val3[i] + val4[i];
                    break;
                case 's':
                    results[i] = val3[i] - val4[i];
                    break;
                case 'm':
                    results[i] = val3[i] * val4[i];
                    break;
                default:
                    System.out.println("error");
                    results[i] = 0.0d;
            }
        }
                for(double theResult : results)
                    System.out.println(theResult);




        // write your code here
    }
}
