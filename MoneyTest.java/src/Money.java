public class Money {
    private int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public static Money dollar(int amount) {
        return new Money(amount);
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier);
    }
}
