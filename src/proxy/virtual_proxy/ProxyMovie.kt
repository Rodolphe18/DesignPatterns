package proxy.virtual_proxy

class ProxyMovie(private val fileName:String): Video {

    private var video: Video? = null

    override fun play() {
        if (video == null) {
            video = Movie.createMovie(fileName)
        }
        video?.play()
    }
}