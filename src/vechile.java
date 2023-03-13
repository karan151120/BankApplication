public class vechile {

    int tyre;
    String colour;
    int capacity;
    int enginePower;
    int price;

    vechile(int tyre, String colour, int capacity) {
        this.tyre = tyre;
        this.colour = colour;
        this.capacity = capacity;
    }

    public vechile(int tyre, String colour, int capacity, int enginePower, int price) {
        //No need initialize above constoructor parameters again
        //Directly call above constructor through this keyword
        this(tyre, colour, capacity);

        this.enginePower = enginePower;
        this.price = price;
    }
}
