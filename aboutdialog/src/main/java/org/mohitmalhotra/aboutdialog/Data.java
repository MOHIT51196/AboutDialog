package org.mohitmalhotra.aboutdialog;

import android.net.Uri;

/**
 * Created by MOHIT MALHOTRA on 06-02-2018.
 */

public class Data {

//   socialmedia links

    private String facebookId;
    private String linkFacebook;
    private String linkGithub;
    private String linkGooglePlus;
    private String linkInstagram;
    private String linkLinkedin;
    private String mailAddress;
    private String linkTwitter;

//    details of developer/company

    private String name;
    private String description;
    private String detailedNote;
    private String thought;

//    miscellanous
    private String title;
    private String copyrightYear;

//    images of dialog
    private Uri coverImageURI;
    private Uri profileImageURI;

    public Data(){}

    public Data(String title) {
        this.title = title;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getLinkFacebook() {
        return linkFacebook;
    }

    public void setLinkFacebook(String linkFacebook) {
        this.linkFacebook = linkFacebook;
    }

    public String getLinkGithub() {
        return linkGithub;
    }

    public void setLinkGithub(String linkGithub) {
        this.linkGithub = linkGithub;
    }

    public String getLinkGooglePlus() {
        return linkGooglePlus;
    }

    public void setLinkGooglePlus(String linkGooglePlus) {
        this.linkGooglePlus = linkGooglePlus;
    }

    public String getLinkInstagram() {
        return linkInstagram;
    }

    public void setLinkInstagram(String linkInstagram) {
        this.linkInstagram = linkInstagram;
    }

    public String getLinkLinkedin() {
        return linkLinkedin;
    }

    public void setLinkLinkedin(String linkLinkedin) {
        this.linkLinkedin = linkLinkedin;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getLinkTwitter() {
        return linkTwitter;
    }

    public void setLinkTwitter(String linkTwitter) {
        this.linkTwitter = linkTwitter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetailedNote() {
        return detailedNote;
    }

    public void setDetailedNote(String detailedNote) {
        this.detailedNote = detailedNote;
    }

    public String getThought() {
        return thought;
    }

    public void setThought(String thought) {
        this.thought = thought;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }

    public void setCopyrightYear(String copyrightYear) {
        this.copyrightYear = copyrightYear;
    }

    public Uri getCoverImageURI() {
        return coverImageURI;
    }

    public void setCoverImageURI(Uri coverImageURI) {
        this.coverImageURI = coverImageURI;
    }

    public Uri getProfileImageURI() {
        return profileImageURI;
    }

    public void setProfileImageURI(Uri profileImageURI) {
        this.profileImageURI = profileImageURI;
    }
}
