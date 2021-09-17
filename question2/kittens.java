package question2;

public class kittens {

        //these are the data types paired with variables that we will be using thorughout this problem
        public String name;
        public String breed;
        public Integer limbs;


        ////this is a constructor to create objects with the new keyword inside main
        public kittens(String name,String breed, Integer limbs){
            this.name = name;
            this.breed = breed;
            this.limbs = limbs;
        }

    @Override
    public String toString() {
        return "kittens{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", limbs=" + limbs +
                '}';
    }
}






