class Bottle{
    String company;
    int capacity;
    @Override
    public String toString() {
        return "Bottle [company=" + company + ", capacity=" + capacity + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((company == null) ? 0 : company.hashCode());
        result = prime * result + capacity;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bottle other = (Bottle) obj;
        if (company == null) {
            if (other.company != null)
                return false;
        } else if (!company.equals(other.company))
            return false;
        if (capacity != other.capacity)
            return false;
        return true;
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Bottle b1 = new Bottle();
        b1.capacity = 2;
        b1.company = "Bisleri";

        Bottle b2 = new Bottle();
        b2.capacity = 3;
        b2.company = "Rajhans";

        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b1.toString());
    }
}
