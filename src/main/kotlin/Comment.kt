data class Comment(

    val id: Int = 0,                               // Идентификатор комментария
    val postId: Int = 0,                           // Идентификатор поста
    val fromId: Int = 0,                           // Идентификатор автора комментария.
    val date: Int = 0,                             // Дата создания комментария в формате Unixtime.
    val text: String = "",                         // текст комментария
    val replyToUser: Int = 0,                      // идентификатор пользователя, в ответ на который должен быть добавлен новый комментарий.
    val replyToComment: Int = 0,                   // идентификатор комментария, в ответ на который должен быть добавлен новый комментарий.
    val attachments: Array<Attachments>,                  // Вложения
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Comment

        if (id != other.id) return false
        if (postId != other.postId) return false
        if (fromId != other.fromId) return false
        if (date != other.date) return false
        if (text != other.text) return false
        if (replyToUser != other.replyToUser) return false
        if (replyToComment != other.replyToComment) return false
        if (!attachments.contentEquals(other.attachments)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + postId
        result = 31 * result + fromId
        result = 31 * result + date
        result = 31 * result + text.hashCode()
        result = 31 * result + replyToUser
        result = 31 * result + replyToComment
        result = 31 * result + attachments.contentHashCode()
        return result
    }
}