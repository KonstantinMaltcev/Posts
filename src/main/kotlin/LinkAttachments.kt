class LinkAttachments(link: Link, override val type: String = "Link") : Attachments {

    data class Link(
        val url: String,                     //URL ссылки.
        val title: String,                   //Заголовок ссылки.
        val caption: String?,                //Подпись ссылки (если имеется).
        val description: String,             //Описание ссылки.
    )
}