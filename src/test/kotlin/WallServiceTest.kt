import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {
    private var posts = emptyArray<Post>()
    private val service = WallService()
    private val post: Post
        get() = Post(id = 1,
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
            postSource = Post.PostSource(),
            geo = Post.Geo(),
            copyHistory = null,
            signerId = 1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Post.Donut(editMode = EditMode.all),
            postponedId = 1,
            likes = Post.Likes(),
            attachments = arrayOf(VideoAttachments(VideoAttachments.Video(
                id = 1,
                ownerId = 100,
                title = "Кот-обормот",
                views = 10000,
                player = "URL"
            )))
        )

    @Test
    fun added() {
        // arrange

        //akt
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
                postSource = Post.PostSource(),
                geo = Post.Geo(),
                copyHistory = null,
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(editMode = EditMode.all),
                postponedId = 1,
                likes = Post.Likes(),
                attachments = arrayOf(VideoAttachments(VideoAttachments.Video(
                    id = 1,
                    ownerId = 100,
                    title = "Кот-обормот",
                    views = 10000,
                    player = "URL"
                )))))
        //assert
        assertNotEquals(1, result.id)
    }

    @Test
    fun updateTrue() {
        // arrange

        val service = WallService()
        service.add(
            Post(id = 1,
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
                postSource = Post.PostSource(),
                geo = Post.Geo(),
                copyHistory = null,
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(editMode = EditMode.all),
                postponedId = 1,
                likes = Post.Likes(),
                attachments = arrayOf(PhotoAttachments(PhotoAttachments.Photo(
                    id = 1,
                    ownerId = 100,
                    text = "Фотка",
                    date = 12121212
                )))))
        service.add(
            Post(id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1213456,
                text = "Pres F",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                reposts = Post.Reposts(),
                postType = PostType.Post,
                views = Post.Views(),
                postSource = Post.PostSource(),
                geo = Post.Geo(),
                copyHistory = null,
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(editMode = EditMode.all),
                postponedId = 1,
                likes = Post.Likes(),
                attachments = arrayOf(VideoAttachments(VideoAttachments.Video(
                    id = 1,
                    ownerId = 100,
                    title = "Кот-обормот",
                    views = 10000,
                    player = "URL"
                )))))
        service.add(
            Post(id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1213456,
                text = "Yeeep",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                reposts = Post.Reposts(),
                postType = PostType.Post,
                views = Post.Views(),
                postSource = Post.PostSource(),
                geo = Post.Geo(),
                copyHistory = null,
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(editMode = EditMode.all),
                postponedId = 1,
                likes = Post.Likes(),
                attachments = arrayOf(VideoAttachments(VideoAttachments.Video(
                    id = 1,
                    ownerId = 100,
                    title = "Кот-обормот",
                    views = 10000,
                    player = "URL"
                )))))

        //akt

        val update = Post(
            id = 0,
            ownerId = 1,
            fromId = 1,
            createdBy = 1,
            date = 1213456,
            text = "Kotlin - awesome",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = false,
            comments = Post.Comments(),
            copyright = Post.Copyright(),
            reposts = Post.Reposts(),
            postType = PostType.Post,
            views = Post.Views(),
            postSource = Post.PostSource(),
            geo = Post.Geo(),
            copyHistory = null,
            signerId = 1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = Post.Donut(editMode = EditMode.all),
            postponedId = 1,
            likes = Post.Likes(),
            attachments = arrayOf(VideoAttachments(VideoAttachments.Video(
                id = 1,
                ownerId = 100,
                title = "Кот-обормот",
                views = 10000,
                player = "URL"
            ))))

        val result = service.update(update)
        //assert

        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        //       arrange
        val service = WallService()
        service.add(
            Post(id = 1,
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
                postSource = Post.PostSource(),
                geo = Post.Geo(),
                copyHistory = null,
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(editMode = EditMode.all),
                postponedId = 1,
                likes = Post.Likes(),
                attachments = arrayOf(VideoAttachments(VideoAttachments.Video(
                    id = 1,
                    ownerId = 100,
                    title = "Кот-обормот",
                    views = 10000,
                    player = "URL"
                )))))
        service.add(
            Post(id = 1,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1213456,
                text = "Kavabanga-a-a",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                reposts = Post.Reposts(),
                postType = PostType.Post,
                views = Post.Views(),
                postSource = Post.PostSource(),
                geo = Post.Geo(),
                copyHistory = null,
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(editMode = EditMode.all),
                postponedId = 1,
                likes = Post.Likes(),
                attachments = arrayOf(LinkAttachments(LinkAttachments.Link(
                    url = "https://",
                    title = "Кот-обормот",
                    caption = "",
                    description = "Ссылка на кота-обормота"
                )))
            )
        )
        service.add(
            Post(id = 1,
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
                postSource = Post.PostSource(),
                geo = Post.Geo(),
                copyHistory = null,
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(editMode = EditMode.all),
                postponedId = 1,
                likes = Post.Likes(),
                attachments = arrayOf(VideoAttachments(VideoAttachments.Video(
                    id = 1,
                    ownerId = 100,
                    title = "Кот-обормот",
                    views = 10000,
                    player = "URL"
                )))
            )
        )
        //akt
        val result = service.update(
            Post(
                id = 3,
                ownerId = 1,
                fromId = 1,
                createdBy = 1,
                date = 1213456,
                text = "Go?",
                replyOwnerId = 1,
                replyPostId = 1,
                friendsOnly = false,
                comments = Post.Comments(),
                copyright = Post.Copyright(),
                reposts = Post.Reposts(),
                postType = PostType.Post,
                views = Post.Views(),
                postSource = Post.PostSource(),
                geo = Post.Geo(),
                copyHistory = null,
                signerId = 1,
                canPin = false,
                canDelete = false,
                canEdit = false,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = Post.Donut(editMode = EditMode.all),
                postponedId = 1,
                likes = Post.Likes(),
                attachments = arrayOf(VideoAttachments(VideoAttachments.Video(
                    id = 1,
                    ownerId = 100,
                    title = "Кот-обормот",
                    views = 10000,
                    player = "URL"
                )))
            )
        )
        //assert
        assertFalse(result)
    }
}
