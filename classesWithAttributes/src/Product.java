public class Product {

  int _id;
  String _name;
  String _description;
  double _price;
  int _stockAmount;
  String _renk;
  String _kod;

  public Product(int id,String name,String description,double price,String renk) {
    this._id = id;
    this._name = name;
    this._description = description;
    this._price = price;
    this._renk = renk;
    this._kod = "12345";
  }

  /**
   * @return int return the _id
   */
  public int get_id() {
    return _id;
  }

  /**
   * @param _id the _id to set
   */
  public void set_id(int _id) {
    this._id = _id;
  }

  /**
   * @return String return the _name
   */
  public String get_name() {
    return _name;
  }

  /**
   * @param _name the _name to set
   */
  public void set_name(String _name) {
    this._name = _name;
  }

  /**
   * @return String return the _description
   */
  public String get_description() {
    return _description;
  }

  /**
   * @param _description the _description to set
   */
  public void set_description(String _description) {
    this._description = _description;
  }

  /**
   * @return double return the _price
   */
  public double get_price() {
    return _price;
  }

  /**
   * @param _price the _price to set
   */
  public void set_price(double _price) {
    this._price = _price;
  }

  /**
   * @return int return the _stockAmount
   */
  public int get_stockAmount() {
    return _stockAmount;
  }

  /**
   * @param _stockAmount the _stockAmount to set
   */
  public void set_stockAmount(int _stockAmount) {
    this._stockAmount = _stockAmount;
  }

  /**
   * @return String return the _renk
   */
  public String get_renk() {
    return _renk;
  }

  /**
   * @param _renk the _renk to set
   */
  public void set_renk(String _renk) {
    this._renk = _renk;
  }

  /**
   * @return String return the _kod
   */
  public String get_kod() {
    return this._name.substring(0, 5) + " " + this._id;
  }

  /**
   * @param _kod the _kod to set
   */
  public void set_kod(String _kod) {
    this._kod = _kod;
  }
}
