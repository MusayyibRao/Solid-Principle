package dependencyInversion;

public class DabitCard implements BankCard
{

public void doTransaction(long amount)
{

  System.out.println("payment using dabit card = RS "+amount);
}

}