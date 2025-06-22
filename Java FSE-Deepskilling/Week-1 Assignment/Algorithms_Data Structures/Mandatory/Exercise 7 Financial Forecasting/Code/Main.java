public class Main
{
    public static void main(String[] args)
    {
        double pastGrowthRates[] = {0.5, 0.2, 0.8, 1.2, 0.1, 0.7, 0.4, 0.9, 0.5, 0.7};
        double growthRate=FinancialForeCastingClass.getGrowthRate(pastGrowthRates,pastGrowthRates.length);
        double capital=100000;
        int years=3;
        System.out.printf("Forecasted value after %d years is : %.2f rupees\n",years,FinancialForeCastingClass.predict(capital, growthRate, years));
        years=5;
        System.out.printf("Forecasted value after %d years is : %.2f rupees\n",years,FinancialForeCastingClass.predict(capital, growthRate, years));
    }
}