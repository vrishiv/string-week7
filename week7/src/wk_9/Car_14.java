package wk_9;

public class Car_14 {
        private String company_name;
        private String model_name;
        private int year;
        private double mileage;
        public String getCompany_name() {
            return company_name;
        }

        public void setCompany_name(String company_name) {
            this.company_name = company_name;
        }

        public String getModel_name() {
            return model_name;
        }

        public void setModel_name(String model_name) {
            this.model_name = model_name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public double getMileage() {
            return mileage;
        }

// Main.java
// Main Class

        public static void main(String[] args) {
            // Create an instance of Car
            Car_14 car = new Car_14();

            // Set the values using the setter methods
            car.setCompany_name("Nissan");
            car.setModel_name("Micra");
            car.setYear(2015);
            car.mileage(60);
            // mileage is not set using the setter method

            // Get the values using the getter methods
            String company_name = car.getCompany_name();
            String model_name = car.getModel_name();
            int year = car.getYear();
            double mileage = car.getMileage();

            // Print the values
            System.out.println("Company Name: " + company_name);
            System.out.println("Model Name: " + model_name);
            System.out.println("Year: " + year);
            System.out.println("Mileage: " + mileage);
        }

    private void mileage(int i) {
        System.out.println(i);
    }
}

