package yaneq6.databinding

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import yaneq6.databinding.feature.FeatureActivity

/**
 * This test works as expected
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