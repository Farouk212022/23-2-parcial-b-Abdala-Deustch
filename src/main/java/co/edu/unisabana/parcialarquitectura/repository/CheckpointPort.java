package co.edu.unisabana.parcialarquitectura.repository;

import co.edu.unisabana.parcialarquitectura.repository.model.Checkin;
import co.edu.unisabana.parcialarquitectura.repository.model.Checkout;

public interface CheckpointPort {

  void saveCheckout(Checkout checkpoints);

  Checkin findLastCheckin(String driver, String facility);

  void finishCheckin(Checkin checkin);
}