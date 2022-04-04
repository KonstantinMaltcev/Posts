import java.awt.datatransfer.ClipboardOwner

class VideoAttachments (video: Video, override val type: String = "Video"):Attachments  {

    data class Video(
        val id: Int,                   // id записи
        val ownerId: Int,              // id владельца записи
        val title: String,              // Название видео
        val views: Int,                // Количество просмотров
        val player: String              // URL страницы плеера
    )
}