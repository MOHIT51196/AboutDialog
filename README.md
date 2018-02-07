AboutDialog
=====================

[![](https://jitpack.io/v/rey5137/material.svg)](https://jitpack.io/#rey5137/material)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This is an android library that holds 'About Me' template as a customizable alert dialog.

## Getting Started

This library will provide you the neat implementation of *'About Developer'* template for the Android apps. The template holds relevant sections to describe the detailed information about the developer/company that developed the app along with necessary social media links.

<img src="https://media.giphy.com/media/xUNda4rYrs0Gfnya3u/giphy.gif" width="200" height="360" />  <img src="/screenshots/ss1.png" width="200" height="360" />  <img src="/screenshots/ss2.png" width="200" height="360" />



## Prerequisites

*For a working implementation, have a look at the app module*

1. Add JitPack repository in your root build.gradle at the end of repositories:

    ~~~
    allprojects {
        repositories {
            ...
            maven { url "https://jitpack.io" }
        }
    }

    ~~~

Or add maven dependency to your java project

    ~~~
    <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
    ~~~


2. Add the dependency to your app build.gradle

    ~~~
    dependencies {
        compile 'com.github.MOHIT51196:AboutDialog:1.0'
    }
    ~~~

Or add maven dependency to your java project
    
    ~~~
    <dependency>
	    <groupId>com.github.MOHIT51196</groupId>
	    <artifactId>AboutDialog</artifactId>
	    <version>1.0</version>
	</dependency>
    ~~~


## Usage

* Firstly, initialize the Builder for building AboutDialog:
    ```
    AboutDialogBuilder builder = new AboutDialog.Builder(context);
    ```

*replace context with Active activity object or the Context object*

* Then, using AboutDialogBuilder class, customize the About view:
    
    * Set title text for the Dialog view :
        ```
        builder.setTitle("Your title")
        ```
    
    * Set title text for the Dialog view :
        ```
        builder.setTitle("Your title")
        ```

    * Set name of the Developer or company/organisation or a team :
        ```
        builder.setName("Name of developer/company")
        ```
        
    * Set small description about Developer/company :
        ```
        builder.setDescription("Your description")
        ```
        
    * Set detailed description (long note) about Developer/company :
        ```
        builder.setDetailedNote("Your detailed note")
        ```
     
    * Set Developer thoughts/say over project :
        ```
        builder.setThought("Your thoughts")
        ```

* Set the display picture of developer/company profile :

	* Drawable can be passed as argument directly
		```
		builder.setProfileImage(R.drawable.dp) 
		```
	
	* Uri can be passed as argument incase of web url
		```
		builder.setProfileImage(uri) 
		```
		
	*default icon will be displayed incase profile image is not set*
	
	
* Set the cover image for developer/company profile :

	* Drawable can be passed as argument directly
		```
		builder.setCoverImage(R.drawable.dp) 
		```
	
	* Uri can be passed as argument incase of web url
		```
		builder.setCoverImage(uri) 
		```
		
	*default icon will be displayed incase profile image is not set*
	
		
* Set social media links as Floating buttons with your profle url :

    * Set Facebook profile link :
        ```
        builder.setFacebookURL(profile_url);
        ```
        
    *replace profile_url with your facebook profile url(or link)*

    * Set Facebook profile link :
        ```
        builder.setFacebookURL(profile_url);
        ```
        
    *replace profile_url with your facebook profile url(or link)*

    * Set Instagram profile link :
        ```
        builder.setInstagramURL(profile_url);
        ```
        
    *replace profile_url with your instagram profile url(or link)*

    * Set LinkedIn profile link :
        ```
        builder.setLinkedinURL(profile_url);
        ```
        
    *replace profile_url with your linkedin profile url(or link)*

    * Set Twitter profile link :
        ```
        builder.setTwitterURL(profile_url);
        ```
        
    *replace profile_url with your twitter profile url(or link)*
    
    * Set Github profile link :
        ```
        builder.setGithubURL(profile_url);
        ```
        
    *replace profile_url with your github profile url(or link)*
    
    * Set Google+ profile link :
        ```
        builder.setGooglePlusURL(profile_url);
        ```
        
    *replace profile_url with your google+ profile url(or link)*
   
   
* Set Copyright year (or company name):
    ```
    builder.setCopyrightYear("2018");    
    ```

* Build AboutDialog throught AboutDialogBuilder:
    ```
    AboutDialog dialog = builder.build();    
    ```

* Show AboutDialog:
    ```
    dialog.show();   
    ```

#### Miscellaneous customization

* Hide Social media link section:
    ```
    builder.hideSocialLinksLayout 
    ```

* Hide Developer's thoughts:
    ```
    builder.hideThoughtLayout()   
    ```


### Example

	~~~
	AboutDialogBuilder builder = new AboutDialog.Builder(MainActivity.this)
	    // set title for the About view
	    .setTitle("About Me")

	    // set information about developer
	    .setName("Mohit Malhotra")
	    .setDescription("Freelance Developer and Designer")
	    
	    // set the display picture
	    .setProfileImage(R.drawable.dev_dp)

	    // hide the detailed description section
	    .hideThoughtLayout()

	    // set social links floating buttons in the foot section
	    .setLinkedinURL("https://www.linkedin.com/in/dev-mohit-malhotra/")
	    .setFacebookURL("https://www.facebook.com/mohitmalhotra.punjabi")
	    .setInstagramURL("https://www.instagram.com/mohitmalhotra.punjabi/")
	    .setMailAddress("mohitmalhotra5@yahoo.com")

	    // set copyright year in the footer section
	    .setCopyrightYear("2018");

	dialog = builder.build();

	// to show the About dialog
	dialog.show();

	~~~

## Deployment

Add dependencies to the existing/new project and follow the *usage* section for customization and application of this library.

## Authors

* **Mohit Malhotra** - *Initial work* - [Github](https://github.com/MOHIT51196)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
