package strategy

import strategy.compress.CompressionStrategy
import strategy.encrypt.EncryptionStrategy

class Push(encryptionStrategy: EncryptionStrategy, compressionStrategy: CompressionStrategy): Notification(encryptionStrategy,compressionStrategy) {

    override fun send() {
        println("Push")
    }

}