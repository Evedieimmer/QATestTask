data class Pet(
        var id: Long = 0,
        var category: Category = Category(),
        var name: String = "",
        var photoUrls: List<String> = listOf(),
        var tags: List<Tag> = listOf(),
        var status: String = ""
) {
    data class Category(
            var id: Int = 0,
            var name: String = ""
    )

    data class Tag(
            var id: Int = 0,
            var name: String = ""
    )
}

data class Message(
        var code: Int = 0,
        var type: String = "",
        var message: String = ""
)