@file:Suppress("NAME_SHADOWING")


class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun createComment(comment: Comment): Boolean {
        for (post in posts) {
            if (post.id == comment.postId) {
                comments += comment
                return true
            }
        }
        if (comments.isEmpty()) throw  PostNotFoundException("Пост не найден")
        return false
    }


    fun add(post: Post): Post {
        val post = post.copy(id = uniqueId())

        posts += post
        println(posts.last())
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val postId = post.id
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                posts[index] = post.copy(
                    ownerId = post.ownerId,
                    date = post.date,
                    text = post.text
                )
                return true
            }
        }
        return false

    }

    private fun uniqueId(): Int {
        if (posts.isEmpty()) {
            return 1
        }
        return posts.last().id + 1
    }
}