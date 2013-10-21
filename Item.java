public class Item {
  private String name;
  private Long id;
  private String emailAddress;
  private BigDecimal price;
  
  public Item() {
  }
  
  public Item(Long id, String name, String emailAddress) {
    this.id = id;
    this.name = name;
    this.emailAddress = emailAddress;
  }
}
