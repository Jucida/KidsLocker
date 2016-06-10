package r.kidslocker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sdk.adenda.lockscreen.AdendaAgent;
import sdk.adenda.widget.AdendaButton;
import sdk.adenda.widget.AdendaButtonCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        AdendaAgent.setDefaultUnlockLayout(this, R.layout.adenda_sample_unlock);
        AdendaAgent.setUnlockType(this, AdendaAgent.ADENDA_UNLOCK_TYPE_GLOWPAD);
//        AdendaAgent.addRemoteImageResource(
//                this,
//                "http://res.cloudinary.com/hrscywv4p/image/upload/c_limit,h_540,w_720/v8pyn3jsji4z5cgswyh9.png",
//                "", true);
        AdendaAgent.setEnableAds(this, true);
//        setContentView(R.layout.activity_main);
//        AdendaButton button = (AdendaButton) findViewById(R.id.lock_in_button);
//        AdendaButtonCallback callback = new AdendaButtonCallback(){
//            @Override public String getUserId() { return "123456";}
//            @Override public String getUserGender() { return null;}
//            @Override public String getUserDob() { return null;}
//            @Override public float getUserLatitude() { return 0;}
//            @Override public float getUserLongitude() { return 0;}
//            @Override public void onPreOptIn() {  }
//            @Override public void onPreOptOut() { }
//            @Override public void onPostOptIn() { }
//            @Override public void onPostOptOut() { }
//        };
//        button.setAdendaCallback(callback);
//        AdendaAgent.LockScreenHelper lockScreenHelper = new
//                AdendaAgent.LockScreenHelper (this, callback);
//        lockScreenHelper.startLockscreen();
    }
}
