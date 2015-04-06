package com.siliconorchard;





import com.siliconorchard.client.image.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Contact extends Activity {


   

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.contact);
            getActionBar().setTitle("About this app");

            Button c = (Button)findViewById(R.id.call);
            c.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String posted_by = "18005757483";
                    String uri = "tel:" + posted_by.trim();
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse(uri));
                    startActivity(intent);

                }
            });

            Button w = (Button)findViewById(R.id.website);
            w.setOnClickListener(new View.OnClickListener(){
                String i = "http://www.beauforthistoricsite.org";
                @Override
                public void onClick(View v) {

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(i));
                startActivity(browserIntent);
                }
            });

            Button d = (Button)findViewById(R.id.direction);
            d.setOnClickListener(new View.OnClickListener(){
                String d ="http://maps.google.com/maps?q=34.717063,-76.665841";

                @Override
                public void onClick(View v) {

                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(d));
                    startActivity(browserIntent);
                }
            });

            Button b = (Button)findViewById(R.id.email);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_EMAIL,new String[] {"craigbennettii@techreviewsandhelp.com"});
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Old Burying Ground Beaufort NC");
                    intent.putExtra(Intent.EXTRA_TEXT, "");
                    startActivity(Intent.createChooser(intent, "Send E-mail"));}});}






    @Override
    protected void onPause(){
        super.onPause();
    }}

