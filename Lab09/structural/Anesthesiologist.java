package edu.parinya.softarchdesign.structural;

// the file wasn't provided in the first place, so I implemented it myself
public class Anesthesiologist extends HealthcareWorker {
    public Anesthesiologist(String name, double price) {
        super(name, price);
    }

    @Override
    public void service() {
        System.out.println(this.getName() + " takes care of the total perioperative care of patients before, during and after surgery.");
    }
}
