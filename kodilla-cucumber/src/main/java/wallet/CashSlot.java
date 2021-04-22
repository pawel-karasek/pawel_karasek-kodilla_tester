package wallet;

public class CashSlot {
    private int contents;
    private int contents2;

    public int getContents() {
        return contents;
    }

    public int getContentsFrom100() {
        return contents2;
    }

    public void dispense(int amount) {
        this.contents = amount;
    }

    public void dispenseFrom100(int amount2) {
        this.contents2 = amount2;
    }
}
