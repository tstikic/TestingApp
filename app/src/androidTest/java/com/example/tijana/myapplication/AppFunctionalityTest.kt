package com.example.tijana.myapplication

import android.support.test.rule.ActivityTestRule
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class AppFunctionalityTest {
    val CORRECT_LOGIN_TEXT = "LOGIN"

    @Rule
    @JvmField
    val rule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testingLoginButton() {
        onView(withId(R.id.login_button)).check(matches(isDisplayed()))
        onView(withId(R.id.login_button)).check(matches(withText(CORRECT_LOGIN_TEXT)))
        onView(withId(R.id.login_button)).check(matches(isClickable()))
    }
}
