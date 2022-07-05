package com.sreeni.testsamples

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ResourceComparisonUtilTest {

    private lateinit var resourceComparisonUtil: ResourceComparisonUtil
    private lateinit var context: Context


    @Before
    fun setUp() {
        context = ApplicationProvider.getApplicationContext()
        resourceComparisonUtil = ResourceComparisonUtil()
    }

    @Test
    fun `GivenStringIfEqualsReturnsTrue`() {
        val result = resourceComparisonUtil.compareStringWithResource(
            context,
            R.string.app_name,
            "Test Samples"
        )
        assertThat(result).isTrue()
    }

    fun `GivenStringIfNotEqualsReturnsFalse`() {
        val result =
            resourceComparisonUtil.compareStringWithResource(context, R.string.app_name, "Android")
        assertThat(result).isFalse()
    }

}