package idalko.balance;

import org.junit.Assert;
import org.junit.Test;

public class BalanceTest {
    static idalko.balance.Balance balance = new idalko.balance.Balance();

    @Test
    public void balancedParenthensiesTest(){
        Assert.assertEquals(true, balance.checkBalancingParentheses("(()())"));
    }

    @Test
    public void notBalancedParenthensiesTest(){
        Assert.assertEquals(false, balance.checkBalancingParentheses("(()(())()(()(()("));
    }

}
