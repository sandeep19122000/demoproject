package bbb;

import java.util.Scanner;

import model.Record;

public interface Student {
public void add(Record record) ;
public boolean find(int idnimber);
public void delete(int recIdNumber);
public Record findRecord(int idNumber);
public void update(int id, Scanner input);
public void display();


}
