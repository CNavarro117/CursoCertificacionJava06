/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsAndCollections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author CNR
 */
public class AccountManager {

//    private Map<String, int> accountTotals = new HashMap<String, int>();
//    private Map<String, Integer> accountTotals = new HashMap<String, Integer>();
//    private Map<String<Integer>> accountTotals = new HashMap<String<Integer>>();
    private Map accountTotals = new HashMap(); // ORIGINAL
    private int retirementFund;

    public int getBalance(String accountName) {
//        Integer total = (Integer) accountTotals.get(accountName);
//        if (total == null) {
//            total = Integer.valueOf(0);
//        }
//        return total.intValue();

        // -----------------------
//        int total = accountTotals.get(accountName);
//        if (total == null) {
//            total = 0;
//        }
//        return total;
        //------------------------------------------
        Integer total = accountTotals.get(accountName);
        if (total == null) {
            total = 0;
        }
        return total;
    }

    public void setBalance(String accountName, int amount) {
        accountTotals.put(accountName, Integer.valueOf(amount));
    }
}
