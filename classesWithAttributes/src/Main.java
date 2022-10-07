public class Main {

  public static void main(String[] args) throws Exception {
    Product product = new Product(1, "Laptop", "Asus Laptop", 10000, "Siyah");

    ProductManager productManager = new ProductManager();
    productManager.Add(product);

    System.out.println(product.get_kod());
  }
}
