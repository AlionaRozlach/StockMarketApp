package com.example.stockmarketapp.domain.model

import androidx.room.PrimaryKey

class CompanyListing (
    val name: String,
    val symbol:String,
    val exchange:String,
)