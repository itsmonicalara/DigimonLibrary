package edu.itesm.digimon

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Digimon(val picture:Int,
                   val name:String,
                   val stage:String,
                   val description: String) : Parcelable
