package org.mohitmalhotra.customdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.mohitmalhotra.aboutdialog.AboutDialog;
import org.mohitmalhotra.aboutdialog.AboutDialogBuilder;

public class MainActivity extends AppCompatActivity {


    private AboutDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnAboutUs = (Button) findViewById(R.id.btnAboutMe);

        initDialog();

        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });
    }

    private void initDialog() {
        AboutDialogBuilder builder = new AboutDialog.Builder(MainActivity.this)
                .setTitle("About Me")
                .setName("Mohit Malhotra")
                .setDescription("Freelance Developer and Designer")

                .hideThoughtLayout()

                .setLinkedinURL(getString(R.string.dev_linkedin))
                .setFacebookURL(getString(R.string.dev_fb))
                .setInstagramURL("https://www.instagram.com/mohitmalhotra.punjabi/")
                .setTwitterURL("https://www.twitter.com/")
                .setMailAddress(getString(R.string.dev_email))

                .setCopyrightYear("2018");

         dialog = builder.build();
    }
}
