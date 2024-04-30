public class OrderTest {
    public static void main(String[] args) {
      OrderAction order = new OrderAction();
      GenerateFile generateFile = new GenInvoice();
      NotificationSender notifSender = new EmailNotif();
  
      order.calculateTotal(10.0, 2);
      order.placeOrder("John Doe", "123 Main St");
  
          // These methods might not be needed for all orders
          generateFile.generateInvoice("order_123.pdf");
          notifSender.sendEmailNotification("johndoe@example.com");
    }
  }