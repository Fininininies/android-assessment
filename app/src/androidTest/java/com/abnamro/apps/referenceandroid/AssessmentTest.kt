package com.abnamro.apps.referenceandroid

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.abnamro.apps.referenceandroid.helpers.BaseTest
import com.abnamro.apps.referenceandroid.helpers.MainPageTestDataProvider.HELLOTEXT
import com.abnamro.apps.referenceandroid.helpers.MainPageTestDataProvider.SETTINGSTEXT
import com.abnamro.apps.referenceandroid.helpers.MainPageTestDataProvider.TITLE
import com.abnamro.apps.referenceandroid.pageobject.MainPageObject
import org.junit.Rule
import org.junit.Test

class AssessmentTest: BaseTest() {

    private val mainPage = MainPageObject()

    @Test
    fun checkAppTitle() {
        mainPage.getToolBarText().check(matches(withText(TITLE)))
    }

    @Test
    fun checkCentreText() {
        mainPage.getHelloText().check(matches(withText(HELLOTEXT)))
    }

    @Test
    fun checkSettingsMenu() {
        mainPage.openOverflowMenu()
            .getSettingsView().check(matches(withText(SETTINGSTEXT)))
    }
}
