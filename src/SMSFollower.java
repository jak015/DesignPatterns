public class SMSFollower extends Follower {
    private String phoneNumber;

    public SMSFollower(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
     public void update(String message) {
        System.out.println(phoneNumber + " recieved the following notifcation: " + message);
    }
}
