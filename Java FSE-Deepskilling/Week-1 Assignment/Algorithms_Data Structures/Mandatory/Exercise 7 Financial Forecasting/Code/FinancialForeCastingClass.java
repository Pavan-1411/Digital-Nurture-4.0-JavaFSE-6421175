public class FinancialForeCastingClass {
    public static double getGrowthRate(double pastGrowthRates[],int n)
    {
        double sum=0;
         for(int i=0;i<n;i++)
         {
             sum+=pastGrowthRates[i];
         }
         return sum/n;
    }
    public static double predict(double capital,double growthRate,int years)
    {
        if(years==0)
        return capital;
        return predict(capital,growthRate,years-1)*(1+growthRate/100.0);
    }
}
