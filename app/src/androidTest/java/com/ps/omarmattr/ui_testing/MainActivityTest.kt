package com.ps.omarmattr.ui_testing

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import kotlin.math.log

class MainActivityTest {
    @Rule
    @JvmField
    public var activityRule = ActivityScenarioRule(MainActivity::class.java)
    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun onCreate() {
    }

    @Test
    fun onClickItem() {

    }
    @Test
    fun recyclerViewTest() {
        Log.e("llll","cccccccc")
        Espresso.onView(ViewMatchers.withId(R.id.rcItems))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<RecyclerView.ViewHolder>(
                        0,
                        ViewActions.click()
                    )
            )
    }
}