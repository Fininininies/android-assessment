package com.abnamro.apps.referenceandroid

import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class AssessmentTest {

    private val mainPage = MainPageObject()

    @Rule @JvmField
    val activityTestRule: ActivityTestRule<MainActivity> =
        ActivityTestRule(MainActivity::class.java)

    @Test
    fun checkSettingsMenu() {
        mainPage.openOverflowMenu()
        mainPage.checkSettings()
    }

    @Test
    fun clickEmailButton() {
        mainPage.clickEmailButton()
    }
}
