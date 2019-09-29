package com.abnamro.apps.referenceandroid.pageobject

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId

class OriginalMainPageObject: MainPageObject() {

    fun getSnackBar() = onView(withId(android.support.design.R.id.snackbar_text))
}