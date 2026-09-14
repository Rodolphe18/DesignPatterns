package strategy

import strategy.compress.CompressionStrategy
import strategy.encrypt.EncryptionStrategy

abstract class Notification(private val encryptionStrategy: EncryptionStrategy,private val compressionStrategy: CompressionStrategy) {

    abstract fun send()

    fun encrypt() {
        encryptionStrategy.encrypt()
    }

    fun compress() {
        compressionStrategy.compress()
    }
}