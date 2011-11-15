package edu.gatech.cs2340.shlat.models;
import java.io.*;
import edu.gatech.cs2340.shlat.models.Base64Coder;

public class Serialize<T> {
  public byte[] serialize(T object) throws IOException {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);
    try {
      oos.writeObject(object);
      oos.close();
      return baos.toByteArray();
    } finally {
      oos.close();
    }
  }

  public T deserialize(byte[] serializedObject) throws IOException, ClassCastException, ClassNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(serializedObject));
    try {
      @SuppressWarnings("unchecked")
      T o = (T) ois.readObject();
      return o;
    } finally {
      ois.close();
    }
  }
}
