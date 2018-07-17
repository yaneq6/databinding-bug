package yaneq6.databinding.feature

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

/**
 * Test in feature module fails, because of:
 *
java.lang.NoClassDefFoundError: Failed resolution of: Landroid/databinding/DataBinderMapperImpl;
at android.databinding.DataBindingUtil.<clinit>(DataBindingUtil.java:32)
at android.databinding.DataBindingUtil.setContentView(DataBindingUtil.java:284)
at yaneq6.databinding.feature.FeatureActivity$binding$2.invoke(FeatureActivity.kt:10)
at yaneq6.databinding.feature.FeatureActivity$binding$2.invoke(FeatureActivity.kt:8)
at kotlin.SynchronizedLazyImpl.getValue(LazyJVM.kt:74)
at yaneq6.databinding.feature.FeatureActivity.getBinding(Unknown Source:7)
at yaneq6.databinding.feature.FeatureActivity.onCreate(FeatureActivity.kt:14)
at android.app.Activity.performCreate(Activity.java:7009)
at android.app.Activity.performCreate(Activity.java:7000)
at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1214)
at android.support.test.runner.MonitoringInstrumentation.callActivityOnCreate(MonitoringInstrumentation.java:667)
at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2731)
at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2856)
at android.app.ActivityThread.-wrap11(Unknown Source:0)
at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1589)
at android.os.Handler.dispatchMessage(Handler.java:106)
at android.os.Looper.loop(Looper.java:164)
at android.app.ActivityThread.main(ActivityThread.java:6494)
at java.lang.reflect.Method.invoke(Native Method)
at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:807)
Caused by: java.lang.ClassNotFoundException: Didn't find class "android.databinding.DataBinderMapperImpl" on path: DexPathList[[zip file "/system/framework/android.test.mock.jar", zip file "/system/framework/android.test.runner.jar", zip file "/data/app/yaneq6.databinding.feature.test-2EX0JhNf4aQuLKF1G6h7oA==/base.apk"],nativeLibraryDirectories=[/data/app/yaneq6.databinding.feature.test-2EX0JhNf4aQuLKF1G6h7oA==/lib/x86, /system/lib, /vendor/lib]]
at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:125)
at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
... 21 more
 *
 */
class FeatureActivityTest {

    @JvmField
    @Rule
    val rule = ActivityTestRule(FeatureActivity::class.java)

    @Test
    fun onCreate() {
        onView(withId(R.id.textView)).check(matches(withText("text")))
    }
}