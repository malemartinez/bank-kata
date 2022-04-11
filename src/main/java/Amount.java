public class Amount {

    private int value;

    private Amount(int value) {
        this.value = value;
    }

    public static Amount amountOf(int value) {
        return new Amount(value);
    }

    public Amount addTheValue(Amount amount) {
        return amountOf(this.value + amount.value);
    }

    public Amount negative() {
        return amountOf(-value);
    }
}
