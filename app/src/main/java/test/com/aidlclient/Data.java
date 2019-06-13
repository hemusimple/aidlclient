package test.com.aidlclient;

import android.os.Parcel;
import android.os.Parcelable;

public   class Data implements Parcelable {

  private   String name;

    public Data(Parcel in) {
        name = in.readString();
    }

    public Data(String value) {
        name = value;
    }

    public String getName() {
        return name;
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }
}
