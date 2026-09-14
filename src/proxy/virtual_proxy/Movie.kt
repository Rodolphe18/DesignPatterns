package proxy.virtual_proxy

class Movie private constructor(private val fileName: String):Video {

    override fun play() {
        println("Video is playing $fileName")
    }

    private fun loadVideo() {
        println("Video is loading from server")
        Thread.sleep(3000)
    }

    companion object {

        fun createMovie(fileName:String): Movie {
            val movie = Movie(fileName)
            movie.loadVideo()
            return movie
        }

    }
}