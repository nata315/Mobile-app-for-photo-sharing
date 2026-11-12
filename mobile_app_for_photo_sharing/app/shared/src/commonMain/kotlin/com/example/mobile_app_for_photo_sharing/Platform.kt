package com.example.mobile_app_for_photo_sharing

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform