public class InvoiceGenerator implements Generator {
    @Override
    public void generate(Order order, String target) {
        // Simulate generating invoice file
        System.out.println("Invoice Content:");
        System.out.println(order);
        System.out.println("Invoice generated: " + target);
      }    
}
