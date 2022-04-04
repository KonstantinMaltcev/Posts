class AudioAttachments(audio: Audio, override val type: String = "Audio") : Attachments {

    data class Audio(
        val id: Int,                            // идентификатор аудиозаписи
        val ownerId: Int,                       // идентификатор владельца аудиозаписи
        val artist: String,                     // исполнитель
        val title: String,                      // название композиции
        val duration: Int,                      // длительность аудиозаписи в секундах
        val url: String,                        // ссылка на mp3
        val date: Int,                          // дата добавления аудиозаписи
    )
}