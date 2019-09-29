package com.abnamro.apps.referenceandroid

import android.content.Intent
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.*
import androidx.test.espresso.intent.rule.IntentsTestRule
import com.abnamro.apps.referenceandroid.pageobject.MainPageObject
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Rule
import org.junit.Test

class FabTest {

    private val mainPage = MainPageObject()

    @Rule
    @JvmField
    val activityTestRule: IntentsTestRule<MainActivity> =
        IntentsTestRule(MainActivity::class.java)

    @Test
    fun checkEmailButton() {
        mainPage.clickEmailButton()
        intended(allOf(
            hasAction(equalTo(Intent.ACTION_SENDTO)),
            hasExtra(Intent.EXTRA_SUBJECT, "ABN AMRO Reference Android Email"),
            hasExtra(Intent.EXTRA_TEXT, "Hello ABN AMRO")))
    }
}
