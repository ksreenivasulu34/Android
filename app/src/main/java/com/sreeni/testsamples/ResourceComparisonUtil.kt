package com.sreeni.testsamples

import android.content.Context

class ResourceComparisonUtil {

    fun compareStringWithResource(context: Context, resId: Int, string: String): Boolean {
        return context.getString(resId) == string
    }
}