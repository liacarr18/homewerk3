package question4;

public class weRich {
        //this will now take the variables and call back to the other class to find out the bi/annual pay
        public static void main(String[] args) {
            employee gabeItch = new employee(60.0, 50.0);
            System.out.println("Gabe Itch's bi-weekly pay is : " + gabeItch.biPay());
            System.out.println("Gabe Itch's annual pay is : " + gabeItch.annualPay());
        }
}

