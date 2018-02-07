package org.mohitmalhotra.aboutdialog;

import android.net.Uri;

/**
 * Created by MOHIT MALHOTRA on 07-02-2018.
 */

public interface AboutDialogBuilder {


    AboutDialogBuilder setTitle(String title);
    AboutDialogBuilder setCopyrightYear(String year);

    AboutDialogBuilder setName(String name);
    AboutDialogBuilder setDescription(String desc);
    AboutDialogBuilder setDetailedNote(String note);
    AboutDialogBuilder setThought(String thought);


    AboutDialogBuilder setFacebookId(String id);
    AboutDialogBuilder setFacebookURL(String url);
    AboutDialogBuilder setGithubURL(String url);
    AboutDialogBuilder setGooglePlusURL(String url);
    AboutDialogBuilder setInstagramURL(String url);
    AboutDialogBuilder setLinkedinURL(String url);
    AboutDialogBuilder setMailAddress(String email);
    AboutDialogBuilder setTwitterURL(String url);

    AboutDialogBuilder setCoverImage(Uri uri);
    AboutDialogBuilder setCoverImage(int imgId);
    AboutDialogBuilder setProfileImage(Uri uri);
    AboutDialogBuilder setProfileImage(int imgId);

    AboutDialogBuilder hideThoughtLayout();
    AboutDialogBuilder hideSocialLinksLayout();

    AboutDialog build();

}
