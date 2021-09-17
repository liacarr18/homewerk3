package homewerk3;

    public class Triangle {
        //every triangle has these properties

        double base = 0.0;
        double height = 0.0;
        double side1 = 0.0;
        double side2 = 0.0;

        //constructor to create objects with the new keyword inside main
        public Triangle(){ }


        //this calculates the area of a triangle length * length
        public double triaArea(){
            return 0.5 * (this.base * this.height);
        }

        //this calculates the perimeter of a triangle
        public double triaPerm(){
            return this.base + this.side1 + this.side2;
        }

        @Override
        public String toString() {
            return "Triangle{" +
                    "base=" + base +
                    ", height=" + height +
                    ", side1=" + side1 +
                    ", side2=" + side2 +
                    '}';
        }

    }

