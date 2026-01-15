/**
 * Represents a Cow with name, age,weight
 * @author Kumail
 * @version 1.0
 */
public class Cow {
    private String name;
    private int age;
    private double weight;

    /**
     * Constructs a Cow with name, age, and weight
     *
     * @param name   cow name
     * @param age    cow age
     * @param weight cow weight
     */
    public Cow(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /** 
     * @return name 
    */
    public String getName() {
        return name;
    }

    /** 
     * @return age 
    */
    public int getAge() {
        return age;
    }

    /** 
     * @return weight 
    */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns name, age - weight
     *
     * @return formatted string
     */
    @Override
    public String toString() {
        return name + ", " + age + " - " + weight;
    }

    /**
     * Cows are equal if name, age, and weight are same
     *
     * @param obj object
     * @return true if all fields match
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Cow)) {
            return false;
        }
        Cow other = (Cow) obj;

        boolean namesEqual = (this.name == null && other.name == null)
                || (this.name != null && this.name.equals(other.name));

        return namesEqual && this.age == other.age && this.weight == other.weight;
    }
}