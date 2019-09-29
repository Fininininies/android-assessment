package com.abnamro.apps.referenceandroid.pageobject

import android.widget.TextView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withParent
import androidx.test.platform.app.InstrumentationRegistry
import com.abnamro.apps.referenceandroid.R
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.instanceOf

open class MainPageObject {

    private val emailButton = onView(withId(R.id.fab))
    fun getToolBarText() = onView(allOf(instanceOf(TextView::class.java),withParent(withId(R.id.toolbar))))
    fun getHelloText() = onView(withId(R.id.helloText))
    fun getSettingsView() = onView(withId(R.id.title))

    fun openOverflowMenu():MainPageObject {
        openActionBarOverflowOrOptionsMenu(
            InstrumentationRegistry.getInstrumentation().targetContext
        )
        return this
    }

    fun clickEmailButton() {
        emailButton.perform(ViewActions.click())
    }
}
