package strategy.compress

class GzipCompression: CompressionStrategy {
    override fun compress() {
        println("Gzip Compression")
    }
}