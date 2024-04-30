public class EmailNotif implements NotificationSender {
    @Override
    public void sendEmailNotification(String email) {
      // Simulate sending email notification
      System.out.println("Email notification sent to: " + email);
    }  
}
