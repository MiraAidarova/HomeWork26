import java.util.Objects;

public class Box <T,P,K>{

    private T name;
    private P price;




    public void methodT(){
        System.out.println(new Box<>("Ati",777));
//        return (T) box;
    }




    public Box() {

    }

    public Box(T name, P price) {
        this.name = name;
        this.price = price;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public P getPrice() {
        return price;
    }

    public void setPrice(P price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?, ?, ?> box = (Box<?, ?, ?>) o;
        return Objects.equals(name, box.name) && Objects.equals(price, box.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Box{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }


}
