package strategy

import strategy.compress.CompressionStrategy
import strategy.encrypt.EncryptionStrategy

class Email(encryptionStrategy: EncryptionStrategy, compressionStrategy: CompressionStrategy): Notification(encryptionStrategy,compressionStrategy) {

    override fun send() {
        println("Email")
    }

}