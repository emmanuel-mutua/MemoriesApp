package com.emmutua.applicationone.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.emmutua.applicationone.R

// Card
/**
 * Day, month, image-opt, desc
 */

object DataSource{
    val list = listOf(
        Memory(
            day = R.string.day1,
            month = R.string.august,
            image = null,
            desc = R.string.desc1
        ),
        Memory(
            day = R.string.day1,
            month = R.string.august,
            image = R.drawable.image,
            desc = R.string.desc1
        ),
        Memory(
            day = R.string.day1,
            month = R.string.august,
            image = null,
            desc = R.string.desc1
        ),
        Memory(
            day = R.string.day1,
            month = R.string.august,
            image = null,
            desc = R.string.desc1
        ),
        Memory(
            day = R.string.day1,
            month = R.string.august,
            image = null,
            desc = R.string.desc1
        ),
        Memory(
            day = R.string.day1,
            month = R.string.august,
            image = R.drawable.image,
            desc = R.string.desc1
        ),
        Memory(
            day = R.string.day1,
            month = R.string.august,
            image = null,
            desc = R.string.desc1
        ),
        Memory(
            day = R.string.day1,
            month = R.string.august,
            image = null,
            desc = R.string.desc1
        )

    )
}

data class Memory(
    @StringRes val day : Int,
    @StringRes val month: Int,
    @DrawableRes val image : Int?,
    @StringRes val desc : Int
)