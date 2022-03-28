data class Post(
    internal val id: Long,                  // Идентификатор записи.
    val ownerId: Long,                      // Идентификатор владельца стены, на которой размещена запись.
    val fromId: Long,                       // Идентификатор автора записи (от чьего имени опубликована запись).
    val createdBy: Long,                    // Идентификатор администратора, который опубликовал запись.
    val date: Int,                          // Время публикации записи в формате unixtime.
    val text: String,                       // Текст записи.
    val replyOwnerId: Long,                 // Идентификатор владельца записи, в ответ на которую была оставлена текущая.
    val replyPostId: Long,                  // Идентификатор записи, в ответ на которую была оставлена текущая.
    val friendsOnly: Boolean,               // опция «Только для друзей».
    val comments: Comments,                 // Информация о комментариях к записи, объект с полями:
    val copyright: Copyright,               // Источник материала, объект с полями:
    val reposts: Reposts,                   // Информация о репостах записи («Рассказать друзьям»).
    val postType: PostType,                 // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    val views: Views,                       // Информация о просмотрах записи
    val signerId: Long,                     // Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    val canPin: Boolean,                    // Информация о том, может ли текущий пользователь закрепить запись
    val canDelete: Boolean,                 // Информация о том, может ли текущий пользователь удалить запись
    val canEdit: Boolean,                   // Информация о том, может ли текущий пользователь редактировать запись
    val isPinned: Boolean,                  // Информация о том, что запись закреплена.
    val markedAsAds: Boolean,               // Информация о том, содержит ли запись отметку «реклама»
    val isFavorite: Boolean,                // Объект добавлен в закладки у текущего пользователя?
    val donut: Donut,                       // Информация о записи VK Donut:
    val postponedId: Long,                  // Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.
    val likes: Likes,                       // Источник материала, объект с полями:
) {

    data class Comments(
        val count: Int = 0,                 // количество комментариев;
        val canPost: Boolean = true,        // информация о том, может ли текущий пользователь комментировать запись
        val groupsCanPost: Boolean = true,  // информация о том, могут ли сообщества комментировать запись;
        val canClose: Boolean = true,       // может ли текущий пользователь закрыть комментарии к записи;
        val canOpen: Boolean = true,        // может ли текущий пользователь открыть комментарии к записи.
    )

    data class Donut(
        val usDonat: Boolean = true,        // запись доступна только платным подписчикам VK Donut;
        val paidDuration: Int = 0,          // время, в течение которого запись будет доступна только платным подписчикам VK Donut;
        val placeholder: String = "Вы не можете видеть запись, у Вас нет подписки",//заглушка для пользователей, которые не оформили подписку VK Donut.
        val canPublishFreeCopy: Boolean = false,//можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;
        val editMode: EditMode = EditMode.all//Информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
//                all — всю информацию о VK Donut.
//                duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.
    )

    data class Reposts(
        val count: Int = 0,                   // число пользователей, скопировавших запись;
        val userReposted: Boolean = false,    // наличие репоста от текущего пользователя.
    )

    data class Copyright(
        val id: Int = 0,
        val link: String = "",
        val name: String = "None",
        val type: String = "",
    )

    data class Views(
        val count: Int = 0,                 //число просмотров записи
    )

    data class Likes(
        val count: Int = 0,                 // число пользователей, которым понравилась запись;
        val userLikes: Boolean = false,     // наличие отметки «Мне нравится» от текущего пользователя
        val canLike: Boolean = true,        // информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
        val canPublish: Boolean = true,     // информация о том, может ли текущий пользователь сделать репост записи
    )
}