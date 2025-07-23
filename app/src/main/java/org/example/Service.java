package org.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;

public class Service {

  private static final String ADDR = "http://www.google.com";
  private static final int TIMEOUT_MS = 2000;

  public boolean ping() {
    try {
      URL url = new URL(ADDR);
      HttpURLConnection urlConnect = (HttpURLConnection) url.openConnection();
      urlConnect.setUseCaches(false);
      Object objData = urlConnect.getContent();
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}