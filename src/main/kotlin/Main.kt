@file:Suppress("NAME_SHADOWING")


fun main() {

    val origin = Post(
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

//    WallService.add(origin)
//    WallService.update(origin)

    val service = WallService()
    service.add(origin)
    service.update(origin)
    println(service.update(origin))
    println(origin.id)

}

