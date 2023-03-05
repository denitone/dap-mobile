# Version Rule

1 [Major Version : Major changes & break the bussines rule & break the API ]
2 [Minor Version : Minor change & not break the bussines rule & add,edit,delete some API & Optimizing]
3 [Patches : Bugfixing ]

# version : 0.0.1 | release date : 04/03/2023
- first creating the project

# version : 0.0.2 | release date : 05/03/2023
setup gradle version "dap-mobile/build.gradle"
`
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
repositories {
google()
maven { url 'https://jitpack.io' }
mavenCentral()
    }
    dependencies {
        classpath "com.android.tools.build:gradle:7.0.3"
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}
task clean(type: Delete) {
delete rootProject.buildDir
}
`

# version : 0.0.3 | release date : 05/03/2023
setup sdk version "dap-mobile/app/build.gradle"
`
android { compileSdk 30
    defaultConfig {
        applicationId "com.deni.dap"
        minSdk 19
        targetSdk 30
        versionCode 2
        versionName "1.0.2"
        setProperty("archivesBaseName", "dap" + "-v"  +  versionName )
        //or so
        archivesBaseName = "dap-v$versionName"
        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
        multiDexEnabled true
    }
}
`

# version : 0.0.4 | release date : 05/03/2023
create login page "dap-mobile/app/src/main/java/com/deni/dap/login"
- create loginActivity with (MPV)
- create layout activity_login.xml
- create function login and if success navigate to home page 

# version : 0.0.5 | release date : 05/03/2023
create home page "dap-mobile/app/src/main/java/com/deni/dap/home"
- create HomeActivity with (MPV)
- create layout activity_home.xml
- create function backTologin and if success navigate to login page


# version : 0.0.6 | release date : 05/03/2023
implement dockerize android project
- create Dockerfile
- crete docker-compose.yml file
