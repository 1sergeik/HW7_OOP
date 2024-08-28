import attachments.*

data class Post(
    val idPost: Int = 0, // Эдентификатор поста
    val idOwner: Int = 0, // Эдентификатор владельца стены
    val idFromm: Int = 0, // Эдентификатор автора записи
    var textPost: String? = null, // Текст поста
    val datePostt: String = "01-01-2001", // Дата публикации
    val copyright: String = "", // Источник материяла
    var markedAsAds: Boolean? = null, // Содержит ли запись рекламу
    var canPin: Boolean = false, // Может ли текущий пользователь закрепит запись
    var canDelete: Boolean = false, // Может ли текущий пользователь удалить запись
    var canEdit: Boolean = true, // Может ли текущий пользователь изменить запись
    var likes: Int? = null, // Информация о лайках к записи
    var comments : Comments = Comments(), //
    var attachments: List<Attachment> = listOf()
)
class Comments(
    var countComments: Int = 0, // Количество комментариев
    var canPost: Boolean = true, // Может ли текущий пользователь комментировать запись
    var groupsCanPost: Boolean = true, // Могул ли сообщества комментировать запись
    var canClose: Boolean = true, // Может ли текущий пользователь закрыть комментарии к записи
    var canOpen: Boolean = true // Может ли текущий пользователь открыть комментарии к записи
)

object WallService {
    private var posts = emptyArray<Post>()
    private var postId = 1 // добавить уникальный id для поста

    fun addPost(post: Post): Post {
        posts += post.copy(idPost = postId++) //задать уникальный id для поста, а copy -  потому что кладешь копию в массив
        return posts.last() // а тут я бы уже возвращал бы последний положенный пост, а не пост - т.е по сути возвращал бы последний добавленный в массив Пост))
    }

//    fun upDate(postInput: Post): Boolean {
//        for ( i in posts) {
//           if (postInput.idPost == i.idPost){
//               posts[posts.indexOf(i)] = postInput  //= postInput.copy()
//               return true
//           }
//        }
//        return false
//
//    }

    fun update(postInput: Post): Boolean {
        for ((index, post) in posts.withIndex()){
            if(postInput.idPost == post.idPost) {
                posts[index] = postInput.copy()
                return true
            }

        }
        return  false
    }
    fun printArray(){
        for (i in posts){
            println(i)
        }
    }
    fun clearArray(){
        posts = emptyArray<Post>()
        postId = 1
    }
}


fun main() {
    val photo = Photo(id = 1)
    val audio = Audio(id = 2)
    val video = Video(id = 3)
    val file = File(id = 4)
    val post = Post(attachments = listOf(PhotoAttachment(photo),AudioAttachment(audio), VideoAttachment(video), FileAttachment(file)))


//    val post1 = WallService.addPost(Post(likes = 10))
//
//    val post2 = Post(idPost = 0, likes = 5)
//    WallService.addPost(post2)
//    WallService.printArray()
//
//    WallService.update(Post(idPost = 1, idOwner = 1))
//    WallService.printArray()
}