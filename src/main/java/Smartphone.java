import java.util.Objects;

public class Smartphone extends Product{
    protected String produce;

    public Smartphone(int id, String name, int price, String produce) {
        super(id, name, price);
        this.produce = produce;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(produce, that.produce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produce);
    }
}
