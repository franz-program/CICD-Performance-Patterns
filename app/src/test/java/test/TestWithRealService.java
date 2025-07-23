package test;

import org.example.ServiceUser;
import org.junit.jupiter.api.Test;

import org.example.Service;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestWithRealService {

  @Test
  public void testUseServiceWithRealService() {
    Service service = new Service();
    ServiceUser serviceUser = new ServiceUser(service);
    for(int i = 0; i < 200; i++)
      assertTrue(serviceUser.useService());

  }

}
