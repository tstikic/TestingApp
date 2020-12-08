package com.example.tijana.myapplication

import android.support.test.espresso.Espresso.closeSoftKeyboard
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginTest {

    @Rule
    @JvmField
    val activityTestRule = ActivityTestRule(MainActivity::class.java, false, true)

    @Test
    fun exampleTest() {
        onView(withId(R.id.username)).perform(typeText("Admin"))
        closeSoftKeyboard()
        onView(withId(R.id.password)).perform(typeText("123456"))
        closeSoftKeyboard()
        onView(withId(R.id.login_button)).perform(click())
        onView(withId(R.id.imageViewLogo)).check(matches(isDisplayed()))
    }
}
