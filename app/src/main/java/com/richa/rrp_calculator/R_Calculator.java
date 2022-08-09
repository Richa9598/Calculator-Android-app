package com.richa.rrp_calculator;
public class R_Calculator {

    public R_Calculator()
    {

    }
    public static double operation(String operator,double d1, double d2)
    {
        double result=0;
        double temp=1;

        int exp=(int)d2;
        if(operator=="+")
        {
            result=d1+d2;
        }
        if(operator=="-")
        {
            result=d1-d2;
        }
        if(operator=="/")
        {
            result=d1/d2;
        }
        if(operator=="x")
        {
            result=d1*d2;
        }
        if(operator=="pi")
        {
            result=d1*d2*3.14;
        }
        if(operator=="^")
        {

            for(int i=exp;i>0;i--)
            {
                temp=temp*d1;
            }
            result=temp;
        }
        return result;

    }
    public static double percent_operation(String operator,double d1, double d2)
    {
        double result=0;
        double temp=1;
        if(d2!=0)
        {
            if(operator=="+")
            {
                result=d1+((d1*d2)/100);
            }
            if(operator=="-")
            {
                result=d1-((d1*d2)/100);
            }
            if(operator=="x")
            {
                result=d1*(d2/100);
            }
            if(operator=="/")
            {
                result=(d1*100)/d2;
            }

        }
        else
        {
            result=d1/100;
        }

        return result;

    }

}
