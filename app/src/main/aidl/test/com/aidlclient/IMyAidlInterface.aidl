// IMyAidlInterface.aidl
package test.com.aidlclient;
import  test.com.aidlclient.Data;
// Declare any non-default types here with import statements

interface IMyAidlInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
     Data[] getData();
    void basicTypes( String aString);

}
