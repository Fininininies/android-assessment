package com.abnamro.apps.referenceandroid

import android.view.View
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.platform.app.InstrumentationRegistry
import org.hamcrest.core.AllOf

class MainPageObject {

    fun openOverflowMenu() {
        Espresso.openActionBarOverflowOrOptionsMenu(
            InstrumentationRegistry.getInstrumentation()
                .targetContext
        )
    }

    fun checkSettings() {
        Espresso.onView(ViewMatchers.withId(R.id.title))
            .check(ViewAssertions.matches(ViewMatchers.withText("Settings")))
    }

    fun clickEmailButton() {
        Espresso.onView(ViewMatchers.withId(R.id.fab))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.fab)).perform(ViewActions.click())
        Espresso.onView(
            AllOf.allOf<View>(
                ViewMatchers.withId(android.support.design.R.id.snackbar_text),
                ViewMatchers.withText("Replace with your own action")
            )
        ).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}
