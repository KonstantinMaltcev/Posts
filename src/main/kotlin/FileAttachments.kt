class FileAttachments(file: File, override val type: String = "File") : Attachments {

    data class File(
        val id: Int,                       // id файла
        val ownerId: Int,                  // id владельца, загрузившего файл
        val title: String,                  // название файла
        val size: Int,                     // размер файла в байтах
        val ext: String,                    // расширение файла
        val url: String,                    // адрес файла, по которому его можно загрузить
        val date: Int,                     // дата добавления файла в формате Unixtime
    )
}