data class Post(
    internal val id: Long,
    val ownerId: Long,
    val fromId: Long,
    val createdBy: Long,
    val date: Int,
    val text: String,
    val replyOwnerId: Long,
    val replyPostId: Long,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: Copyright,
    val reposts: Reposts,
    val postType: PostType,
    val views: Views,
    val signerId: Long,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedId: Long,
    val likes: Likes,
) {

    data class Comments(
        val count: Int = 0,
        val canPost: Boolean = true,
        val groupsCanPost: Boolean = true,
        val canClose: Boolean = true,
        val canOpen: Boolean = true,
    )

    data class Donut(
        val usDonat: Boolean = true,
        val paidDuration: Int = 0,
        val placeholder: String = "Вы не можете видеть запись, у Вас нет подписки",
        val canPublishFreeCopy: Boolean = false,
        val editMode: EditMode,
    )

    data class Reposts(
        val count: Int = 0,
        val userReposted: Boolean = false,
    )

    data class Copyright(
        val id: Int = 0,
        val link: String = "",
        val name: String = "None",
        val type: String = "",
    )

    data class Views(
        val count: Int = 0,
    )

    data class Likes(
        val count: Int = 0,
        val userLikes: Boolean = false,
        val canLike: Boolean = true,
        val canPublish: Boolean = true,
    )
}