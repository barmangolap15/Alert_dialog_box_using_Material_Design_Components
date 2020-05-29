package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    private Button mShowDialogBtn;

    private CharSequence[] mAlertItems;
    private boolean[] mSelectedItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowDialogBtn = findViewById(R.id.show_dialog_btn);

        mAlertItems = new CharSequence[]{
                "Apple",
                "Ball",
                "Cat"
        };

        mSelectedItems = new boolean[]{
                false,
                true,
                true
        };

        mShowDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(MainActivity.this);
                builder.setTitle("View Options");
                builder.setMultiChoiceItems(mAlertItems, mSelectedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        //Do something here
                    }
                });
                builder.setBackground(getResources().getDrawable(R.drawable.alert_dialog_bg, null));
                builder.setPositiveButton("OKAY", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Do something when clicked
                    }
                });
                builder.setNegativeButton("DISMISS", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Do something when clicked
                    }
                });
                builder.show();

            }
        });
    }
}
