

/**
 * ConverterTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package com.gagan.webservice;

    /*
     *  ConverterTest Junit test case
    */

    public class ConverterTest extends junit.framework.TestCase{

     
        /**
         * Auto generated test method
         */
        public  void testfarenheitToCelsius() throws java.lang.Exception{

        com.gagan.webservice.ConverterStub stub =
                    new com.gagan.webservice.ConverterStub();//the default implementation should point to the right endpoint

           com.gagan.webservice.ConverterStub.FarenheitToCelsius farenheitToCelsius8=
                                                        (com.gagan.webservice.ConverterStub.FarenheitToCelsius)getTestObject(com.gagan.webservice.ConverterStub.FarenheitToCelsius.class);
           				farenheitToCelsius8.setFarenheit(212);
           
                
                        assertNotNull(stub.farenheitToCelsius(
                        farenheitToCelsius8));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartfarenheitToCelsius() throws java.lang.Exception{
            com.gagan.webservice.ConverterStub stub = new com.gagan.webservice.ConverterStub();
             com.gagan.webservice.ConverterStub.FarenheitToCelsius farenheitToCelsius8=
                                                        (com.gagan.webservice.ConverterStub.FarenheitToCelsius)getTestObject(com.gagan.webservice.ConverterStub.FarenheitToCelsius.class);
             	farenheitToCelsius8.setFarenheit(212);
                

                stub.startfarenheitToCelsius(
                         farenheitToCelsius8,
                    new tempCallbackN65548()
                );
              


        }

        private class tempCallbackN65548  extends com.gagan.webservice.ConverterCallbackHandler{
            public tempCallbackN65548(){ super(null);}

            public void receiveResultfarenheitToCelsius(
                         com.gagan.webservice.ConverterStub.FarenheitToCelsiusResponse result
                            ) {
                
            }

            public void receiveErrorfarenheitToCelsius(java.lang.Exception e) {
                fail();
            }

        }
      
        /**
         * Auto generated test method
         */
        public  void testcelsiusToFarenheit() throws java.lang.Exception{

        com.gagan.webservice.ConverterStub stub =
                    new com.gagan.webservice.ConverterStub();//the default implementation should point to the right endpoint

           com.gagan.webservice.ConverterStub.CelsiusToFarenheit celsiusToFarenheit10=
                                                        (com.gagan.webservice.ConverterStub.CelsiusToFarenheit)getTestObject(com.gagan.webservice.ConverterStub.CelsiusToFarenheit.class);
           				celsiusToFarenheit10.setCelsius(100);
                
                        assertNotNull(stub.celsiusToFarenheit(
                        celsiusToFarenheit10));
                  



        }
        
         /**
         * Auto generated test method
         */
        public  void testStartcelsiusToFarenheit() throws java.lang.Exception{
            com.gagan.webservice.ConverterStub stub = new com.gagan.webservice.ConverterStub();
             com.gagan.webservice.ConverterStub.CelsiusToFarenheit celsiusToFarenheit10=
                                                        (com.gagan.webservice.ConverterStub.CelsiusToFarenheit)getTestObject(com.gagan.webservice.ConverterStub.CelsiusToFarenheit.class);
             	celsiusToFarenheit10.setCelsius(100);
                

                stub.startcelsiusToFarenheit(
                         celsiusToFarenheit10,
                    new tempCallbackN65589()
                );
              


        }

        private class tempCallbackN65589  extends com.gagan.webservice.ConverterCallbackHandler{
            public tempCallbackN65589(){ super(null);}

            public void receiveResultcelsiusToFarenheit(
                         com.gagan.webservice.ConverterStub.CelsiusToFarenheitResponse result
                            ) {
                
            }

            public void receiveErrorcelsiusToFarenheit(java.lang.Exception e) {
                fail();
            }

        }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    