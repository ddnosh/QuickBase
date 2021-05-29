/**
 * 版本信息
 */
interface Versions {
    def minSdkVersion = 21
    def targetSdkVersion = 29
    def compileSdkVersion = 29
    def buildToolsVersion = "29.0.2"
}

/**
 * 依赖库路径
 */
interface Deps {
    //gradlePlugin
    def gradlePlugin = "com.android.tools.build:gradle:4.2.0"
    //kotlinGradlePlugin
    def kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.0"
    //junit
    def junit = 'junit:junit:4.13.1'
    //test_runner
    def test_runner = 'com.android.support.test:runner:1.0.2'
    //espresso
    def espresso = 'com.android.support.test.espresso:espresso-core:3.0.2'
    //mockk
    def mockk = "io.mockk:mockk:1.11.0"
    //appcompat
    def appcompat = 'androidx.appcompat:appcompat:1.1.0'
    //activity_ktx
    def activity_ktx = 'androidx.activity:activity-ktx:1.2.2'
    //fragment_ktx
    def fragment_ktx = 'androidx.fragment:fragment-ktx:1.3.2'
    //constraintlayout
    def constraintlayout = 'com.android.support.constraint:constraint-layout:2.0.4'
    //viewpager2
    def viewpager2 = "androidx.viewpager2:viewpager2:1.0.0"
    //multidex
    def multidex = 'androidx.multidex:multidex:2.0.0'
    //material
    def material = 'com.google.android.material:material:1.3.0'
    //rxjava2
    def rxjava =  "io.reactivex.rxjava2:rxjava:2.2.21"
    //rxandroid
    def rxandroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
    //retrofit2
    def retrofit2 = 'com.squareup.retrofit2:retrofit:2.9.0'
    //retrofit_adapter_rxjava2
    def retrofit_adapter_rxjava2 = 'com.squareup.retrofit2:adapter-rxjava2:2.9.0'
    //retrofit_convert_scalars
    def retrofit_convert_scalars = 'com.squareup.retrofit2:converter-scalars:2.9.0'
    //retrofit_converter_gson
    def retrofit_converter_gson = 'com.squareup.retrofit2:converter-gson:2.9.0'
    //retrofit_converter_simplexml
    def retrofit_converter_simplexml = 'com.squareup.retrofit2:converter-simplexml:2.5.0'
    //okhttp3
    def okhttp = 'com.squareup.okhttp3:okhttp:5.0.0-alpha.2'
    //logging_interceptor
    def logging_interceptor = 'com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2'
    //core_ktx
    def core_ktx = "androidx.core:core-ktx:1.3.2"
    //kotlin_stdlib_jdk8
    def kotlin_stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.0"
    //coroutine
    def coroutine = 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2'
    //coroutine_android
    def coroutine_android = 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.2'
    //livedata
    def livedata = 'androidx.lifecycle:lifecycle-extensions:2.2.0'
    //viewmodels
    def viewmodels = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
    //navigation_fragment_ktx
    def navigation_fragment_ktx = "androidx.navigation:navigation-fragment-ktx:2.3.5"
    //navigation_ui_ktx
    def navigation_ui_ktx = "androidx.navigation:navigation-ui-ktx:2.3.5"
    //room
    def room = "androidx.room:room-runtime:2.3.0"
    //room_compiler
    def room_compiler = "androidx.room:room-compiler:2.3.0"
    //room_ktx
    def room_ktx = "androidx.room:room-ktx:2.3.0"
    //room_rxjava2
    def room_rxjava2 = "androidx.room:room-rxjava2:2.3.0"
    //paging
    def paging = "androidx.paging:paging-runtime-ktx:2.1.2"
    //autodispose
    def autodispose = 'com.uber.autodispose:autodispose:1.3.0'
    //autodispose_android
    def autodispose_android = 'com.uber.autodispose:autodispose-android:1.3.0'
    //autodispose_android_archcomponents
    def autodispose_android_archcomponents = 'com.uber.autodispose:autodispose-android-archcomponents:1.3.0'
    //mmkv
    def mmkv = 'com.tencent:mmkv-static:1.2.8'
    //dagger2
    def dagger2 = 'com.google.dagger:dagger:2.31.2'
    //dagger2_compiler
    def dagger2_compiler = 'com.google.dagger:dagger-compiler:2.31.2'
    //glide
    def glide = 'com.github.bumptech.glide:glide:4.12.0'
    //glide_transformations
    def glide_transformations = 'jp.wasabeef:glide-transformations:4.3.0@aar'
    //gson
    def gson = 'com.google.code.gson:gson:2.8.6'
    //rxlifecycle
    def rxlifecycle = 'com.trello.rxlifecycle3:rxlifecycle:3.0.0'
    //rxlifecycle_android
    def rxlifecycle_android = 'com.trello.rxlifecycle3:rxlifecycle-android:3.0.0'
    //rxlifecycle_android_lifecycle
    def rxlifecycle_android_lifecycle = 'com.trello.rxlifecycle3:rxlifecycle-android-lifecycle:3.0.0'
    //rxlifecycle_kotlin
    def rxlifecycle_kotlin = 'com.trello.rxlifecycle3:rxlifecycle-kotlin:3.0.0'
}
