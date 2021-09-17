package question2;

public class bunnies {

    public String name;
    public int limbs;
    public String breed;


    //concrete method
    public bunnies(String name,int limbs,String breed){
        this.name = name;
        this.limbs = limbs;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "bunnies{" +
                "name='" + name + '\'' +
                ", limbs=" + limbs +
                ", breed='" + breed + '\'' +
                '}';
    }
}

