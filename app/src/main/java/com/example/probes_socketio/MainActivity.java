package com.example.probes_socketio;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

public class MainActivity extends AppCompatActivity {
    /*private EditText mInputMessageView;
    private Socket mSocket;

    {
        try {
            mSocket = IO.socket("http://chat.socket.io");
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mSocket.connect();
        //mSocket.on("new message", onNewMessage);
        //mSocket.connect();
    }

    /*
    @Override
    public void onDestroy() {
        super.onDestroy();

        mSocket.disconnect();
        mSocket.off("new message", onNewMessage);
    }

    private void attemptSend() {
        String message = mInputMessageView.getText().toString().trim();
        if (TextUtils.isEmpty(message)) {
            return;
        }

        mInputMessageView.setText("");
        mSocket.emit("new message", message);
    }

    private Emitter.Listener onNewMessage = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    JSONObject data = (JSONObject) args[0];
                    String username;
                    String message;
                    try {
                        username = data.getString("username");
                        message = data.getString("message");
                    } catch (JSONException e) {
                        return;
                    }
                    // add the message to view
                    //addMessage(username, message);
                }
            });
        }
    };*/
}
