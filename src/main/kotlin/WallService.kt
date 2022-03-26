@file:Suppress("NAME_SHADOWING")

import java.util.*

class WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {

        val randomValues = Random().nextInt(1_000_000_000)
        val post = post.copy(id = randomValues.toLong())
        posts += post
        println(posts.last())
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val postId = post.component1()
        val postNew = post
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                posts[index] = post.copy(
                    ownerId = postNew.ownerId,
//                    fromId = postNew.fromId, Не обновляем ID владельца записи
                    createdBy = postNew.createdBy,
                    text = postNew.text,
                    replyOwnerId = postNew.replyOwnerId,
                    replyPostId = postNew.replyPostId,
                    friendsOnly = postNew.friendsOnly,
                    comments = postNew.comments,
                    copyright = postNew.copyright,
                    reposts = postNew.reposts,
                    postType = postNew.postType,
                    views = postNew.views,
                    signerId = postNew.signerId,
                    canPin = postNew.canPin,
                    canDelete = postNew.canDelete,
                    canEdit = postNew.canEdit,
                    isPinned = postNew.isPinned,
                    markedAsAds = postNew.markedAsAds,
                    isFavorite = postNew.isFavorite,
                    donut = postNew.donut,
                    postponedId = postNew.postponedId,
                    likes = postNew.likes,
                )
                println(posts[index])


                return true
            }
        }
        return false

    }
}
