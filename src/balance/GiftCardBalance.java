package balance;

import balance.Balance;

import java.util.UUID;

public class GiftCardBalance extends Balance {
    public GiftCardBalance(Integer customerId, Double balance) {
        super(customerId, balance);
    }

    @Override
    public Double addBalance(Double additionalBalance) {
        double promotionAmount = additionalBalance * 10/100;
        setBalance(getBalance()+additionalBalance+promotionAmount);
        return getBalance();
    }
}
