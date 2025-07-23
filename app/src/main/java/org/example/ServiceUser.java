package org.example;

public class ServiceUser {
  private final Service service;

  public ServiceUser(Service service) {
    this.service = service;
  }

  public boolean useService() {
    if(service.ping()) {
      System.out.println("Using the service...");
      return true;
    } else
      throw new RuntimeException("Service is not available");
  }
}