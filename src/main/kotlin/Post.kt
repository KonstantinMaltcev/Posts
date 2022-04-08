import DataType.*
import Platform.ANDROID
import PostSourceType.*

data class Post(
    internal val id: Int,                   // Идентификатор записи.
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
    val postSource: PostSource?,            // Информация о способе размещения записи
    val geo: Geo?,                          // Информация о местоположении
    val copyHistory: Array<Reposts>?,       // Массив, содержащий историю репостов для записи.
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
    val attachments: Array<Attachments>?    // Информация о медиавложениях
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
        val editMode: EditMode = EditMode.all,//Информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
            /**
             * all — всю информацию о VK Donut.
             * duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.
             * */
    )

    data class PostSource(
        val type: PostSourceType = VK,
        val platform: Platform = ANDROID,
        val data: DataType = LIKE,
        val url: String = "",
    )

    data class Reposts(
        val count: Int = 0,                   // число пользователей, скопировавших запись;
        val userReposted: Boolean = false,    // наличие репоста от текущего пользователя.
    )

    class Geo(
        val type: String = "None",                       // тип места
        val coordinates: String = "",                // координаты места
        val place: String = "",                     // описание места (если оно добавлено)
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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (id != other.id) return false
        if (ownerId != other.ownerId) return false
        if (fromId != other.fromId) return false
        if (createdBy != other.createdBy) return false
        if (date != other.date) return false
        if (text != other.text) return false
        if (replyOwnerId != other.replyOwnerId) return false
        if (replyPostId != other.replyPostId) return false
        if (friendsOnly != other.friendsOnly) return false
        if (comments != other.comments) return false
        if (copyright != other.copyright) return false
        if (reposts != other.reposts) return false
        if (postType != other.postType) return false
        if (views != other.views) return false
        if (postSource != other.postSource) return false
        if (geo != other.geo) return false
        if (!copyHistory.contentEquals(other.copyHistory)) return false
        if (signerId != other.signerId) return false
        if (canPin != other.canPin) return false
        if (canDelete != other.canDelete) return false
        if (canEdit != other.canEdit) return false
        if (isPinned != other.isPinned) return false
        if (markedAsAds != other.markedAsAds) return false
        if (isFavorite != other.isFavorite) return false
        if (donut != other.donut) return false
        if (postponedId != other.postponedId) return false
        if (likes != other.likes) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + ownerId.hashCode()
        result = 31 * result + fromId.hashCode()
        result = 31 * result + createdBy.hashCode()
        result = 31 * result + date
        result = 31 * result + text.hashCode()
        result = 31 * result + replyOwnerId.hashCode()
        result = 31 * result + replyPostId.hashCode()
        result = 31 * result + friendsOnly.hashCode()
        result = 31 * result + comments.hashCode()
        result = 31 * result + copyright.hashCode()
        result = 31 * result + reposts.hashCode()
        result = 31 * result + postType.hashCode()
        result = 31 * result + views.hashCode()
        result = 31 * result + postSource.hashCode()
        result = 31 * result + geo.hashCode()
        result = 31 * result + copyHistory.contentHashCode()
        result = 31 * result + signerId.hashCode()
        result = 31 * result + canPin.hashCode()
        result = 31 * result + canDelete.hashCode()
        result = 31 * result + canEdit.hashCode()
        result = 31 * result + isPinned.hashCode()
        result = 31 * result + markedAsAds.hashCode()
        result = 31 * result + isFavorite.hashCode()
        result = 31 * result + donut.hashCode()
        result = 31 * result + postponedId.hashCode()
        result = 31 * result + likes.hashCode()
        return result
    }
}


