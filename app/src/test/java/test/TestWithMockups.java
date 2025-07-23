package test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.example.Service;
import org.example.ServiceUser;
import org.junit.jupiter.api.Test;

public class TestWithMockups {

  @Test
  public void testUseServiceWithMockedService() {
    Service service = mock(Service.class);
    when(service.ping()).thenReturn(true);

    ServiceUser serviceUser = new ServiceUser(service);
    for(int i = 0; i < 200; i++)
      assertTrue(serviceUser.useService());


  }

}
