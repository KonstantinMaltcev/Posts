@file:Suppress("NAME_SHADOWING")

 class WallService {
    private var posts = emptyArray<Post>()
    private var randomValues = 0
     fun add(post: Post): Post {
//        val uniqueIdSet = mutableSetOf<Int>()

//        val post = post.copy(id = uniqueIdGenerate(randomValues, uniqueIdSet))
         val post = post.copy(id = 1) // для теста Update

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

//    private fun uniqueIdGenerate(
//        randomValues: Int,
//        uniqueIdSet: MutableSet<Int>,
//    ): Long {
//        while (true) {
//            val randomValues = (1..3).shuffled().last()
//            println(randomValues)
//            if (uniqueIdSet.contains(randomValues)) continue
//            else {
//                val keyId = randomValues
//                uniqueIdSet.add(keyId)
//            }
//            break
//        }
//        return randomValues.toLong()
//    }
 }
