public class MobilePhone implements Telephone {
    private String mynumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public MobilePhone(String phoneNumber){
        this.mynumber = phoneNumber;
    }
    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone powered on ");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing" + phoneNumber + "on deskphone");
    }

    @Override
    public void answer() {
        if(isRinging && isPowerOn){
            System.out.println("Answering the phone");
            isRinging = false;
        }else{

        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber == mynumber && isPowerOn){
            isRinging = true;
            System.out.println("Phone ringing");
        }else{
            System.out.println("Either wrong number entered or phone is off");
            isRinging = false;

        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
