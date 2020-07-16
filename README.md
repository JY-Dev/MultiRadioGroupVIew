# MultiRadioGroupVIew
## absorption another RadioGroup. It's CustomView MultiRadioGroup In Android Studio

### Library Version

Version v1.0.1

### minSdkVersion

minSdkVersion 19

### Edit Gradle

Edit `YourProject/build.gradle` like below.

#### JitPack
```gradle
allprojects {
    repositories {
        google()
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```

Edit `app/build.gradle` like below.

```gradle
   implementation 'com.github.JY-Dev:MultiRadioGroupVIew:v1.0.0'
```

## How To Use

### In Xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

   <com.jaeyoung.multiradiogroupview.MultiRadioGroupView
       android:id="@+id/multiRadioGroup"
       android:layout_width="match_parent"
       android:layout_height="wrap_content"
       android:layout_margin="20dp"
       android:orientation="vertical">

       <TextView
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:text="RadioLayer1"/>
       <RadioGroup
           android:layout_width="match_parent"
           android:layout_height="wrap_content">
           <RadioButton
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:text="RD01"/>

           <RadioButton
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:text="RD02"/>

           <RadioButton
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:text="RD03"/>
       </RadioGroup>

       <TextView
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:text="RadioLayer2"/>
       <RadioGroup
           android:layout_width="match_parent"
           android:layout_height="wrap_content">
           <RadioButton
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:text="RD04"/>

           <RadioButton
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:text="RD05"/>

           <RadioButton
               android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:text="RD06"/>
       </RadioGroup>


   </com.jaeyoung.multiradiogroupview.MultiRadioGroupView>
</LinearLayout>
```

## In Code (Function)
#### multiRadioGroup.getCheckId() - Return your checked Radio Button Id
#### multiRadioGroup.getCheckedName() - Return your checked Radio Button Name
### If you Dynamically Add View
#### You Call multiRadioGroup.refreshView() - Refresh MutiRadioGroupView



## In application
![](https://github.com/JY-Dev/MultiRadioGroupView/blob/master/sampleImg1.jpg)
![](https://github.com/JY-Dev/MultiRadioGroupView/blob/master/sampleImg2.jpg)
