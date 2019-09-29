package com.abnamro.apps.referenceandroid.helpers

import androidx.test.espresso.intent.rule.IntentsTestRule
import com.abnamro.apps.referenceandroid.MainActivity
import org.junit.Rule

open class BaseTest {

    @Rule
    @JvmField
    val activityTestRule: IntentsTestRule<MainActivity> =
        IntentsTestRule(MainActivity::class.java)
}
