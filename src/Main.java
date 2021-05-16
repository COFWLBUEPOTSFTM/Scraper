import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    StockImpl.createAll();
    StockImpl.AAPL.printData();
    StockImpl.GME.printData();
    StockImpl.MSFT.printData();

    for (int i = 0; i < 3; i++){
      StockImpl.updateAll();
      StockImpl.printAllData();
    }
  }

}
