public class ZombiePlant {

    private int maxPotency;
    //maximum potency level for successful treatment

    private int leftTreatments;
    //how many treatments still remain

    public ZombiePlant(int potency, int treatments) {
        maxPotency = potency;
        leftTreatments = treatments;
    }

    public int getPotency(){
        return maxPotency;
    }

    public int treatmentsNeeded(){
        return leftTreatments;
    }

    public boolean isDangerous(){
        return leftTreatments >= 1;
    }

    public void treat(int treatmentPotency){
        if(treatmentPotency <= maxPotency){
            leftTreatments--;
        }
    }

}
