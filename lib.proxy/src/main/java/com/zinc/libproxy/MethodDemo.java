package com.zinc.libproxy;

import java.lang.reflect.Method;

import java.lang.reflect.Method;

public class MethodDemo {
   public static void main(String[] args) {
      Method[] methods = SampleClass.class.getMethods();
      for (Method method:methods){
         System.out.println(method.getName());
      }
      Class[] parameterTypes = methods[1].getParameterTypes();

      for(Class parameterType: parameterTypes){
         System.out.println(parameterType.getName());   

      }
   }
}

class SampleClass {
   private String sampleField;

   public String getSampleField() {
      return sampleField;
   }

   public void setSampleField(String sampleField) {
      this.sampleField = sampleField;
   } 
}