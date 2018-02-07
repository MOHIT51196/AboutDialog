package org.mohitmalhotra.aboutdialog;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class AboutDialog {

    private AlertDialog dialog;

    public void show() {

        dialog.show();
    }

    public AlertDialog getDialog() {
        return dialog;
    }

    public void setDialog(AlertDialog dialog) {
        this.dialog = dialog;
    }

    public static class Builder implements AboutDialogBuilder {

        private Context context;
        private View dialogView;
        private AlertDialog.Builder builder;

        private Data data;

        FloatingActionButton btnContactLinkedin, btnMail;
        FloatingActionButton btnGithub, btnLinkedin, btnGoogleplus, btnFacebook, btnInstagram, btnTwitter;

        TextView tvName, tvDesc, tvDetailedNote, tvThought, tvCopyrights;

        ImageView ivCoverImage, ivProfileImage;

        {
            this.data = new Data();
        }

        public Builder(final Context context){
            this.context = context;

            inflateView();

            ivCoverImage = (ImageView) dialogView.findViewById(R.id.coverImage);
            ivProfileImage = (CircleImageView) dialogView.findViewById(R.id.profileImage);

            btnContactLinkedin = (FloatingActionButton) dialogView.findViewById(R.id.btnContactLinkedin);
            btnMail = (FloatingActionButton) dialogView.findViewById(R.id.btnMail);

            btnGithub = (FloatingActionButton) dialogView.findViewById(R.id.btnGithub);
            btnLinkedin = (FloatingActionButton) dialogView.findViewById(R.id.btnLinkedin);
            btnGoogleplus = (FloatingActionButton) dialogView.findViewById(R.id.btnGooglePlus);
            btnFacebook = (FloatingActionButton) dialogView.findViewById(R.id.btnFacebook);
            btnInstagram = (FloatingActionButton) dialogView.findViewById(R.id.btnInstagram);
            btnTwitter = (FloatingActionButton) dialogView.findViewById(R.id.btnTwitter);

            tvName = (TextView) dialogView.findViewById(R.id.name);
            tvDesc = (TextView) dialogView.findViewById(R.id.desc);
            tvDetailedNote = (TextView) dialogView.findViewById(R.id.detailedNote);
            tvThought = (TextView) dialogView.findViewById(R.id.thought);
            tvCopyrights = (TextView) dialogView.findViewById(R.id.copyrights);

            btnContactLinkedin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    btnLinkedin.callOnClick();
                }
            });

            btnMail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_SENDTO).setData(Uri.fromParts("mail to", data.getMailAddress(), null));
                    context.startActivity(Intent.createChooser(intent, "Go with"));
                }
            });

            btnGithub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fireIntent(Uri.parse(data.getLinkGithub()));
                }
            });

            btnLinkedin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fireIntent(Uri.parse(data.getLinkLinkedin()));
                }
            });

            btnGoogleplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fireIntent(Uri.parse(data.getLinkGooglePlus()));
                }
            });

            btnTwitter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fireIntent(Uri.parse(data.getLinkTwitter()));
                }
            });

            btnInstagram.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fireIntent(Uri.parse(data.getLinkInstagram()));
                }
            });

            btnFacebook.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String fbId = data.getFacebookId();
                    String fbUrl = data.getLinkFacebook();

                    Uri uri = null;
                    if(fbUrl != null) {
                        if (fbId != null) {
                            try {
                                context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
                                uri = Uri.parse("fb://profile/" + fbId);
                            } catch (Exception e) {
                                uri = Uri.parse(fbUrl);
                            } finally {
                                fireIntent(uri);
                            }
                        } else{
                            uri = Uri.parse(fbUrl);
                            fireIntent(uri);
                        }
                    }
                }
            });

        }

        private void inflateView() {
            builder = new AlertDialog.Builder(context);
            LayoutInflater inflater = ((AppCompatActivity) context).getLayoutInflater();

            dialogView = inflater.inflate(R.layout.layout_about_dialog, null);
            builder.setView(dialogView);
        }

        private void fireIntent(Uri uri){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW).setData(uri);
            context.startActivity(Intent.createChooser(intent, "Go with"));
        }

        @Override
        public AboutDialogBuilder setTitle(String title) {
            this.data.setTitle(title);
            return this;
        }

        @Override
        public AboutDialogBuilder setCopyrightYear(String year) {
            this.data.setCopyrightYear(year);
            return this;
        }

        @Override
        public AboutDialogBuilder setName(String name) {
            this.data.setName(name);
            return this;
        }

        @Override
        public AboutDialogBuilder setDescription(String desc) {
            this.data.setDescription(desc);
            return this;
        }

        @Override
        public AboutDialogBuilder setDetailedNote(String note) {
            this.data.setDetailedNote(note);
            return this;
        }

        @Override
        public AboutDialogBuilder setThought(String thought) {
            this.data.setThought(thought);
            return this;
        }

        @Override
        public AboutDialogBuilder setFacebookId(String id) {
            this.data.setFacebookId(id);
            return this;
        }

        @Override
        public AboutDialogBuilder setFacebookURL(String url) {
            this.data.setLinkFacebook(url);
            return this;
        }

        @Override
        public AboutDialogBuilder setGithubURL(String url) {
            this.data.setLinkGithub(url);
            return this;
        }

        @Override
        public AboutDialogBuilder setGooglePlusURL(String url) {
            this.data.setLinkGooglePlus(url);
            return this;
        }

        @Override
        public AboutDialogBuilder setInstagramURL(String url) {
            this.data.setLinkInstagram(url);
            return this;
        }

        @Override
        public AboutDialogBuilder setLinkedinURL(String url) {
            this.data.setLinkLinkedin(url);
            return this;
        }

        @Override
        public AboutDialogBuilder setMailAddress(String email) {
            this.data.setMailAddress(email);
            return this;
        }

        @Override
        public AboutDialogBuilder setTwitterURL(String url) {
            this.data.setLinkTwitter(url);
            return this;
        }

        @Override
        public AboutDialogBuilder setCoverImage(Uri uri) {
            this.data.setCoverImageURI(uri);
            return this;
        }

        @Override
        public AboutDialogBuilder setCoverImage(int imgId) {
            Uri imgUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + context.getPackageName() + "/" + imgId);
            this.data.setCoverImageURI(imgUri);
            return this;
        }

        @Override
        public AboutDialogBuilder setProfileImage(Uri uri) {
            this.data.setCoverImageURI(uri);
            return this;
        }

        @Override
        public AboutDialogBuilder setProfileImage(int imgId) {
            Uri imgUri = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE + "://" + context.getPackageName() + "/" + imgId);
            this.data.setProfileImageURI(imgUri);
            return this;
        }

        @Override
        public AboutDialogBuilder hideThoughtLayout(){
            dialogView.findViewById(R.id.layoutThought).setVisibility(View.GONE);
            return this;
        }

        @Override
        public AboutDialogBuilder hideSocialLinksLayout(){
            dialogView.findViewById(R.id.layoutConnectWith).setVisibility(View.GONE);
            return this;
        }


        @Override
        public AboutDialog build() {
            AboutDialog aboutDialog = new AboutDialog();

            // default im_cover_default image
            Glide.with(context)
                    .load(R.drawable.im_cover_default)
                    .centerCrop()
                    .into(ivCoverImage);

            // validateView
            validateViewWithData();
            aboutDialog.setDialog(builder.create());
            aboutDialog.getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            return aboutDialog;
        }

        // view validation methods
        private void validateViewWithData() {

            // validate Images on the dialog
            validateImageView(ivCoverImage, this.data.getCoverImageURI());
            validateImageView(ivProfileImage, this.data.getProfileImageURI());

            // validating the content of the dialog
            validateTextView(tvName, this.data.getName());
            validateTextView(tvDesc, this.data.getDescription());
            validateTextView(tvDetailedNote, this.data.getDetailedNote());
            validateTextView(tvThought, this.data.getThought());

            // validating the visibilty of buttons
            validateButton(btnContactLinkedin, this.data.getLinkLinkedin());
            validateButton(btnMail, this.data.getMailAddress());
            validateButton(btnFacebook, this.data.getLinkFacebook());
            validateButton(btnGithub, this.data.getLinkGithub());
            validateButton(btnGoogleplus, this.data.getLinkGooglePlus());
            validateButton(btnInstagram, this.data.getLinkInstagram());
            validateButton(btnLinkedin, this.data.getLinkLinkedin());
            validateButton(btnTwitter, this.data.getLinkTwitter());

            // validate footer section of dialog
            validateFooter();
        }

        private void validateFooter() {
            String year = this.data.getCopyrightYear() != null ? this.data.getCopyrightYear() : "XXXX";
            tvCopyrights.setText(context.getString(R.string.copyrights) + " " + year);
        }

        private void validateImageView(ImageView iv, Uri uri) {
            if(uri != null){
                Glide.with(context)
                        .load(uri)
                        .centerCrop()
                        .into(iv);
            }
        }

        private void validateButton(FloatingActionButton btn, String url){
            if(url != null){
                btn.setVisibility(View.VISIBLE);
            } else{
                btn.setVisibility(View.GONE);
            }
        }

        private void validateTextView(TextView tv, String text){
            if(text != null){
                tv.setText(text);
                tv.setVisibility(View.VISIBLE);
            } else{
                tv.setVisibility(View.GONE);
            }
        }
    }
}
