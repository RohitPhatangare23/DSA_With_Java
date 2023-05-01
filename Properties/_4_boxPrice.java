package Properties;

public class _4_boxPrice extends _3_BoxWeight{
    double cost;

    _4_boxPrice () {
        super();
        this.cost = -1;
    }

    _4_boxPrice(_4_boxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public _4_boxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public _4_boxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
