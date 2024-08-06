import WallService.addPost
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {
    @Before
    fun clearBeforeTest() {
        WallService.clearArray()
    }

//    @Test
//    fun addPostFalse() {
//        val  post = Post(0)
//        val  newPost = addPost(post)
//        val idNewPost = newPost.idPost
//        assertEquals(0,idNewPost)
//    }

    @Test
    fun addPostTrue() {
        val  post = Post(0)
        val  newPost = addPost(post)
        val idNewPost = newPost.idPost
        assertEquals(1,idNewPost)
    }
    @Test
    fun updatePP() {
        val  post = Post(2)

        val postAdded = WallService.addPost(post)
        val  resultUpdate = WallService.update(postAdded)
       // val  resultUpdate = WallService.update(post)


        assertTrue( resultUpdate)
    }
    @Test
    fun updateFalse() {
        val  post = Post(2)

        val postAdded = WallService.addPost(post)
        val  resultUpdate = WallService.update(post)
        // val  resultUpdate = WallService.update(post)


        assertFalse( resultUpdate)
    }



}