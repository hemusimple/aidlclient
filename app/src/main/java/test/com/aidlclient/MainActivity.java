package test.com.aidlclient;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    IMyAidlInterface iMyAidlInterface;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent serviceIntent = new Intent()
                .setComponent(new ComponentName(
                        "test.com.aidlreciever",
                        "test.com.aidlreciever.service.AidleService"));

        startService(serviceIntent);
        bindService(serviceIntent, mConnection, BIND_AUTO_CREATE);
    }


    private ServiceConnection mConnection = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName className, IBinder service) {
            //  mLog.append("Service binded!\n");
            iMyAidlInterface = IMyAidlInterface.Stub.asInterface(service);
            sendNumber();
        }

        @Override
        public void onServiceDisconnected(ComponentName className) {
            String disconnected = "disconnected";
            // This method is only invoked when the service quits from the other end or gets killed
            // Invoking exit() from the AIDL interface makes the Service kill itself, thus invoking this.

        }
    };

    private void sendNumber() {
        try {

         Data[] data=   iMyAidlInterface.getData();
          for (Data data1:data){
              String name = data1.getName();
              String nam1 = data1.getName();
          }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
