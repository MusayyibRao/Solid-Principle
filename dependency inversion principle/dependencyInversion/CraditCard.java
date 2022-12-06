package dependencyInversion;

import dependencyInversion.BankCard;

public class CraditCard implements BankCard
{

public void doTransaction(long amount)
{

  System.out.println("payment using cradit card = RS "+amount);
}

}