package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bgButton;
    public RelativeLayout relativeLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgButton = (Button) findViewById(R.id.button_fon);
        relativeLayout = (RelativeLayout) findViewById(R.id.ConstraintLayout);
        context = MainActivity.this;

        bgButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        final CharSequence[] items = {getText(R.string.red),
                getText(R.string.yellow), getText(R.string.green)
        };
    };
}
