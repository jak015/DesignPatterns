public class EmailFollower extends Follower {
    private String email;
    
    public EmailFollower(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println(email + " recieved the following notifcation: " + message);
    }
}
