package question3;

public class calculator {

        public int numero1;
        public int numero2;

//this will let the code know to use two integers (datatype) later on when you give it a variable
        public calculator(int numero1, int numero2){
            this.numero1 = numero1;
            this.numero2 = numero2;}
//down below, we are including 4 methods that will return the answer; answer varies based on which of the four basic operations of arithmetic we are returning
        public int addition(){
            return this.numero1 + this.numero2;
        }
        public int multiply(){
            return this.numero1 * this.numero2;
        }
        public int divide() {
            return this.numero1 / this.numero2;
        }
        public int subtract(){
            return this.numero1 - this.numero2;
        }

        ////this will return the exponents
        public int exponents(){ return (int) Math.exp(this.numero2);}
    }




