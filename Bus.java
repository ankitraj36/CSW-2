public class Bus {
    int distance , forac ,fornaac;
    String source ,destination;

    public Bus( String source ,String destination , int distance , int forac , int fornaac){
        this.source = source;

        this.destination = destination;
        this.distance = distance;
        this.forac = forac;
        this.fornaac  = fornaac;

    }

    public void forac(){
        System.out.println("For ac : " + distance*forac);
    }

    public void fornaac(){
        System.out.println("For Non ac : " + distance*fornaac);
    }

    public void display(){
        System.out.println("Source  :" + source);
        System.out.println("Destination :" + destination);
        System.out.println("Distance :" + distance);
        System.out.println("For ac bus = Rs."+ forac + " per Km" );
        System.out.println("IF Non ac bus = Rs."+ fornaac + " per Km" );
    }
   public static void main(String[] args) {
    Bus b1 = new Bus("Bhubaneswar","Hyderabad", 1050,3,2);
    b1.display();
    b1.forac();
    b1.fornaac();
   }

}


//WRITE A JAVA PROGRAM TO CREATE AN PROJECT  WHERE THE BUSID AND BUS_FARE WILL BE CALCULATED USING OBJECT ORIENTED CONCEPT. USE THE PARAMETERIZED CONSTRUCTOR TO PASS THE VALUE TO DATA MEMBERS AND USE TWO MEMBER FUNCTION LIKE BUSIDGENERATOR( AND BUSFARECALUCULATOR() TO OBTAIN THE DESIRED VALUES.
// Class definition for the Bus project
// class Bus {
//     // Data members
//     private String busName;
//     private int busID;   
//     private double baseFare;
//     private int numberOfPassengers;
//     private double totalFare;

//     // Parameterized constructor
//     public Bus(String busName, double baseFare, int numberOfPassengers) {
//         this.busName = busName;
//         this.baseFare = baseFare;
//         this.numberOfPassengers = numberOfPassengers;
//         this.busID = 0; // Initialized to 0, will be generated in busIDGenerator()
//         this.totalFare = 0.0; // To be calculated in busFareCalculator()
//     }

//     // Function to generate a unique Bus ID
//     public void busIDGenerator() {
//         this.busID = (int) (Math.random() * 10000); // Generate a random 4-digit ID
//         System.out.println("Generated Bus ID: " + this.busID);
//     }

//     // Function to calculate total bus fare
//     public void busFareCalculator() {
//         this.totalFare = this.baseFare * this.numberOfPassengers;
//         System.out.println("Total Fare for Bus: " + this.totalFare);
//     }

//     // Display bus details
//     public void displayBusDetails() {
//         System.out.println("Bus Name: " + this.busName);
//         System.out.println("Bus ID: " + this.busID);
//         System.out.println("Base Fare per Passenger: " + this.baseFare);
//         System.out.println("Number of Passengers: " + this.numberOfPassengers);
//         System.out.println("Total Fare: " + this.totalFare);
//     }
// }

// // Main class to test the Bus project
// public class BusProject {
//     public static void main(String[] args) {
//         // Create a Bus object using the parameterized constructor
//         Bus myBus = new Bus("City Express", 50.0, 40);

//         // Generate Bus ID
//         myBus.busIDGenerator();

//         // Calculate Bus Fare
//         myBus.busFareCalculator();

//         // Display Bus Details
//         myBus.displayBusDetails();
//     }
// }
