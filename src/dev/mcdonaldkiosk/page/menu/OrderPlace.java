package dev.mcdonaldkiosk.page.menu;

import dev.mcdonaldkiosk.page.eatplace.EatingPlace;
import dev.mcdonaldkiosk.page.payment.place.PaymentPlace;

/**
 * Created by kimjaehyeon
 * Class Role : 주문장소를 선택 데이터를 보관 관리한다.
 */
public class OrderPlace {

  private static final OrderPlace UNIQUE_INSTANCE = new OrderPlace();

  private String eatPlace;
  private String payPlace;

  private OrderPlace() {

  }

  public static OrderPlace getInstance() {
    return UNIQUE_INSTANCE;
  }

  public String getEatPlace() {
    return eatPlace;
  }

  public void setEatPlace(EatingPlace place) {

    this.eatPlace = place.toString();
  }

  public String getPayPlace() {
    return payPlace;
  }

  public void setPayPlace(PaymentPlace place) {
    this.payPlace = place.toString();
  }

  public void init() {
    eatPlace = null;
    payPlace = null;
  }
}
