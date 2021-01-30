package com.kodilla.inheritance.homework;

public class Doctor extends Job {

  public Doctor(double salary) {
      super(salary);
      this.responsibilities = "healing people";
  }
}
