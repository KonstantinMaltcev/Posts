class PhotoAttachments (photo: Photo, override val type: String = "Photo"): Attachments {

    data class Photo(
        val id: Int,                   // идентификатор фотографии
        val ownerId: Int,              // идентификатор владельца фотографии
        val text: String,              // текст описания фотографии
        val date: Int                  // Дата добавления в формате Unixtime
    )
}