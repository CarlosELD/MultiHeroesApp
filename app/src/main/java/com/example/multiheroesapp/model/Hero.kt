package com.example.multiheroesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
data class Hero(
    @StringRes val nombreCal: Int,
    @StringRes val descripcionHe: Int,
    @DrawableRes val picturesHe: Int
)