package com.example.agptest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

class test {

  public static void initialize() {
    // Constructor which represents javax.net.ssl.SNIHostName(String).
    // The class is available since Java 1.8 / Android API Level 24 (Android 7.0)
    getConstructor(
        "javax.net.ssl.SNIHostName", new Class<?>[] { String.class });

    // Method which represents javax.net.ssl.SSLParameters.setServerNames(List<SNIServerName>).
    // The method is available since Java 1.8 / Android API Level 24 (Android 7.0)
    getMethod(
        "javax.net.ssl.SSLParameters", "setServerNames", new Class<?>[] { List.class });
  }

  public static Constructor<?> getConstructor(String className, Class<?>[] parameterTypes)
  {
    try
    {
      return Class.forName(className).getConstructor(parameterTypes);
    }
    catch (Exception e)
    {
      return null;
    }
  }

  public static Method getMethod(String className, String methodName, Class<?>[] parameterTypes)
  {
    try
    {
      return Class.forName(className).getMethod(methodName, parameterTypes);
    }
    catch (Exception e)
    {
      return null;
    }
  }
}
