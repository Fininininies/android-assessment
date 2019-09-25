package com.abnamro.apps.referenceandroid

import android.view.View
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule

import org.junit.Rule
import org.junit.Test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeTextIntoFocusedView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.core.AllOf.allOf
import androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu

class AssessmentTest {

    @Rule @JvmField
    var activityTestRule: ActivityTestRule<MainActivity> =
        ActivityTestRule(MainActivity::class.java)

    @Test
    fun checkSettingsMenu() {
        openActionBarOverflowOrOptionsMenu(
            InstrumentationRegistry.getInstrumentation()
                .targetContext
        )
        onView(withId(R.id.title)).check(matches(withText("Settings")))
    }

    @Test
    fun clickEmailButton() {
        onView(withId(R.id.fab)).check(matches(isDisplayed()))
        onView(withId(R.id.fab)).perform(click())
        onView(
            allOf<View>(
                withId(android.support.design.R.id.snackbar_text),
                withText("Replace with your own action")
            )
        ).check(matches(isDisplayed()))
    }
}
