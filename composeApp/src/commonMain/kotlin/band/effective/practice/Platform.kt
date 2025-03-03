package band.effective.practice

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform