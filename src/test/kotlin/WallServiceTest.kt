import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    private val service = WallService()

    @Test
    fun added() {

        val result = service.add(
            Post(
                id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1213456,
                text = "A-A-A-A-A-A-A-A-A-A-A-A-A-A-A-A-H",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                reposts = Post.Reposts(),
                postType = PostType.Post,
                views = Post.Views(),
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(editMode = EditMode.all),
                postponedId = 1,
                likes = Post.Likes()
            )
        )
        assertNotEquals(1, result.id)
    }

    @Test
    fun updateTrue() {
        service.add(
            Post(
                id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1213456,
                text = "A-A-A-A-A-A-A-A-A-A-A-A-A-A-A-A-H",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                reposts = Post.Reposts(),
                postType = PostType.Post,
                views = Post.Views(),
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(editMode = EditMode.all),
                postponedId = 1,
                likes = Post.Likes()
            )
        )
        service.add(
            Post(
                id = 2,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1213456,
                text = "Drrrrrrrrr",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                reposts = Post.Reposts(),
                postType = PostType.Post,
                views = Post.Views(),
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(editMode = EditMode.all),
                postponedId = 1,
                likes = Post.Likes()
            )
        )
        val result = service.update(
            Post(
                id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1213456,
                text = "Drrrrrrrrr",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                reposts = Post.Reposts(),
                postType = PostType.Post,
                views = Post.Views(),
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(editMode = EditMode.all),
                postponedId = 1,
                likes = Post.Likes()
            )
        )
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
//        service.clearPosts()
        service.add(
            Post(id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1213456,
                text = "Drrrrrrrrr",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                reposts = Post.Reposts(),
                postType = PostType.Post,
                views = Post.Views(),
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(editMode = EditMode.all),
                postponedId = 1,
                likes = Post.Likes()
            )
        )
        val result = service.update(
            Post(
                id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1213456,
                text = "Drrrrrrrrr",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                reposts = Post.Reposts(),
                postType = PostType.Post,
                views = Post.Views(),
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(editMode = EditMode.all),
                postponedId = 1,
                likes = Post.Likes()
            )
        )
        assertFalse(result)
    }
}