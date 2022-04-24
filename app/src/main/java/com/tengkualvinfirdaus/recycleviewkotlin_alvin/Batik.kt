package com.tengkualvinfirdaus.recycleviewkotlin_alvin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Batik(
    val imgBatik: Int,
    val nameBatik: String,
    val descBatik: String
) : Parcelable
