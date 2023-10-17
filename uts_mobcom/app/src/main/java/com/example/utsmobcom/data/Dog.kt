/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.utsmobcom.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.utsmobcom.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val namaMatkul: Int,
)

val dogs = listOf(
    Dog(R.drawable.basdat, R.string.matkul1),
    Dog(R.drawable.ddp, R.string.matkul2),
    Dog(R.drawable.dpbo, R.string.matkul3),
    Dog(R.drawable.hci, R.string.matkul4),
    Dog(R.drawable.kompgraf, R.string.matkul5),
    Dog(R.drawable.ml, R.string.matkul6),
    Dog(R.drawable.os, R.string.matkul7),
    Dog(R.drawable.pkb, R.string.matkul8),
    Dog(R.drawable.ppw, R.string.matkul9),
    Dog(R.drawable.sda, R.string.matkul10)
)
