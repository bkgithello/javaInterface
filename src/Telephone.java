public interface Telephone {
            // What we can have in a Telephone. Here we dont have the body of the method we only declare it.
    // PowerOn
    // dial a number
    // answer a phone call
    // call another phone
    // is ringing

    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();
}
