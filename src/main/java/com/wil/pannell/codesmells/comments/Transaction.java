package com.wil.pannell.codesmells.comments;

public class Transaction {
  private boolean debit;
  private float amount;

  public Transaction(boolean isDebit, float amount) {
    debit = isDebit;
    this.amount = amount;
  }

  public boolean isDebit() {
    return debit;
  }
  public float getAmount() {
    return amount;
  }
}
