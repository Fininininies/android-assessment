package com.abnamro.apps.referenceandroid

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import com.abnamro.apps.referenceandroid.helpers.OriginalMainPageTestDataProvider.SNACKBARTEXT
import com.abnamro.apps.referenceandroid.pageobject.OriginalMainPageObject
import org.hamcrest.CoreMatchers.allOf
import org.junit.Rule
import org.junit.Test

class FabTest {

    private val mainPage = OriginalMainPageObject()

    @Rule
    @JvmField
    val activityTestRule: ActivityTestRule<MainActivity> =
        ActivityTestRule(MainActivity::class.java)

    @Test
    fun checkEmailButton() {
        mainPage.clickEmailButton()
        mainPage.getSnackBar().check(
            matches(
                allOf(
                    isDisplayed(),
                    withText(SNACKBARTEXT)
                )
            )
        )
    }
}
