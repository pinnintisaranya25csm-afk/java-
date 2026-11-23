package records;

class Reservation {

    int availableSeats = 100;

    // Synchronized method
    public synchronized void reserve(String person, int seats) {

        System.out.println(person + " entered.");

        System.out.println("Available seats: " + availableSeats +
                           " Requested seats: " + seats);

        if (seats <= availableSeats) {

            System.out.println("Seat Available. Reserve now :-)");

            availableSeats = availableSeats - seats;

            System.out.println(seats + " seats reserved.");
        }
        else {
            System.out.println("Requested seats not available :-)");
        }

        System.out.println(person + " leaving.");
        System.out.println("----------------------------------------------");
    }
}

class Person extends Thread {

    Reservation r;
    int seats;

    Person(String name, Reservation r, int seats) {
        super(name);
        this.r = r;
        this.seats = seats;
    }

    public void run() {
        r.reserve(getName(), seats);
    }
}

public class ReservationDemo {

    public static void main(String[] args) throws InterruptedException {

        Reservation r = new Reservation();

        Person p1 = new Person("Person-1", r, 5);
        Person p2 = new Person("Person-2", r, 2);
        Person p3 = new Person("Person-3", r, 4);

        p1.start();
        p1.join();

        p2.start();
        p2.join();

        p3.start();
        p3.join();
    }
}
