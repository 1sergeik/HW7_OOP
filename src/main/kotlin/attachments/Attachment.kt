package attachments

abstract class  Attachment {
    abstract var type: String

}
class PhotoAttachment(photo: Photo) : Attachment() {
    override var type = photo.type

}

class Photo (
    override var type: String = "Photo",
    val id: Int? = null,
    val albumId: Int? = null,
    val ownerId: Int? = null,
    val text: String? = null,
    val width: Int? = null,
    val height: Int? = null

) : Attachment()

class Audio(
    override var type: String = "Audio",
    val id: Int? = null,
    val ownerId: Int? = null,
    val artist: String? = null,
    val title: String? = null,
    val duration: Int? = null,
    val url: String? = null,
    val noSearch: Boolean? = null,
    val isHd: Boolean? = false
) : Attachment()

class AudioAttachment(audio: Audio) : Attachment() {
    override var type: String = audio.type
}

class Video(
    override var type: String = "Video",
    val id: Int? = null,
    val ownerId: Int? = null,
    val description: String? = null,
    val title: String? = null,
    val duration: Int? = null,
    val url: String? = null,
    val noSearch: Boolean? = null,
    val player: String? = null

): Attachment()

class VideoAttachment(video:Video) : Attachment() {
    override var type: String = video.type
}

class File(
    override var type: String = "File",
    val id: Int? = null,
    val ownerId: Int? = null,
    val description: String? = null,
    val title: String? = null,
    val size: Int? = null,
    val url: String? = null,
    val noSearch: Boolean? = null,
    val typefile: String? = null,

): Attachment()

class FileAttachment(file:File) : Attachment() {
    override var type: String = file.type
}