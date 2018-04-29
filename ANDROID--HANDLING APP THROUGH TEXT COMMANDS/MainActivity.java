package com.example.shubham.camera;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.R.*;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.*;
import java.util.List;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends Activity {
   // private static final attr R = ;
    // private static final attr R = ;
    public boolean x1;
    public boolean x2;
    public boolean xx;
    public boolean x3;

    public TextView v1;
    public TextView v2;
    public String y;

    public String x;
    EditText t1;
    Button photoButton;
    private static final int CAMERA_REQUEST = 1888;
    ImageView imageView;
  // public attr R;
    // private attr R;
    // private android.R.attr R;
    // private android.R.attr R;

    @SuppressLint("CutPasteId")
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        t1 = (EditText) findViewById(R.id.editText);
        v1 = (TextView) findViewById(R.id.textView100);
        //v1 = (TextView) findViewById(R.id.textView);


        v2 = (TextView) findViewById(R.id.textView200);

        imageView = (ImageView) this.findViewById(R.id.imageView1);
        //x = t1.getText().toString();

        Button photoButton = (Button) this.findViewById(R.id.button1);






            photoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {






               String a1 = t1.getText().toString();
               switch(a1)
               {
                   case"calculator":
                   {
                       x1 = true;
                       break;
                   }
                   case"camera":
                   {
                       x2=true;
                        break;
                   }
                   case"settings":
                   {
                       x3=true;
                       break;
                   }
                   default:
                   {
                       xx=true;
                        break;
                   }
               }


                if (x1 == true)
                //CALCULATOR
                {
                    Intent intent = new Intent(Intent.ACTION_MAIN, null);
                    intent.addCategory(Intent.CATEGORY_APP_CALCULATOR);
                    final ComponentName cn = new ComponentName("com.android.calculator2", "com.android.calculator2.Calculator");
                    intent.setComponent(cn);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    x1=false;
                } else if (x2 == true)
                {//CAMERA
                    Intent intent2 = new Intent(Intent.ACTION_MAIN, null);
                    intent2.addCategory(Intent.CATEGORY_LAUNCHER);




                   final ComponentName cn2 = new ComponentName("com.android.camera","com.android.camera.Camera");//not working



                    intent2.setComponent(cn2);
                    intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent2);
                    x2=false;
                }
                else if(xx==true)
                {//INVALID

                    v1.setText("Invalid Input");
                xx=false;
                }


                else if (x3 == true)
                {//SETTINGS

                    Intent intent3 = new Intent(Intent.ACTION_MAIN, null);
                    intent3.addCategory(Intent.CATEGORY_APP_CONTACTS);


                    final ComponentName cn3 = new ComponentName("com.android.settings", "com.android.settings.Settings");
                    intent3.setComponent(cn3);
                    intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent3);
                    x3 = false;

                    t1.setText("Enter Text");
                }

            }


        });
    }
}



//#***************************************************************************************************************************//*#






       /** protected void onActivityResult ( int requestCode, int resultCode, Intent data){
            if (requestCode == CAMERA_REQUEST) {
                Bitmap photo = (Bitmap) data.getExtras().get("data");
                imageView.setImageBitmap(photo);
            }
        }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.activity_main, menu);
            return true;
        }

}*/

