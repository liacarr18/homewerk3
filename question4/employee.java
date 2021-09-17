package question4;

public class employee {

        ////this initializes the hours worked/hourly pay to zero
        double hoursWorked = 0.0;
        double hourlyPay = 0.0;

        //constructor to create objects with the new keyword inside main

        public employee(double hoursWorked, double hourlyPay){
            this.hoursWorked = hoursWorked;
            this.hourlyPay = hourlyPay;
        }


        //this will multiply hpay and hworked bi-weekly
        public double biPay(){
            return this.hourlyPay * this.hoursWorked;
        }

        //calculates the annual pay
        public double annualPay(){
            return (this.hourlyPay * this.hoursWorked) * 26;
        }

    @Override
    public String toString() {
        return "grindNeverStops{" +
                "hoursWorked=" + hoursWorked +
                ", hourlyPay=" + hourlyPay +
                '}';
    }
}


