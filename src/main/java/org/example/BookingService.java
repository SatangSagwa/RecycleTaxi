package org.example;

public class BookingService {
    private double maxVikt = 800;
    private int minstaBokning = 3;
    private boolean isFull;

  public BookingService(double maxVikt, int minstaBokning, boolean isFull) {
      this.isFull = isFull;
      this.maxVikt = maxVikt;
      this.minstaBokning = minstaBokning;
  }
}

