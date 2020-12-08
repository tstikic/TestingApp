package com.example.tijana.myapplication

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SecondScreenTest {

    @Rule
    @JvmField
    val activityTestRule = ActivityTestRule(SecondActivity::class.java, false, true)

    @Test
    fun checkTittle(){

        onView(withId(R.id.tittle)).check(matches(withText(R.string.)))

    }

}
