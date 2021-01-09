package com.k;
import org.bson.types.ObjectId;
public class test {
  public static void main(String[] args) {
    ObjectId id = new ObjectId();
    ObjectId id1 = new ObjectId(id.toHexString());
    System.out.println(id.toHexString());
    System.out.println(id1.toHexString());
    System.out.println(id.equals(id1));
  }
}
