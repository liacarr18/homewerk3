package homewerk3;

    public class Square {

//        //this is a constructor to create objects with the new keyword inside main
//        public square(){ }

        double side = 0.0; //this initializes the side(length) of the square to zero

        //this is a constructor to create objects with the new keyword inside main
        public Square(){ }

        //this is the formula needed to calculate the area of the square
        public double squaArea(){
            return this.side * this.side;
        }

        //this is the formula needed to calculate the perimeter of the square
        public double squaPerm(){
            return this.side * 4;
        }


        @Override
        public String toString() {
            return "Square{" +
                    "side=" + side +
                    '}';
        }
//string representation of the object between the two classes

        public static void main(String[] args){

        }
    }


