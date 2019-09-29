package com.abnamro.apps.referenceandroid

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import com.abnamro.apps.referenceandroid.helpers.BaseTest
import com.abnamro.apps.referenceandroid.helpers.OriginalMainPageTestDataProvider.SNACKBARTEXT
import com.abnamro.apps.referenceandroid.pageobject.OriginalMainPageObject
import org.hamcrest.CoreMatchers.allOf
import org.junit.Rule
import org.junit.Test

class FabTest: BaseTest() {

    private val mainPage = OriginalMainPageObject()

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
